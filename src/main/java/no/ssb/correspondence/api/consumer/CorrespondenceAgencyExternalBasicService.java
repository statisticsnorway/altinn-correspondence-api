package no.ssb.correspondence.api.consumer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import no.altinn.schemas.serviceengine.formsengine._2009._10.TransportType;
import no.altinn.schemas.services.intermediary.receipt._2009._10.ReceiptExternal;
import no.altinn.schemas.services.serviceengine.correspondence._2010._10.InsertCorrespondenceV2;
import no.altinn.schemas.services.serviceengine.correspondence._2013._11.ArrayOfNotification;
import no.altinn.schemas.services.serviceengine.correspondence._2013._11.Notification;
import no.altinn.schemas.services.serviceengine.correspondence._2014._10.ArrayOfStatusChangeV2;
import no.altinn.schemas.services.serviceengine.correspondence._2014._10.ArrayOfStatusV2;
import no.altinn.schemas.services.serviceengine.correspondence._2014._10.StatusChangeV2;
import no.altinn.schemas.services.serviceengine.correspondence._2014._10.StatusV2;
import no.altinn.schemas.services.serviceengine.correspondence._2016._02.CorrespondenceStatusFilterV3;
import no.altinn.schemas.services.serviceengine.correspondence._2016._02.CorrespondenceStatusInformation;
import no.altinn.schemas.services.serviceengine.correspondence._2016._02.CorrespondenceStatusResultV3;
import no.altinn.schemas.services.serviceengine.correspondence._2016._02.SdpStatusSearchOptions;
import no.altinn.schemas.services.serviceentity._2014._10.CorrespondenceStatusTypeV2;
import no.altinn.services.serviceengine.correspondence._2009._10.ICorrespondenceAgencyExternalBasic;
import no.altinn.services.serviceengine.correspondence._2009._10.ICorrespondenceAgencyExternalBasicGetCorrespondenceStatusDetailsBasicV3AltinnFaultFaultFaultMessage;
import no.altinn.services.serviceengine.correspondence._2009._10.ICorrespondenceAgencyExternalBasicInsertCorrespondenceBasicV2AltinnFaultFaultFaultMessage;
import no.ssb.correspondence.api.factory.AltinnObjectFactory;
import no.ssb.correspondence.api.util.CorrespondenceUtil;
import no.ssb.domene.altinn.correspondence.AltinnMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.GregorianCalendar;

/**
 * Created by runesr on 02.02.2016.
 */
public class CorrespondenceAgencyExternalBasicService {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${altinn.correspondence.systemuser}")
    private String systemUser;
    @Value("${altinn.correspondence.systemusercode}")
    private String systemUserCode;
    @Value("${altinn.correspondence.passord}")
    private String passord;
    @Value("${altinn.correspondence.servicecode}")
    private String serviceCode;
    @Value("${altinn.correspondence.serviceeditioncode}")
    private int serviceEdtionCode;

    private AltinnObjectFactory altinnObjectFactory;

    @Autowired
    private ICorrespondenceAgencyExternalBasic iCorrespondenceAgencyExternalBasic;

    public CorrespondenceAgencyExternalBasicService() {
        altinnObjectFactory = new AltinnObjectFactory();
    }

    public ReceiptExternal sendCorrespondence(AltinnMessage altinnMessage) throws ICorrespondenceAgencyExternalBasicInsertCorrespondenceBasicV2AltinnFaultFaultFaultMessage {
        altinnMessage.getNotifications().forEach(n -> logger.info("notification: {}, transportationtype: {}", n.getReceiverAddress(), n.getTransportType()));
        InsertCorrespondenceV2 correspondence = CorrespondenceBuilder.buildCorrespondence(altinnMessage);
        logger.info("correspondence bygd: {}", (correspondence.getReportee() != null ? correspondence.getReportee().toString() : "null"));
        correspondence.setServiceCode(altinnObjectFactory.createInsertCorrespondenceV2ServiceCode(serviceCode));
        correspondence.setServiceEdition(altinnObjectFactory.createInsertCorrespondenceV2ServiceEdition(String.valueOf(serviceEdtionCode)));

        logCorrespondenceAsJson(correspondence);
        logger.info(CorrespondenceUtil.correspondenceV2AsString(correspondence));

        return iCorrespondenceAgencyExternalBasic.insertCorrespondenceBasicV2(systemUser, passord, systemUserCode, altinnMessage.getMessageReference(), correspondence);
    }

