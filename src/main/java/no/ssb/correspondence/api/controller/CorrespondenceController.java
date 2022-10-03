package no.ssb.correspondence.api.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import no.altinn.schemas.services.intermediary.receipt._2009._10.ReceiptExternal;
import no.altinn.schemas.services.intermediary.receipt._2009._10.ReceiptStatusEnum;
import no.altinn.schemas.services.serviceengine.correspondence._2014._10.StatusV2;
import no.altinn.schemas.services.serviceengine.correspondence._2016._02.CorrespondenceStatusInformation;
import no.altinn.schemas.services.serviceengine.correspondence._2016._02.CorrespondenceStatusResultV3;
import no.altinn.services.serviceengine.correspondence._2009._10.ICorrespondenceAgencyExternalBasicInsertCorrespondenceBasicV2AltinnFaultFaultFaultMessage;
import no.ssb.correspondence.api.consumer.CorrespondenceAgencyExternalBasicService;
import no.ssb.domene.altinn.correspondence.AltinnMessage;
import no.ssb.domene.altinn.correspondence.CorrespondenceReceiptStatusCode;
import no.ssb.domene.altinn.correspondence.CorrespondenceResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by runesr on 02.02.2016.
 */
@Api("Altinn-Correspondence-api")
@RestController
@RequestMapping("")
public class CorrespondenceController {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());
    private static final String HEADER_APIKEY = "X-SSB-APIKEY";
    @Value("${api-keys}")
    private List<String> acceptedApiKeys;

    @Autowired
    private CorrespondenceAgencyExternalBasicService correspondenceAgencyExternalBasicService;

    @ApiOperation("Finn status på melding basert på meldingsreferanse")
    @RequestMapping(value = "/correspondenceStatus/{reference}", method = RequestMethod.GET)
    public ResponseEntity<?> getStatusFromAltinnForReference(@PathVariable String reference, @RequestHeader HttpHeaders header) {
        if (!authorizeRequest(header)) {
            return new ResponseEntity<>("Unauthorized. Api-key er ugyldig eller mangler", HttpStatus.UNAUTHORIZED);
        }
        logger.debug("reference: {}", reference);
        CorrespondenceStatusResultV3 correspondenceStatusResult = correspondenceAgencyExternalBasicService.getStatus(reference);
        return new ResponseEntity<>(correspondenceStatusResult, HttpStatus.OK);
    }

    @ApiOperation("Finn ut om det er sendt ut varsel fra Altinn for melding med gitt meldingsreferanse")
    @RequestMapping(value ="varslet/{reference}", method = RequestMethod.GET)
    public ResponseEntity<?> getVarslet(@PathVariable String reference, @RequestHeader HttpHeaders header) {
        if (!authorizeRequest(header)) {
            logger.info("Ugyldig api-key");
            return new ResponseEntity<>("Unauthorized. Api-key er ugyldig eller mangler", HttpStatus.UNAUTHORIZED);
        }
        logger.debug("sjekk om {} er varslet", reference);
        boolean erVarslet = false;
        ResponseEntity<CorrespondenceStatusResultV3> correspondenceStatusResult = (ResponseEntity<CorrespondenceStatusResultV3>) this.getStatusFromAltinnForReference(reference, header);
        CorrespondenceStatusInformation correspondenceStatusInformation = correspondenceStatusResult.getBody().getCorrespondenceStatusInformation().getValue();
        erVarslet = varselSendt(correspondenceStatusInformation);
        return new ResponseEntity<>(erVarslet, HttpStatus.OK);
    }

    private boolean varselSendt(CorrespondenceStatusInformation correspondenceStatusInformation) {
        List<StatusV2> statusV2List = correspondenceStatusInformation.getCorrespondenceStatusDetailsList().getValue().getStatusV2();
        logger.info("varsel-status: {}", !statusV2List.get(0).getNotifications().getValue().getNotification().isEmpty());
        return !statusV2List.isEmpty() && !statusV2List.get(0).getNotifications().getValue().getNotification().isEmpty();
    }

    @RequestMapping(value = "/fakestatus/{reference}", method = RequestMethod.GET)
    public ResponseEntity<CorrespondenceStatusResultV3> getFakeStatusForReference(@PathVariable String reference) {
        logger.info("reference: {}", reference);
        return new ResponseEntity<>(correspondenceAgencyExternalBasicService.getFakeStatus(reference), HttpStatus.OK);
    }

    @ApiOperation("Sende melding til Altinn")
    @RequestMapping(value = "/correspondence", method = RequestMethod.POST)
    public ResponseEntity<?> sendCorrespondence(@RequestBody AltinnMessage altinnMessage, @RequestHeader HttpHeaders header) {
        if (!authorizeRequest(header)) {
            return new ResponseEntity<>("Unauthorized. Api-key er ugyldig eller mangler", HttpStatus.UNAUTHORIZED);
        }
        logger.info("Sending altinnMessage for: {} \n {}", altinnMessage.getReportee(), altinnMessage.getMessageHeader());
        ReceiptExternal receiptExternal = null;
        try {
            receiptExternal = correspondenceAgencyExternalBasicService.sendCorrespondence(altinnMessage);
            logger.info("Sendt altinnMessage for {}", altinnMessage.getReportee());
        } catch (ICorrespondenceAgencyExternalBasicInsertCorrespondenceBasicV2AltinnFaultFaultFaultMessage iCorrespondenceAgencyExternalBasicInsertCorrespondenceBasicV2AltinnFaultFaultFaultMessage) {
            logger.error(iCorrespondenceAgencyExternalBasicInsertCorrespondenceBasicV2AltinnFaultFaultFaultMessage.getMessage());
            logger.error("AltinnErrorMessage: " + iCorrespondenceAgencyExternalBasicInsertCorrespondenceBasicV2AltinnFaultFaultFaultMessage.getFaultInfo().getAltinnErrorMessage().getValue());
            logger.error("AltinnExtendedErrorMessage: " + iCorrespondenceAgencyExternalBasicInsertCorrespondenceBasicV2AltinnFaultFaultFaultMessage.getFaultInfo().getAltinnExtendedErrorMessage().getValue());
            logger.error("AltinnLocalizedErrorMessage: " + iCorrespondenceAgencyExternalBasicInsertCorrespondenceBasicV2AltinnFaultFaultFaultMessage.getFaultInfo().getAltinnLocalizedErrorMessage().getValue());
            iCorrespondenceAgencyExternalBasicInsertCorrespondenceBasicV2AltinnFaultFaultFaultMessage.printStackTrace();
            CorrespondenceResponse response = new CorrespondenceResponse();
            response.setReceiptStatusCode(CorrespondenceReceiptStatusCode.UNEXPECTED_ERROR);
            response.setReceiptStatusText(iCorrespondenceAgencyExternalBasicInsertCorrespondenceBasicV2AltinnFaultFaultFaultMessage.getFaultInfo().getAltinnErrorMessage().getValue());
            return new ResponseEntity<>(response, HttpStatus.OK);
        }

        CorrespondenceResponse response = createCorrespondenceResponse(receiptExternal);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @ApiOperation("Faker å sende melding til Altinn")
    @RequestMapping(value = "/fakecorrespondence", method = RequestMethod.POST)
    public ResponseEntity<?> fakeSendCorrespondence(@RequestBody AltinnMessage altinnMessage, @RequestHeader HttpHeaders header) {
        if (!authorizeRequest(header)) {
            return new ResponseEntity<>("Unauthorized. Api-key er ugyldig eller mangler", HttpStatus.UNAUTHORIZED);
        }
        logger.debug("Faker sending altinnMessage for: {}", altinnMessage.getReportee());
        CorrespondenceResponse response = new CorrespondenceResponse();
        response.setReceiptStatusCode(CorrespondenceReceiptStatusCode.OK);
        response.setReceiptStatusText("Faket sendt OK");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @ApiOperation(value = "Ping metode for å kunne sjekke at API'et er oppe")
    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    public ResponseEntity<?> ping() {
        return new ResponseEntity<>("pong", HttpStatus.OK);
    }

    private CorrespondenceResponse createCorrespondenceResponse(ReceiptExternal receiptExternal) {
        CorrespondenceResponse response = new CorrespondenceResponse();
        response.setReceiptStatusCode(convertReceiptExternalStatus(receiptExternal));
        response.setReceiptStatusText(receiptExternal.getReceiptText().getValue());
        return response;
    }

    private CorrespondenceReceiptStatusCode convertReceiptExternalStatus(ReceiptExternal receiptExternal) {
        ReceiptStatusEnum status = receiptExternal.getReceiptStatusCode();
        String receiptText = receiptExternal.getReceiptText().getValue();

        if (status == ReceiptStatusEnum.REJECTED
                && receiptText.contains("the user has opted out from receiving any correspondences")) {
            return CorrespondenceReceiptStatusCode.RESERVED;
        } else if (status == ReceiptStatusEnum.REJECTED) {
            return CorrespondenceReceiptStatusCode.REJECTED;
        } else if (status == ReceiptStatusEnum.OK) {
            return CorrespondenceReceiptStatusCode.OK;
        } else if (status == ReceiptStatusEnum.UN_EXPECTED_ERROR) {
            return CorrespondenceReceiptStatusCode.UNEXPECTED_ERROR;
        } else if (status == ReceiptStatusEnum.VALIDATION_FAILED) {
            return CorrespondenceReceiptStatusCode.VALIDATION_FAILED;
        }
        return CorrespondenceReceiptStatusCode.NOT_SET;
    }

    private boolean authorizeRequest(HttpHeaders header) {
        if (header.get(HEADER_APIKEY) == null) {
            return false;
        }
        return acceptedApiKeys.contains(header.get(HEADER_APIKEY).get(0));

    }
}
