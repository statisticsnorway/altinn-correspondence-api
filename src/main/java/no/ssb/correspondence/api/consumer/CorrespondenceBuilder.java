package no.ssb.correspondence.api.consumer;

import no.altinn.schemas.serviceengine.formsengine._2009._10.TransportType;
import no.altinn.schemas.services.serviceengine.correspondence._2010._10.AttachmentsV2;
import no.altinn.schemas.services.serviceengine.correspondence._2010._10.ExternalContentV2;
import no.altinn.schemas.services.serviceengine.correspondence._2010._10.InsertCorrespondenceV2;
import no.altinn.schemas.services.serviceengine.correspondence._2016._02.SdpOptions;
import no.altinn.schemas.services.serviceengine.correspondence._2016._02.SdpSetting;
import no.altinn.schemas.services.serviceengine.notification._2009._10.*;
import no.altinn.services.serviceengine.reporteeelementlist._2010._10.BinaryAttachmentExternalBEV2List;
import no.altinn.services.serviceengine.reporteeelementlist._2010._10.BinaryAttachmentV2;
import no.ssb.correspondence.api.factory.AltinnObjectFactory;
import no.ssb.domene.altinn.correspondence.AltinnMessage;
import no.ssb.domene.altinn.correspondence.Attachment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by runesr on 03.08.2016.
 */
public class CorrespondenceBuilder {
    private static final Logger logger = LoggerFactory.getLogger(CorrespondenceBuilder.class);

    private static AltinnObjectFactory altinnObjectFactory = new AltinnObjectFactory();

    public static InsertCorrespondenceV2 buildCorrespondence(AltinnMessage altinnMessage) {
        InsertCorrespondenceV2 correspondence = altinnObjectFactory.createInsertCorrespondenceV2();
        correspondence.setReportee(altinnObjectFactory.createInsertCorrespondenceV2Reportee(altinnMessage.getReportee()));

        /** Correspondences.Correspondence.Content */
        ExternalContentV2 externalContentV2 = altinnObjectFactory.createExternalContentV2();
        externalContentV2.setLanguageCode(altinnObjectFactory.createExternalContentV2LanguageCode(altinnMessage.getLanguageCode().value()));
        externalContentV2.setMessageTitle(altinnObjectFactory.createExternalContentV2MessageTitle(altinnMessage.getMessageHeader()));
        externalContentV2.setMessageBody(altinnObjectFactory.createExternalContentV2MessageBody(altinnMessage.getMessageSummary()));
        logger.info("Messagebody: " + externalContentV2.getMessageBody().getValue());

        /** Correspondences.Correspondence.Content.Attachments */
        AttachmentsV2 attachmentsV2 = altinnObjectFactory.createAttachmentsV2();
        addAttachments(altinnMessage, attachmentsV2);
        externalContentV2.setAttachments(altinnObjectFactory.createExternalContentV2Attachments(attachmentsV2));


        correspondence.setContent(altinnObjectFactory.createInsertCorrespondenceV2Content(externalContentV2));


        /** notifications */
        NotificationBEList notificationBEList = altinnObjectFactory.createNotificationBEList();
        addNotifications(altinnMessage, notificationBEList);
        correspondence.setNotifications(altinnObjectFactory.createInsertCorrespondenceV2Notifications(notificationBEList));

        if (altinnMessage.isReporteePerson() && altinnMessage.getSdpOption() != null) {
            correspondence.setIsReservable(altinnObjectFactory.createInsertCorrespondenceV2IsReservable(Boolean.TRUE));
            correspondence.setSdpOptions(altinnObjectFactory.createInsertCorrespondenceV2SdpOptions(addSdpOptions(altinnMessage)));
        }

        return correspondence;
    }

    private static SdpOptions addSdpOptions(AltinnMessage altinnMessage) {
        SdpOptions sdpOptions = altinnObjectFactory.createSdpOptions();
        sdpOptions.setPrimaryDocumentFileName(altinnMessage.getAttachments().get(0).getFilename());
        sdpOptions.setSdpSetting(SdpSetting.fromValue(altinnMessage.getSdpOption()));
        logger.info("sdpOption: file={}, sdpSetting={}", sdpOptions.getPrimaryDocumentFileName(), sdpOptions.getSdpSetting() );
        return sdpOptions;
    }