    public CorrespondenceStatusResultV3 getStatus(String reference) {
        CorrespondenceStatusFilterV3 statusFilterV3 = altinnObjectFactory.createCorrespondenceStatusFilterV3();
        statusFilterV3.setServiceCode(serviceCode);
        statusFilterV3.setServiceEditionCode(serviceEdtionCode);
        statusFilterV3.setSendersReference(altinnObjectFactory.createCorrespondenceStatusFilterV3SendersReference(reference));
        SdpStatusSearchOptions sdpStatusSearchOptions = altinnObjectFactory.createSdpStatusSearchOptions();
        sdpStatusSearchOptions.setIncludeCorrespondence(Boolean.TRUE);
        statusFilterV3.setSdpSearchOptions(altinnObjectFactory.createCorrespondenceStatusFilterV3SdpSearchOptions(sdpStatusSearchOptions));

        CorrespondenceStatusResultV3 statusResult = null;
        try {
            statusResult = iCorrespondenceAgencyExternalBasic.getCorrespondenceStatusDetailsBasicV3(systemUser, passord, statusFilterV3);
        } catch (ICorrespondenceAgencyExternalBasicGetCorrespondenceStatusDetailsBasicV3AltinnFaultFaultFaultMessage iCorrespondenceAgencyExternalBasicGetCorrespondenceStatusDetailsBasicV3AltinnFaultFaultFaultMessage) {
            iCorrespondenceAgencyExternalBasicGetCorrespondenceStatusDetailsBasicV3AltinnFaultFaultFaultMessage.printStackTrace();
            logger.debug(iCorrespondenceAgencyExternalBasicGetCorrespondenceStatusDetailsBasicV3AltinnFaultFaultFaultMessage.getFaultInfo().getAltinnErrorMessage().getValue());
        }

        return statusResult;
    }

    public CorrespondenceStatusResultV3 getFakeStatus(String reference) {
        CorrespondenceStatusResultV3 statusResultV3 = altinnObjectFactory.createCorrespondenceStatusResultV3();
        CorrespondenceStatusInformation statusInformation = altinnObjectFactory.createCorrespondenceStatusInformation();
        statusInformation.setLimitReached(Boolean.FALSE);
        ArrayOfStatusV2 arrayOfStatusV2 = altinnObjectFactory.createArrayOfStatusV2();
        StatusV2 statusV2 = altinnObjectFactory.createStatusV2();
        statusV2.setReportee(altinnObjectFactory.createStatusV2Reportee("934876543"));
        statusV2.setSendersReference(altinnObjectFactory.createStatusV2SendersReference(reference));
        statusV2.setCreatedDate(createDateAsXmlGregorianCalendar());

        addStatusChanges(statusV2);
        addNotifications(statusV2);

        arrayOfStatusV2.getStatusV2().add(statusV2);
        statusInformation.setCorrespondenceStatusDetailsList(altinnObjectFactory.createArrayOfStatusV2(arrayOfStatusV2));
        statusResultV3.setCorrespondenceStatusInformation(altinnObjectFactory.createCorrespondenceStatusInformation(statusInformation));

        return statusResultV3;
    }

    private void addNotifications(StatusV2 statusV2) {
        ArrayOfNotification arrayOfNotification = altinnObjectFactory.createArrayOfNotification();
        Notification notificationEmail = altinnObjectFactory.createNotificationStatus();
        notificationEmail.setTransportType(TransportType.EMAIL);
        notificationEmail.setSentDate(altinnObjectFactory.createNotificationStatusSentDate(createDateAsXmlGregorianCalendar()));
        notificationEmail.setRecipient(altinnObjectFactory.createNotificationStatusRecipient("test@mottaker.no"));
        Notification notificationSMS = altinnObjectFactory.createNotificationStatus();
        notificationEmail.setTransportType(TransportType.SMS);
        notificationEmail.setSentDate(altinnObjectFactory.createNotificationStatusSentDate(createDateAsXmlGregorianCalendar()));
        notificationEmail.setRecipient(altinnObjectFactory.createNotificationStatusRecipient("+4799887766"));
        arrayOfNotification.getNotification().add(notificationEmail);
        arrayOfNotification.getNotification().add(notificationSMS);
        statusV2.setNotifications(altinnObjectFactory.createArrayOfNotification(arrayOfNotification));
    }

    private void addStatusChanges(StatusV2 statusV2) {
        ArrayOfStatusChangeV2 arrayOfStatusChangeV2 = altinnObjectFactory.createArrayOfStatusChangeV2();
        StatusChangeV2 statusChangeV2Created = altinnObjectFactory.createStatusChangeV2();
        statusChangeV2Created.setStatusDate(createDateAsXmlGregorianCalendar());
        statusChangeV2Created.setStatusType(CorrespondenceStatusTypeV2.CREATED);
        StatusChangeV2 statusChangeV2Read = altinnObjectFactory.createStatusChangeV2();
        statusChangeV2Read.setStatusDate(createDateAsXmlGregorianCalendar());
        statusChangeV2Read.setStatusType(CorrespondenceStatusTypeV2.READ);
        arrayOfStatusChangeV2.getStatusChangeV2().add(statusChangeV2Created);
        arrayOfStatusChangeV2.getStatusChangeV2().add(statusChangeV2Read);
        statusV2.setStatusChanges(altinnObjectFactory.createArrayOfStatusChangeV2(arrayOfStatusChangeV2));
    }

    private XMLGregorianCalendar createDateAsXmlGregorianCalendar() {
        XMLGregorianCalendar time = null;
        try {
            GregorianCalendar now = new GregorianCalendar();
            time =  DatatypeFactory.newInstance().newXMLGregorianCalendar(now);
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        return time;
    }

    private void logCorrespondenceAsJson(InsertCorrespondenceV2 correspondence) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            String jsonCorrespondence = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(correspondence);
            logger.info("Correspondence: \n{}", jsonCorrespondence);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

}
