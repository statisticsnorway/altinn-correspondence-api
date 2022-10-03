package no.ssb.correspondence.api.util;

import no.altinn.schemas.services.serviceengine.correspondence._2010._10.InsertCorrespondenceV2;
import no.altinn.schemas.services.serviceengine.correspondence._2016._02.SdpOptions;

public class CorrespondenceUtil {
    public static String correspondenceV2AsString(InsertCorrespondenceV2 correspondence) {
        StringBuilder sb = new StringBuilder();
        sb.append("Correspondence: archiveRef=");
        sb.append(correspondence.getArchiveReference() == null ? "null" : correspondence.getArchiveReference().getValue());
        sb.append(", reportee=");
        sb.append(correspondence.getReportee() == null ? "null" : correspondence.getReportee().getValue());
        sb.append(", messageSender=");
        sb.append(correspondence.getMessageSender() == null ? "null" : correspondence.getMessageSender().getValue());

        correspondence.getNotifications().getValue().getNotification().forEach(n -> {
            sb.append("\n  notification: notificationType=");
            sb.append(n.getNotificationType() == null ? "null" : n.getNotificationType().getValue());
            sb.append(", lang=");
            sb.append(n.getLanguageCode() == null ? "null" : n.getLanguageCode().getValue());
            sb.append(", from=");
            sb.append(n.getFromAddress() == null ? "null" : n.getFromAddress().getValue());
            sb.append(", shipDate=");
            sb.append(n.getShipmentDateTime() == null ? "null" : n.getShipmentDateTime().getDay() + n.getShipmentDateTime().getMonth() + n.getShipmentDateTime().getYear());

            n.getReceiverEndPoints().getValue().getReceiverEndPoint().forEach(p -> {
                sb.append("\n    receiver:  address=");
                sb.append(p.getReceiverAddress() == null ? "null" : p.getReceiverAddress().getValue());
                sb.append(", transportType=");
                sb.append(p.getTransportType() == null ? "null" : (p.getTransportType().getValue() + "(" + p.getTransportType().getName() + ")"));
            });
            n.getTextTokens().getValue().getTextToken().forEach(t -> {
                sb.append("\n    textTokens: num=");
                sb.append(t.getTokenNum());
                sb.append(", value=");
                sb.append(t.getTokenValue() == null ? "null" : t.getTokenValue().getValue());
            });
        });
        if (correspondence.getSdpOptions() != null) {
            SdpOptions sdpOption = correspondence.getSdpOptions().getValue();
            sb.append("\n, sdpOption: filename=");
            sb.append(sdpOption.getPrimaryDocumentFileName());
            sb.append(", sdpSetting=");
            sb.append(sdpOption.getSdpSetting());
        } else  {
            sb.append("\n, sdpOption: null");

        }
        return sb.toString();
    }
}