    private static void addAttachments(AltinnMessage altinnMessage, AttachmentsV2 attachmentsV2) {
        BinaryAttachmentExternalBEV2List binaryAttachmentExternalBEV2List = altinnObjectFactory.createBinaryAttachmentExternalBEV2List();
        BinaryAttachmentV2 binaryAttachmentV2 = null;

        if (!altinnMessage.getAttachments().isEmpty()) {
            for (Attachment attachment : altinnMessage.getAttachments()) {
                binaryAttachmentV2 = altinnObjectFactory.createBinaryAttachmentV2();

                binaryAttachmentV2.setFileName(altinnObjectFactory.createBinaryAttachmentV2FileName(attachment.getFilename()));
                binaryAttachmentV2.setName(altinnObjectFactory.createBinaryAttachmentV2Name(attachment.getName()));
                binaryAttachmentV2.setData(altinnObjectFactory.createBinaryAttachmentV2Data(attachment.getFile()));

                binaryAttachmentExternalBEV2List.getBinaryAttachmentV2().add(binaryAttachmentV2);
            }


            binaryAttachmentExternalBEV2List.getBinaryAttachmentV2().forEach(a -> {
                logger.info("binaryAttachment: " + a.toString());
                logger.info("binaryAttachment fileName: " + a.getFileName());
                logger.info("binaryAttachment fileName: " + a.getName());
            });

            attachmentsV2.setBinaryAttachments(altinnObjectFactory.createAttachmentsV2BinaryAttachments(binaryAttachmentExternalBEV2List));
        }

    }

    private static void addNotifications(AltinnMessage altinnMessage, NotificationBEList notificationBEList) {
        altinnMessage.getNotifications().forEach(altinnNotification -> {
            Notification notification = altinnObjectFactory.createNotification();
            notification.setFromAddress(altinnObjectFactory.createNotificationFromAddress(altinnNotification.getNotificationFromAddress()));
            notification.setLanguageCode(altinnObjectFactory.createNotificationLanguageCode(altinnNotification.getLanguageCode().value()));

            notification.setNotificationType(altinnObjectFactory.createNotificationNotificationType(altinnNotification.getNotificationTemplateName()));
            logger.info("notificationType: ", notification.getNotificationType());

            ReceiverEndPointBEList receiverEndPointBEList = createReceiverEndPointBEList(altinnNotification);
            notification.setReceiverEndPoints(altinnObjectFactory.createNotificationReceiverEndPoints(receiverEndPointBEList));

            TextTokenSubstitutionBEList textTokens = createTextTokens(altinnNotification);
            notification.setTextTokens(altinnObjectFactory.createNotificationTextTokens(textTokens));

            notificationBEList.getNotification().add(notification);

        });



    }

    private static ReceiverEndPointBEList createReceiverEndPointBEList(no.ssb.domene.altinn.correspondence.Notification notification) {
        ReceiverEndPointBEList receiverEndPointBEList = altinnObjectFactory.createReceiverEndPointBEList();
        ReceiverEndPoint receiverEndPoint = altinnObjectFactory.createReceiverEndPoint();

        logger.info("transportationType: {}", notification.getTransportType());
        TransportType transportType = TransportType.BOTH;
        try {
            if (!notification.getTransportType().isEmpty()) {
                transportType = TransportType.fromValue(notification.getTransportType());
            }
        }  catch (IllegalArgumentException iae) {
            // lar transportType være default (BOTH)
        }
        logger.info("altinn transportationType: {}", transportType.value());
        receiverEndPoint.setTransportType(altinnObjectFactory.createReceiverEndPointTransportType(transportType));
        receiverEndPoint.setReceiverAddress(altinnObjectFactory.createReceiverEndPointReceiverAddress(
                (TransportType.SMS.equals(transportType) || TransportType.EMAIL.equals(transportType)) ?
                        notification.getReceiverAddress() : null));

        logger.info(" receiverAddress: {}", receiverEndPoint.getReceiverAddress().getValue());
        receiverEndPointBEList.getReceiverEndPoint().add(receiverEndPoint);
        receiverEndPointBEList.getReceiverEndPoint().forEach(r ->
        logger.info("receiver: address={}, transportationType={}", r.getReceiverAddress().getValue(), r.getTransportType().getValue()));
        return receiverEndPointBEList;
    }

    private static TextTokenSubstitutionBEList createTextTokens(no.ssb.domene.altinn.correspondence.Notification altinnNotification) {
        TextTokenSubstitutionBEList textTokenSubstitutionBEList = altinnObjectFactory.createTextTokenSubstitutionBEList();

        TextToken tt0 = new TextToken();
        tt0.setTokenNum(0);
        tt0.setTokenValue(altinnObjectFactory.createTextTokenTokenValue(altinnNotification.getNotificationSMS() != null ? altinnNotification.getNotificationSMS() : ""));
        textTokenSubstitutionBEList.getTextToken().add(tt0);

        TextToken tt1 = new TextToken();
        tt1.setTokenNum(1);
        tt1.setTokenValue(altinnObjectFactory.createTextTokenTokenValue(altinnNotification.getNotificationSubject() != null ? altinnNotification.getNotificationSubject() : ""));
        textTokenSubstitutionBEList.getTextToken().add(tt1);

        TextToken tt2 = new TextToken();
        tt2.setTokenNum(2);
        tt2.setTokenValue(altinnObjectFactory.createTextTokenTokenValue(altinnNotification.getNotificationText() != null ? altinnNotification.getNotificationText() : ""));
        textTokenSubstitutionBEList.getTextToken().add(tt2);

        return textTokenSubstitutionBEList;
    }

}
