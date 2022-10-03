/*
 * #%L
 * Altinn Webservice
 * %%
 * Copyright (C) 2009 - 2016 Patentstyret
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the 
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public 
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

package no.ssb.correspondence.api.factory;

import no.altinn.schemas.serviceengine.formsengine._2009._10.TransportType;
import no.altinn.schemas.services.intermediary.receipt._2009._10.*;
import no.altinn.schemas.services.intermediary.shipment._2009._10.ReferenceType;
import no.altinn.schemas.services.serviceengine.correspondence._2009._10.*;
import no.altinn.schemas.services.serviceengine.correspondence._2010._10.*;
import no.altinn.schemas.services.serviceengine.correspondence._2013._06.CorrespondenceServiceInfo;
import no.altinn.schemas.services.serviceengine.correspondence._2013._11.*;
import no.altinn.schemas.services.serviceengine.correspondence._2013._11.Notification;
import no.altinn.schemas.services.serviceengine.correspondence._2014._10.*;
import no.altinn.schemas.services.serviceengine.correspondence._2016._02.*;
import no.altinn.schemas.services.serviceengine.notification._2009._10.*;
import no.altinn.schemas.services.serviceengine.subscription._2009._10.AttachmentFunctionType;
import no.altinn.schemas.services.serviceentity._2013._11.CorrespondenceStatusType;
import no.altinn.schemas.services.serviceentity._2014._10.CorrespondenceStatusTypeV2;
import no.altinn.services._2009._10.Test;
import no.altinn.services._2009._10.TestResponse;
import no.altinn.services.common.fault._2009._10.AltinnFault;
import no.altinn.services.serviceengine.correspondence._2009._10.*;
import no.altinn.services.serviceengine.reporteeelementlist._2009._10.BinaryAttachment;
import no.altinn.services.serviceengine.reporteeelementlist._2009._10.BinaryAttachmentBEList;
import no.altinn.services.serviceengine.reporteeelementlist._2009._10.XmlAttachment;
import no.altinn.services.serviceengine.reporteeelementlist._2010._10.BinaryAttachmentExternalBEV2List;
import no.altinn.services.serviceengine.reporteeelementlist._2010._10.BinaryAttachmentV2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the no.mxa.altinn.ws package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
public class AltinnObjectFactory {

    private final static QName _CorrespondenceStatusType_QNAME = new QName("http://schemas.altinn.no/services/serviceEntity/2013/11", "CorrespondenceStatusType");
    private final static QName _SdpStatusSearchOptions_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", "SdpStatusSearchOptions");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _TextTokenSubstitutionBEList_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Notification/2009/10", "TextTokenSubstitutionBEList");
    private final static QName _CorrespondenceStatusFilterV2_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2014/10", "CorrespondenceStatusFilterV2");
    private final static QName _ArrayOfSdpStatusDetails_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", "ArrayOfSdpStatusDetails");
    private final static QName _XmlAttachmentV2_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", "XmlAttachmentV2");
    private final static QName _SdpStatusType_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", "SdpStatusType");
    private final static QName _Reference_QNAME = new QName("http://schemas.altinn.no/services/Intermediary/Receipt/2009/10", "Reference");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _StatusChange_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2013/11", "StatusChange");
    private final static QName _ArrayOfStatusChangeV2_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2014/10", "ArrayOfStatusChangeV2");
    private final static QName _AttachmentsV2_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", "AttachmentsV2");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _ArrayOfStatus_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2013/11", "ArrayOfStatus");
    private final static QName _ReferenceList_QNAME = new QName("http://schemas.altinn.no/services/Intermediary/Receipt/2009/10", "ReferenceList");
    private final static QName _UserTypeRestriction_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", "UserTypeRestriction");
    private final static QName _ReceiptTypeEnum_QNAME = new QName("http://schemas.altinn.no/services/Intermediary/Receipt/2009/10", "ReceiptTypeEnum");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _ArrayOfStatusChange_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2013/11", "ArrayOfStatusChange");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _StatusV2_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2014/10", "StatusV2");
    private final static QName _ArrayOfSdpStatusChange_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", "ArrayOfSdpStatusChange");
    private final static QName _InsertCorrespondenceLinkServiceURL_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", "InsertCorrespondenceLinkServiceURL");
    private final static QName _SdpStatusDetails_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", "SdpStatusDetails");
    private final static QName _CorrespondenceStatusFilterV3_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", "CorrespondenceStatusFilterV3");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _XmlAttachmentListV2_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", "XmlAttachmentListV2");
    private final static QName _SdpStatusInformation_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", "SdpStatusInformation");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _ReceiptExternal_QNAME = new QName("http://schemas.altinn.no/services/Intermediary/Receipt/2009/10", "ReceiptExternal");
    private final static QName _ReplyOption_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", "ReplyOption");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _ReceiptStatusEnum_QNAME = new QName("http://schemas.altinn.no/services/Intermediary/Receipt/2009/10", "ReceiptStatusEnum");
    private final static QName _ReceiptExternalList_QNAME = new QName("http://schemas.altinn.no/services/Intermediary/Receipt/2009/10", "ReceiptExternalList");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _CorrespondenceServiceInfo_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2013/06", "CorrespondenceServiceInfo");
    private final static QName _BinaryAttachmentV2_QNAME = new QName("http://www.altinn.no/services/ServiceEngine/ReporteeElementList/2010/10", "BinaryAttachmentV2");
    private final static QName _SdpSetting_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", "SdpSetting");
    private final static QName _NotificationStatus_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2013/11", "NotificationStatus");
    private final static QName _ExternalContentV2_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", "ExternalContentV2");
    private final static QName _CorrespondenceStatusResultV2_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2014/10", "CorrespondenceStatusResultV2");
    private final static QName _Notification_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Notification/2009/10", "Notification");
    private final static QName _StatusChangeV2_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2014/10", "StatusChangeV2");
    private final static QName _TextToken_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Notification/2009/10", "TextToken");
    private final static QName _InsertCorrespondenceV2_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", "InsertCorrespondenceV2");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _ReferenceType_QNAME = new QName("http://schemas.altinn.no/services/Intermediary/Shipment/2009/10", "ReferenceType");
    private final static QName _CorrespondenceStatusTypeV2_QNAME = new QName("http://schemas.altinn.no/services/serviceEntity/2014/10", "CorrespondenceStatusTypeV2");
    private final static QName _CorrespondenceStatusFilter_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2013/11", "CorrespondenceStatusFilter");
    private final static QName _XmlAttachment_QNAME = new QName("http://www.altinn.no/services/ServiceEngine/ReporteeElementList/2009/10", "XmlAttachment");
    private final static QName _BinaryAttachmentExternalBEV2List_QNAME = new QName("http://www.altinn.no/services/ServiceEngine/ReporteeElementList/2010/10", "BinaryAttachmentExternalBEV2List");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _BinaryAttachmentBEList_QNAME = new QName("http://www.altinn.no/services/ServiceEngine/ReporteeElementList/2009/10", "BinaryAttachmentBEList");
    private final static QName _TransportType_QNAME = new QName("http://schemas.altinn.no/serviceengine/formsengine/2009/10", "TransportType");
    private final static QName _SdpOptions_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", "SdpOptions");
    private final static QName _AttachmentFunctionType_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Subscription/2009/10", "AttachmentFunctionType");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _CorrespondenceInsertLinkBEList_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", "CorrespondenceInsertLinkBEList");
    private final static QName _ExternalContent_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", "ExternalContent");
    private final static QName _ArrayOfNotification_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2013/11", "ArrayOfNotification");
    private final static QName _InsertCorrespondence_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", "InsertCorrespondence");
    private final static QName _SdpStatusChange_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", "SdpStatusChange");
    private final static QName _NotificationBEList_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Notification/2009/10", "NotificationBEList");
    private final static QName _CorrespondenceStatusInformation_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", "CorrespondenceStatusInformation");
    private final static QName _CorrespondenceStatusResultV3_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", "CorrespondenceStatusResultV3");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _CorrespondenceStatusResult_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2013/11", "CorrespondenceStatusResult");
    private final static QName _AltinnFault_QNAME = new QName("http://www.altinn.no/services/common/fault/2009/10", "AltinnFault");
    private final static QName _ArrayOfStatusV2_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2014/10", "ArrayOfStatusV2");
    private final static QName _Status_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2013/11", "Status");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _BinaryAttachment_QNAME = new QName("http://www.altinn.no/services/ServiceEngine/ReporteeElementList/2009/10", "BinaryAttachment");
    private final static QName _Attachments_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", "Attachments");
    private final static QName _ReceiverEndPointBEList_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Notification/2009/10", "ReceiverEndPointBEList");
    private final static QName _InsertCorrespondenceLinkServiceCode_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", "InsertCorrespondenceLinkServiceCode");
    private final static QName _InsertCorrespondenceLinkArchiveRef_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", "InsertCorrespondenceLinkArchiveRef");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _ReceiverEndPoint_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Notification/2009/10", "ReceiverEndPoint");
    private final static QName _InsertCorrespondenceBasicV2ResponseInsertCorrespondenceBasicV2Result_QNAME = new QName("http://www.altinn.no/services/ServiceEngine/Correspondence/2009/10", "InsertCorrespondenceBasicV2Result");
    private final static QName _InsertCorrespondenceV2ServiceEdition_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", "ServiceEdition");
    private final static QName _InsertCorrespondenceV2Content_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", "Content");
    private final static QName _InsertCorrespondenceV2IsReservable_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", "IsReservable");
    private final static QName _InsertCorrespondenceV2ServiceCode_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", "ServiceCode");
    private final static QName _InsertCorrespondenceV2AllowSystemDeleteDateTime_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", "AllowSystemDeleteDateTime");
    private final static QName _InsertCorrespondenceV2Reportee_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", "Reportee");
    private final static QName _InsertCorrespondenceV2SdpOptions_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", "SdpOptions");
    private final static QName _InsertCorrespondenceV2Notifications_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", "Notifications");
    private final static QName _InsertCorrespondenceV2ReplyOptions_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", "ReplyOptions");
    private final static QName _InsertCorrespondenceV2ArchiveReference_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", "ArchiveReference");
    private final static QName _InsertCorrespondenceV2MessageSender_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", "MessageSender");
    private final static QName _InsertCorrespondenceV2AllowForwarding_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", "AllowForwarding");
    private final static QName _InsertCorrespondenceV2CaseID_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", "CaseID");
    private final static QName _ReceiptExternalReceiptHistory_QNAME = new QName("http://schemas.altinn.no/services/Intermediary/Receipt/2009/10", "ReceiptHistory");
    private final static QName _ReceiptExternalReferences_QNAME = new QName("http://schemas.altinn.no/services/Intermediary/Receipt/2009/10", "References");
    private final static QName _ReceiptExternalSubReceipts_QNAME = new QName("http://schemas.altinn.no/services/Intermediary/Receipt/2009/10", "SubReceipts");
    private final static QName _ReceiptExternalReceiptText_QNAME = new QName("http://schemas.altinn.no/services/Intermediary/Receipt/2009/10", "ReceiptText");
    private final static QName _CorrespondenceStatusInformationCorrespondenceStatusDetailsList_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", "CorrespondenceStatusDetailsList");
    private final static QName _InsertCorrespondenceLinkArchiveRefArchiveRef_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", "ArchiveRef");
    private final static QName _XmlAttachmentV2DataFormatId_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", "DataFormatId");
    private final static QName _XmlAttachmentV2FormDataXml_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", "FormDataXml");
    private final static QName _XmlAttachmentV2SendersReference_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", "SendersReference");
    private final static QName _CorrespondenceStatusResultV3ServiceCode_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", "ServiceCode");
    private final static QName _TextTokenTokenValue_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Notification/2009/10", "TokenValue");
    private final static QName _InsertCorrespondenceLinkServiceCodeServiceEdition_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", "ServiceEdition");
    private final static QName _InsertCorrespondenceLinkServiceCodeServiceCode_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", "ServiceCode");
    private final static QName _InsertCorrespondenceLinkServiceURLLinkURL_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", "LinkURL");
    private final static QName _InsertCorrespondenceLinkServiceURLLinkText_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", "LinkText");
    private final static QName _InsertCorrespondenceBasicResponseInsertCorrespondenceBasicResult_QNAME = new QName("http://www.altinn.no/services/ServiceEngine/Correspondence/2009/10", "InsertCorrespondenceBasicResult");
    private final static QName _CorrespondenceStatusFilterV3SdpSearchOptions_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", "SdpSearchOptions");
    private final static QName _CorrespondenceStatusFilterV3NotificationSent_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", "NotificationSent");
    private final static QName _CorrespondenceStatusFilterV3Reportee_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", "Reportee");
    private final static QName _CorrespondenceStatusFilterV3CreatedBeforeDate_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", "CreatedBeforeDate");
    private final static QName _CorrespondenceStatusFilterV3SendersReference_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", "SendersReference");
    private final static QName _CorrespondenceStatusFilterV3CreatedAfterDate_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", "CreatedAfterDate");
    private final static QName _SdpOptionsBackupAltinn_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", "BackupAltinn");
    private final static QName _CorrespondenceStatusResultV2ServiceCode_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2014/10", "ServiceCode");
    private final static QName _CorrespondenceStatusResultV2StatusList_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2014/10", "StatusList");
    private final static QName _ExternalContentV2LanguageCode_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", "LanguageCode");
    private final static QName _ExternalContentV2MessageTitle_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", "MessageTitle");
    private final static QName _ExternalContentV2Attachments_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", "Attachments");
    private final static QName _ExternalContentV2MessageSummary_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", "MessageSummary");
    private final static QName _ExternalContentV2MessageBody_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", "MessageBody");
    private final static QName _ExternalContentV2CustomMessageData_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", "CustomMessageData");
    private final static QName _CorrespondenceServiceInfoExternalServiceCode_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2013/06", "ExternalServiceCode");
    private final static QName _AttachmentsBinaryAttachments_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", "BinaryAttachments");
    private final static QName _AttachmentsXmlAttachment_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", "XmlAttachment");
    private final static QName _ReplyOptionArchiveReference_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", "ArchiveReference");
    private final static QName _ReplyOptionURL_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", "URL");
    private final static QName _ReplyOptionService_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", "Service");
    private final static QName _NotificationLanguageCode_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Notification/2009/10", "LanguageCode");
    private final static QName _NotificationFromAddress_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Notification/2009/10", "FromAddress");
    private final static QName _NotificationNotificationType_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Notification/2009/10", "NotificationType");
    private final static QName _NotificationTextTokens_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Notification/2009/10", "TextTokens");
    private final static QName _NotificationReceiverEndPoints_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Notification/2009/10", "ReceiverEndPoints");
    private final static QName _InsertCorrespondenceBasicCorrespondence_QNAME = new QName("http://www.altinn.no/services/ServiceEngine/Correspondence/2009/10", "Correspondence");
    private final static QName _InsertCorrespondenceBasicSystemUserName_QNAME = new QName("http://www.altinn.no/services/ServiceEngine/Correspondence/2009/10", "systemUserName");
    private final static QName _InsertCorrespondenceBasicSystemUserCode_QNAME = new QName("http://www.altinn.no/services/ServiceEngine/Correspondence/2009/10", "SystemUserCode");
    private final static QName _InsertCorrespondenceBasicSystemPassword_QNAME = new QName("http://www.altinn.no/services/ServiceEngine/Correspondence/2009/10", "systemPassword");
    private final static QName _InsertCorrespondenceBasicExternalReference_QNAME = new QName("http://www.altinn.no/services/ServiceEngine/Correspondence/2009/10", "ExternalReference");
    private final static QName _XmlAttachmentFormDataXml_QNAME = new QName("http://www.altinn.no/services/ServiceEngine/ReporteeElementList/2009/10", "FormDataXml");
    private final static QName _XmlAttachmentSendersReference_QNAME = new QName("http://www.altinn.no/services/ServiceEngine/ReporteeElementList/2009/10", "SendersReference");
    private final static QName _BinaryAttachmentV2SendersReference_QNAME = new QName("http://www.altinn.no/services/ServiceEngine/ReporteeElementList/2010/10", "SendersReference");
    private final static QName _BinaryAttachmentV2Name_QNAME = new QName("http://www.altinn.no/services/ServiceEngine/ReporteeElementList/2010/10", "Name");
    private final static QName _BinaryAttachmentV2Data_QNAME = new QName("http://www.altinn.no/services/ServiceEngine/ReporteeElementList/2010/10", "Data");
    private final static QName _BinaryAttachmentV2FileName_QNAME = new QName("http://www.altinn.no/services/ServiceEngine/ReporteeElementList/2010/10", "FileName");
    private final static QName _ExternalContentLanguageCode_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", "LanguageCode");
    private final static QName _ExternalContentMessageTitle_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", "MessageTitle");
    private final static QName _ExternalContentMessageSummary_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", "MessageSummary");
    private final static QName _ExternalContentMessageBody_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", "MessageBody");
    private final static QName _ExternalContentCustomMessageData_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", "CustomMessageData");
    private final static QName _ReferenceReferenceValue_QNAME = new QName("http://schemas.altinn.no/services/Intermediary/Receipt/2009/10", "ReferenceValue");
    private final static QName _GetCorrespondenceStatusDetailsBasicV3ResponseGetCorrespondenceStatusDetailsBasicV3Result_QNAME = new QName("http://www.altinn.no/services/ServiceEngine/Correspondence/2009/10", "GetCorrespondenceStatusDetailsBasicV3Result");
    private final static QName _SdpStatusInformationSdpStatusDetailsList_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", "SdpStatusDetailsList");
    private final static QName _SdpStatusDetailsCorrespondenceId_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", "CorrespondenceId");
    private final static QName _SdpStatusDetailsReference_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", "Reference");
    private final static QName _SdpStatusDetailsStatusHistory_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", "StatusHistory");
    private final static QName _CorrespondenceStatusFilterCreatedBeforeDate_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2013/11", "CreatedBeforeDate");
    private final static QName _CorrespondenceStatusFilterNotificationSent_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2013/11", "NotificationSent");
    private final static QName _CorrespondenceStatusFilterReportee_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2013/11", "Reportee");
    private final static QName _CorrespondenceStatusFilterCreatedAfterDate_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2013/11", "CreatedAfterDate");
    private final static QName _CorrespondenceStatusFilterSendersReference_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2013/11", "SendersReference");
    private final static QName _AttachmentsV2XmlAttachmentList_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", "XmlAttachmentList");
    private final static QName _AttachmentsV2BinaryAttachments_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", "BinaryAttachments");
    private final static QName _ReceiverEndPointReceiverAddress_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Notification/2009/10", "ReceiverAddress");
    private final static QName _ReceiverEndPointTransportType_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Notification/2009/10", "TransportType");
    private final static QName _StatusV2Reportee_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2014/10", "Reportee");
    private final static QName _StatusV2StatusChanges_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2014/10", "StatusChanges");
    private final static QName _StatusV2Notifications_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2014/10", "Notifications");
    private final static QName _StatusV2SendersReference_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2014/10", "SendersReference");
    private final static QName _BinaryAttachmentFileName_QNAME = new QName("http://www.altinn.no/services/ServiceEngine/ReporteeElementList/2009/10", "FileName");
    private final static QName _BinaryAttachmentName_QNAME = new QName("http://www.altinn.no/services/ServiceEngine/ReporteeElementList/2009/10", "Name");
    private final static QName _BinaryAttachmentData_QNAME = new QName("http://www.altinn.no/services/ServiceEngine/ReporteeElementList/2009/10", "Data");
    private final static QName _GetCorrespondenceStatusDetailsBasicV2ResponseGetCorrespondenceStatusDetailsBasicV2Result_QNAME = new QName("http://www.altinn.no/services/ServiceEngine/Correspondence/2009/10", "GetCorrespondenceStatusDetailsBasicV2Result");
    private final static QName _StatusNotifications_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2013/11", "Notifications");
    private final static QName _StatusStatusChanges_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2013/11", "StatusChanges");
    private final static QName _CreateSimpleCorrespondenceServiceBasicResponseCreateSimpleCorrespondenceServiceBasicResult_QNAME = new QName("http://www.altinn.no/services/ServiceEngine/Correspondence/2009/10", "CreateSimpleCorrespondenceServiceBasicResult");
    private final static QName _CorrespondenceStatusFilterV2NotificationSent_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2014/10", "NotificationSent");
    private final static QName _CorrespondenceStatusFilterV2CreatedBeforeDate_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2014/10", "CreatedBeforeDate");
    private final static QName _CorrespondenceStatusFilterV2CreatedAfterDate_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2014/10", "CreatedAfterDate");
    private final static QName _NotificationStatusRecipient_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2013/11", "Recipient");
    private final static QName _NotificationStatusSentDate_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2013/11", "SentDate");
    private final static QName _CorrespondenceStatusResultStatusList_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2013/11", "StatusList");
    private final static QName _CorrespondenceStatusResultServiceCode_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2013/11", "ServiceCode");
    private final static QName _GetCorrespondenceStatusDetailsBasicResponseGetCorrespondenceStatusDetailsBasicResult_QNAME = new QName("http://www.altinn.no/services/ServiceEngine/Correspondence/2009/10", "GetCorrespondenceStatusDetailsBasicResult");
    private final static QName _AltinnFaultUserGuid_QNAME = new QName("http://www.altinn.no/services/common/fault/2009/10", "UserGuid");
    private final static QName _AltinnFaultUserId_QNAME = new QName("http://www.altinn.no/services/common/fault/2009/10", "UserId");
    private final static QName _AltinnFaultAltinnExtendedErrorMessage_QNAME = new QName("http://www.altinn.no/services/common/fault/2009/10", "AltinnExtendedErrorMessage");
    private final static QName _AltinnFaultErrorGuid_QNAME = new QName("http://www.altinn.no/services/common/fault/2009/10", "ErrorGuid");
    private final static QName _AltinnFaultAltinnLocalizedErrorMessage_QNAME = new QName("http://www.altinn.no/services/common/fault/2009/10", "AltinnLocalizedErrorMessage");
    private final static QName _AltinnFaultAltinnErrorMessage_QNAME = new QName("http://www.altinn.no/services/common/fault/2009/10", "AltinnErrorMessage");
    private final static QName _InsertCorrespondenceContent_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", "Content");
    private final static QName _InsertCorrespondenceAllowSystemDeleteDateTime_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", "AllowSystemDeleteDateTime");
    private final static QName _InsertCorrespondenceReportee_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", "Reportee");
    private final static QName _InsertCorrespondenceNotifications_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", "Notifications");
    private final static QName _InsertCorrespondenceReplyOptions_QNAME = new QName("http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", "ReplyOptions");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: no.mxa.altinn.ws
     *
     */
    public AltinnObjectFactory() {
    }

    /**
     * Create an instance of {@link ReceiptExternal }
     *
     */
    public ReceiptExternal createReceiptExternal() {
        return new ReceiptExternal();
    }

    /**
     * Create an instance of {@link CorrespondenceInsertLinkBEList }
     *
     */
    public CorrespondenceInsertLinkBEList createCorrespondenceInsertLinkBEList() {
        return new CorrespondenceInsertLinkBEList();
    }

    /**
     * Create an instance of {@link InsertCorrespondenceV2 }
     *
     */
    public InsertCorrespondenceV2 createInsertCorrespondenceV2() {
        return new InsertCorrespondenceV2();
    }

    /**
     * Create an instance of {@link CorrespondenceStatusInformation }
     *
     */
    public CorrespondenceStatusInformation createCorrespondenceStatusInformation() {
        return new CorrespondenceStatusInformation();
    }

    /**
     * Create an instance of {@link ArrayOfStatusChange }
     *
     */
    public ArrayOfStatusChange createArrayOfStatusChange() {
        return new ArrayOfStatusChange();
    }

    /**
     * Create an instance of {@link ArrayOfStatusChangeV2 }
     *
     */
    public ArrayOfStatusChangeV2 createArrayOfStatusChangeV2() {
        return new ArrayOfStatusChangeV2();
    }

    /**
     * Create an instance of {@link ArrayOfStatus }
     *
     */
    public ArrayOfStatus createArrayOfStatus() {
        return new ArrayOfStatus();
    }

    /**
     * Create an instance of {@link StatusChange }
     *
     */
    public StatusChange createStatusChange() {
        return new StatusChange();
    }

    /**
     * Create an instance of {@link SdpOptions }
     *
     */
    public SdpOptions createSdpOptions() {
        return new SdpOptions();
    }

    /**
     * Create an instance of {@link Test }
     *
     */
    public Test createTest() {
        return new Test();
    }

    /**
     * Create an instance of {@link CorrespondenceStatusResultV2 }
     *
     */
    public CorrespondenceStatusResultV2 createCorrespondenceStatusResultV2() {
        return new CorrespondenceStatusResultV2();
    }

    /**
     * Create an instance of {@link TextTokenSubstitutionBEList }
     *
     */
    public TextTokenSubstitutionBEList createTextTokenSubstitutionBEList() {
        return new TextTokenSubstitutionBEList();
    }

    /**
     * Create an instance of {@link GetCorrespondenceStatusDetailsBasicV3 }
     *
     */
    public GetCorrespondenceStatusDetailsBasicV3 createGetCorrespondenceStatusDetailsBasicV3() {
        return new GetCorrespondenceStatusDetailsBasicV3();
    }

    /**
     * Create an instance of {@link ArrayOfStatusV2 }
     *
     */
    public ArrayOfStatusV2 createArrayOfStatusV2() {
        return new ArrayOfStatusV2();
    }

    /**
     * Create an instance of {@link ReferenceList }
     *
     */
    public ReferenceList createReferenceList() {
        return new ReferenceList();
    }

    /**
     * Create an instance of {@link no.altinn.schemas.services.serviceengine.notification._2009._10.Notification }
     *
     */
    public no.altinn.schemas.services.serviceengine.notification._2009._10.Notification createNotification() {
        return new no.altinn.schemas.services.serviceengine.notification._2009._10.Notification();
    }

    /**
     * Create an instance of {@link XmlAttachmentListV2 }
     *
     */
    public XmlAttachmentListV2 createXmlAttachmentListV2() {
        return new XmlAttachmentListV2();
    }

    /**
     * Create an instance of {@link ExternalContent }
     *
     */
    public ExternalContent createExternalContent() {
        return new ExternalContent();
    }

    /**
     * Create an instance of {@link StatusChangeV2 }
     *
     */
    public StatusChangeV2 createStatusChangeV2() {
        return new StatusChangeV2();
    }

    /**
     * Create an instance of {@link GetCorrespondenceStatusDetailsBasicV3Response }
     *
     */
    public GetCorrespondenceStatusDetailsBasicV3Response createGetCorrespondenceStatusDetailsBasicV3Response() {
        return new GetCorrespondenceStatusDetailsBasicV3Response();
    }

    /**
     * Create an instance of {@link ReceiverEndPoint }
     *
     */
    public ReceiverEndPoint createReceiverEndPoint() {
        return new ReceiverEndPoint();
    }

    /**
     * Create an instance of {@link AttachmentsV2 }
     *
     */
    public AttachmentsV2 createAttachmentsV2() {
        return new AttachmentsV2();
    }

    /**
     * Create an instance of {@link ArrayOfNotification }
     *
     */
    public ArrayOfNotification createArrayOfNotification() {
        return new ArrayOfNotification();
    }

    /**
     * Create an instance of {@link SdpStatusSearchOptions }
     *
     */
    public SdpStatusSearchOptions createSdpStatusSearchOptions() {
        return new SdpStatusSearchOptions();
    }

    /**
     * Create an instance of {@link GetCorrespondenceStatusDetailsBasicV2Response }
     *
     */
    public GetCorrespondenceStatusDetailsBasicV2Response createGetCorrespondenceStatusDetailsBasicV2Response() {
        return new GetCorrespondenceStatusDetailsBasicV2Response();
    }

    /**
     * Create an instance of {@link GetCorrespondenceStatusDetailsBasicV2 }
     *
     */
    public GetCorrespondenceStatusDetailsBasicV2 createGetCorrespondenceStatusDetailsBasicV2() {
        return new GetCorrespondenceStatusDetailsBasicV2();
    }

    /**
     * Create an instance of {@link BinaryAttachmentExternalBEV2List }
     *
     */
    public BinaryAttachmentExternalBEV2List createBinaryAttachmentExternalBEV2List() {
        return new BinaryAttachmentExternalBEV2List();
    }

    /**
     * Create an instance of {@link CorrespondenceStatusFilterV2 }
     *
     */
    public CorrespondenceStatusFilterV2 createCorrespondenceStatusFilterV2() {
        return new CorrespondenceStatusFilterV2();
    }

    /**
     * Create an instance of {@link CorrespondenceStatusResult }
     *
     */
    public CorrespondenceStatusResult createCorrespondenceStatusResult() {
        return new CorrespondenceStatusResult();
    }

    /**
     * Create an instance of {@link Notification }
     *
     */
    public Notification createNotificationStatus() {
        return new Notification();
    }

    /**
     * Create an instance of {@link ArrayOfSdpStatusDetails }
     *
     */
    public ArrayOfSdpStatusDetails createArrayOfSdpStatusDetails() {
        return new ArrayOfSdpStatusDetails();
    }

    /**
     * Create an instance of {@link BinaryAttachmentBEList }
     *
     */
    public BinaryAttachmentBEList createBinaryAttachmentBEList() {
        return new BinaryAttachmentBEList();
    }

    /**
     * Create an instance of {@link InsertCorrespondenceBasicV2Response }
     *
     */
    public InsertCorrespondenceBasicV2Response createInsertCorrespondenceBasicV2Response() {
        return new InsertCorrespondenceBasicV2Response();
    }

    /**
     * Create an instance of {@link InsertCorrespondenceLinkArchiveRef }
     *
     */
    public InsertCorrespondenceLinkArchiveRef createInsertCorrespondenceLinkArchiveRef() {
        return new InsertCorrespondenceLinkArchiveRef();
    }

    /**
     * Create an instance of {@link XmlAttachmentV2 }
     *
     */
    public XmlAttachmentV2 createXmlAttachmentV2() {
        return new XmlAttachmentV2();
    }

    /**
     * Create an instance of {@link CorrespondenceStatusResultV3 }
     *
     */
    public CorrespondenceStatusResultV3 createCorrespondenceStatusResultV3() {
        return new CorrespondenceStatusResultV3();
    }

    /**
     * Create an instance of {@link TextToken }
     *
     */
    public TextToken createTextToken() {
        return new TextToken();
    }

    /**
     * Create an instance of {@link InsertCorrespondenceLinkServiceURL }
     *
     */
    public InsertCorrespondenceLinkServiceURL createInsertCorrespondenceLinkServiceURL() {
        return new InsertCorrespondenceLinkServiceURL();
    }

    /**
     * Create an instance of {@link InsertCorrespondenceLinkServiceCode }
     *
     */
    public InsertCorrespondenceLinkServiceCode createInsertCorrespondenceLinkServiceCode() {
        return new InsertCorrespondenceLinkServiceCode();
    }

    /**
     * Create an instance of {@link CorrespondenceStatusFilterV3 }
     *
     */
    public CorrespondenceStatusFilterV3 createCorrespondenceStatusFilterV3() {
        return new CorrespondenceStatusFilterV3();
    }

    /**
     * Create an instance of {@link InsertCorrespondenceBasicResponse }
     *
     */
    public InsertCorrespondenceBasicResponse createInsertCorrespondenceBasicResponse() {
        return new InsertCorrespondenceBasicResponse();
    }

    /**
     * Create an instance of {@link InsertCorrespondenceBasicV2 }
     *
     */
    public InsertCorrespondenceBasicV2 createInsertCorrespondenceBasicV2() {
        return new InsertCorrespondenceBasicV2();
    }

    /**
     * Create an instance of {@link CreateSimpleCorrespondenceServiceBasic }
     *
     */
    public CreateSimpleCorrespondenceServiceBasic createCreateSimpleCorrespondenceServiceBasic() {
        return new CreateSimpleCorrespondenceServiceBasic();
    }

    /**
     * Create an instance of {@link CorrespondenceServiceInfo }
     *
     */
    public CorrespondenceServiceInfo createCorrespondenceServiceInfo() {
        return new CorrespondenceServiceInfo();
    }

    /**
     * Create an instance of {@link TestResponse }
     *
     */
    public TestResponse createTestResponse() {
        return new TestResponse();
    }

    /**
     * Create an instance of {@link ExternalContentV2 }
     *
     */
    public ExternalContentV2 createExternalContentV2() {
        return new ExternalContentV2();
    }

    /**
     * Create an instance of {@link ReplyOption }
     *
     */
    public ReplyOption createReplyOption() {
        return new ReplyOption();
    }

    /**
     * Create an instance of {@link Attachments }
     *
     */
    public Attachments createAttachments() {
        return new Attachments();
    }

    /**
     * Create an instance of {@link SdpStatusChange }
     *
     */
    public SdpStatusChange createSdpStatusChange() {
        return new SdpStatusChange();
    }

    /**
     * Create an instance of {@link XmlAttachment }
     *
     */
    public XmlAttachment createXmlAttachment() {
        return new XmlAttachment();
    }

    /**
     * Create an instance of {@link InsertCorrespondenceBasic }
     *
     */
    public InsertCorrespondenceBasic createInsertCorrespondenceBasic() {
        return new InsertCorrespondenceBasic();
    }

    /**
     * Create an instance of {@link BinaryAttachmentV2 }
     *
     */
    public BinaryAttachmentV2 createBinaryAttachmentV2() {
        return new BinaryAttachmentV2();
    }

    /**
     * Create an instance of {@link Reference }
     *
     */
    public Reference createReference() {
        return new Reference();
    }

    /**
     * Create an instance of {@link SdpStatusInformation }
     *
     */
    public SdpStatusInformation createSdpStatusInformation() {
        return new SdpStatusInformation();
    }

    /**
     * Create an instance of {@link SdpStatusDetails }
     *
     */
    public SdpStatusDetails createSdpStatusDetails() {
        return new SdpStatusDetails();
    }

    /**
     * Create an instance of {@link CorrespondenceStatusFilter }
     *
     */
    public CorrespondenceStatusFilter createCorrespondenceStatusFilter() {
        return new CorrespondenceStatusFilter();
    }

    /**
     * Create an instance of {@link BinaryAttachment }
     *
     */
    public BinaryAttachment createBinaryAttachment() {
        return new BinaryAttachment();
    }

    /**
     * Create an instance of {@link StatusV2 }
     *
     */
    public StatusV2 createStatusV2() {
        return new StatusV2();
    }

    /**
     * Create an instance of {@link ReceiverEndPointBEList }
     *
     */
    public ReceiverEndPointBEList createReceiverEndPointBEList() {
        return new ReceiverEndPointBEList();
    }

    /**
     * Create an instance of {@link Status }
     *
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link CreateSimpleCorrespondenceServiceBasicResponse }
     *
     */
    public CreateSimpleCorrespondenceServiceBasicResponse createCreateSimpleCorrespondenceServiceBasicResponse() {
        return new CreateSimpleCorrespondenceServiceBasicResponse();
    }

    /**
     * Create an instance of {@link ReceiptExternalList }
     *
     */
    public ReceiptExternalList createReceiptExternalList() {
        return new ReceiptExternalList();
    }

    /**
     * Create an instance of {@link GetCorrespondenceStatusDetailsBasicResponse }
     *
     */
    public GetCorrespondenceStatusDetailsBasicResponse createGetCorrespondenceStatusDetailsBasicResponse() {
        return new GetCorrespondenceStatusDetailsBasicResponse();
    }

    /**
     * Create an instance of {@link AltinnFault }
     *
     */
    public AltinnFault createAltinnFault() {
        return new AltinnFault();
    }

    /**
     * Create an instance of {@link NotificationBEList }
     *
     */
    public NotificationBEList createNotificationBEList() {
        return new NotificationBEList();
    }

    /**
     * Create an instance of {@link InsertCorrespondence }
     *
     */
    public InsertCorrespondence createInsertCorrespondence() {
        return new InsertCorrespondence();
    }

    /**
     * Create an instance of {@link ArrayOfSdpStatusChange }
     *
     */
    public ArrayOfSdpStatusChange createArrayOfSdpStatusChange() {
        return new ArrayOfSdpStatusChange();
    }

    /**
     * Create an instance of {@link GetCorrespondenceStatusDetailsBasic }
     *
     */
    public GetCorrespondenceStatusDetailsBasic createGetCorrespondenceStatusDetailsBasic() {
        return new GetCorrespondenceStatusDetailsBasic();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CorrespondenceStatusType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/serviceEntity/2013/11", name = "CorrespondenceStatusType")
    public JAXBElement<CorrespondenceStatusType> createCorrespondenceStatusType(CorrespondenceStatusType value) {
        return new JAXBElement<CorrespondenceStatusType>(_CorrespondenceStatusType_QNAME, CorrespondenceStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SdpStatusSearchOptions }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", name = "SdpStatusSearchOptions")
    public JAXBElement<SdpStatusSearchOptions> createSdpStatusSearchOptions(SdpStatusSearchOptions value) {
        return new JAXBElement<SdpStatusSearchOptions>(_SdpStatusSearchOptions_QNAME, SdpStatusSearchOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextTokenSubstitutionBEList }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Notification/2009/10", name = "TextTokenSubstitutionBEList")
    public JAXBElement<TextTokenSubstitutionBEList> createTextTokenSubstitutionBEList(TextTokenSubstitutionBEList value) {
        return new JAXBElement<TextTokenSubstitutionBEList>(_TextTokenSubstitutionBEList_QNAME, TextTokenSubstitutionBEList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CorrespondenceStatusFilterV2 }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2014/10", name = "CorrespondenceStatusFilterV2")
    public JAXBElement<CorrespondenceStatusFilterV2> createCorrespondenceStatusFilterV2(CorrespondenceStatusFilterV2 value) {
        return new JAXBElement<CorrespondenceStatusFilterV2>(_CorrespondenceStatusFilterV2_QNAME, CorrespondenceStatusFilterV2.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSdpStatusDetails }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", name = "ArrayOfSdpStatusDetails")
    public JAXBElement<ArrayOfSdpStatusDetails> createArrayOfSdpStatusDetails(ArrayOfSdpStatusDetails value) {
        return new JAXBElement<ArrayOfSdpStatusDetails>(_ArrayOfSdpStatusDetails_QNAME, ArrayOfSdpStatusDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XmlAttachmentV2 }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", name = "XmlAttachmentV2")
    public JAXBElement<XmlAttachmentV2> createXmlAttachmentV2(XmlAttachmentV2 value) {
        return new JAXBElement<XmlAttachmentV2>(_XmlAttachmentV2_QNAME, XmlAttachmentV2.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SdpStatusType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", name = "SdpStatusType")
    public JAXBElement<SdpStatusType> createSdpStatusType(SdpStatusType value) {
        return new JAXBElement<SdpStatusType>(_SdpStatusType_QNAME, SdpStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Reference }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/Intermediary/Receipt/2009/10", name = "Reference")
    public JAXBElement<Reference> createReference(Reference value) {
        return new JAXBElement<Reference>(_Reference_QNAME, Reference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusChange }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2013/11", name = "StatusChange")
    public JAXBElement<StatusChange> createStatusChange(StatusChange value) {
        return new JAXBElement<StatusChange>(_StatusChange_QNAME, StatusChange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatusChangeV2 }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2014/10", name = "ArrayOfStatusChangeV2")
    public JAXBElement<ArrayOfStatusChangeV2> createArrayOfStatusChangeV2(ArrayOfStatusChangeV2 value) {
        return new JAXBElement<ArrayOfStatusChangeV2>(_ArrayOfStatusChangeV2_QNAME, ArrayOfStatusChangeV2.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttachmentsV2 }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", name = "AttachmentsV2")
    public JAXBElement<AttachmentsV2> createAttachmentsV2(AttachmentsV2 value) {
        return new JAXBElement<AttachmentsV2>(_AttachmentsV2_QNAME, AttachmentsV2.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatus }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2013/11", name = "ArrayOfStatus")
    public JAXBElement<ArrayOfStatus> createArrayOfStatus(ArrayOfStatus value) {
        return new JAXBElement<ArrayOfStatus>(_ArrayOfStatus_QNAME, ArrayOfStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceList }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/Intermediary/Receipt/2009/10", name = "ReferenceList")
    public JAXBElement<ReferenceList> createReferenceList(ReferenceList value) {
        return new JAXBElement<ReferenceList>(_ReferenceList_QNAME, ReferenceList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserTypeRestriction }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", name = "UserTypeRestriction")
    public JAXBElement<UserTypeRestriction> createUserTypeRestriction(UserTypeRestriction value) {
        return new JAXBElement<UserTypeRestriction>(_UserTypeRestriction_QNAME, UserTypeRestriction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiptTypeEnum }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/Intermediary/Receipt/2009/10", name = "ReceiptTypeEnum")
    public JAXBElement<ReceiptTypeEnum> createReceiptTypeEnum(ReceiptTypeEnum value) {
        return new JAXBElement<ReceiptTypeEnum>(_ReceiptTypeEnum_QNAME, ReceiptTypeEnum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatusChange }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2013/11", name = "ArrayOfStatusChange")
    public JAXBElement<ArrayOfStatusChange> createArrayOfStatusChange(ArrayOfStatusChange value) {
        return new JAXBElement<ArrayOfStatusChange>(_ArrayOfStatusChange_QNAME, ArrayOfStatusChange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusV2 }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2014/10", name = "StatusV2")
    public JAXBElement<StatusV2> createStatusV2(StatusV2 value) {
        return new JAXBElement<StatusV2>(_StatusV2_QNAME, StatusV2.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSdpStatusChange }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", name = "ArrayOfSdpStatusChange")
    public JAXBElement<ArrayOfSdpStatusChange> createArrayOfSdpStatusChange(ArrayOfSdpStatusChange value) {
        return new JAXBElement<ArrayOfSdpStatusChange>(_ArrayOfSdpStatusChange_QNAME, ArrayOfSdpStatusChange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertCorrespondenceLinkServiceURL }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", name = "InsertCorrespondenceLinkServiceURL")
    public JAXBElement<InsertCorrespondenceLinkServiceURL> createInsertCorrespondenceLinkServiceURL(InsertCorrespondenceLinkServiceURL value) {
        return new JAXBElement<InsertCorrespondenceLinkServiceURL>(_InsertCorrespondenceLinkServiceURL_QNAME, InsertCorrespondenceLinkServiceURL.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SdpStatusDetails }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", name = "SdpStatusDetails")
    public JAXBElement<SdpStatusDetails> createSdpStatusDetails(SdpStatusDetails value) {
        return new JAXBElement<SdpStatusDetails>(_SdpStatusDetails_QNAME, SdpStatusDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CorrespondenceStatusFilterV3 }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", name = "CorrespondenceStatusFilterV3")
    public JAXBElement<CorrespondenceStatusFilterV3> createCorrespondenceStatusFilterV3(CorrespondenceStatusFilterV3 value) {
        return new JAXBElement<CorrespondenceStatusFilterV3>(_CorrespondenceStatusFilterV3_QNAME, CorrespondenceStatusFilterV3.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XmlAttachmentListV2 }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", name = "XmlAttachmentListV2")
    public JAXBElement<XmlAttachmentListV2> createXmlAttachmentListV2(XmlAttachmentListV2 value) {
        return new JAXBElement<XmlAttachmentListV2>(_XmlAttachmentListV2_QNAME, XmlAttachmentListV2.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SdpStatusInformation }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", name = "SdpStatusInformation")
    public JAXBElement<SdpStatusInformation> createSdpStatusInformation(SdpStatusInformation value) {
        return new JAXBElement<SdpStatusInformation>(_SdpStatusInformation_QNAME, SdpStatusInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiptExternal }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/Intermediary/Receipt/2009/10", name = "ReceiptExternal")
    public JAXBElement<ReceiptExternal> createReceiptExternal(ReceiptExternal value) {
        return new JAXBElement<ReceiptExternal>(_ReceiptExternal_QNAME, ReceiptExternal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplyOption }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", name = "ReplyOption")
    public JAXBElement<ReplyOption> createReplyOption(ReplyOption value) {
        return new JAXBElement<ReplyOption>(_ReplyOption_QNAME, ReplyOption.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiptStatusEnum }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/Intermediary/Receipt/2009/10", name = "ReceiptStatusEnum")
    public JAXBElement<ReceiptStatusEnum> createReceiptStatusEnum(ReceiptStatusEnum value) {
        return new JAXBElement<ReceiptStatusEnum>(_ReceiptStatusEnum_QNAME, ReceiptStatusEnum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiptExternalList }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/Intermediary/Receipt/2009/10", name = "ReceiptExternalList")
    public JAXBElement<ReceiptExternalList> createReceiptExternalList(ReceiptExternalList value) {
        return new JAXBElement<ReceiptExternalList>(_ReceiptExternalList_QNAME, ReceiptExternalList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CorrespondenceServiceInfo }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2013/06", name = "CorrespondenceServiceInfo")
    public JAXBElement<CorrespondenceServiceInfo> createCorrespondenceServiceInfo(CorrespondenceServiceInfo value) {
        return new JAXBElement<CorrespondenceServiceInfo>(_CorrespondenceServiceInfo_QNAME, CorrespondenceServiceInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BinaryAttachmentV2 }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.altinn.no/services/ServiceEngine/ReporteeElementList/2010/10", name = "BinaryAttachmentV2")
    public JAXBElement<BinaryAttachmentV2> createBinaryAttachmentV2(BinaryAttachmentV2 value) {
        return new JAXBElement<BinaryAttachmentV2>(_BinaryAttachmentV2_QNAME, BinaryAttachmentV2.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SdpSetting }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", name = "SdpSetting")
    public JAXBElement<SdpSetting> createSdpSetting(SdpSetting value) {
        return new JAXBElement<SdpSetting>(_SdpSetting_QNAME, SdpSetting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Notification }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2013/11", name = "Notification")
    public JAXBElement<Notification> createNotificationStatus(Notification value) {
        return new JAXBElement<Notification>(_NotificationStatus_QNAME, Notification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExternalContentV2 }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", name = "ExternalContentV2")
    public JAXBElement<ExternalContentV2> createExternalContentV2(ExternalContentV2 value) {
        return new JAXBElement<ExternalContentV2>(_ExternalContentV2_QNAME, ExternalContentV2.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CorrespondenceStatusResultV2 }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2014/10", name = "CorrespondenceStatusResultV2")
    public JAXBElement<CorrespondenceStatusResultV2> createCorrespondenceStatusResultV2(CorrespondenceStatusResultV2 value) {
        return new JAXBElement<CorrespondenceStatusResultV2>(_CorrespondenceStatusResultV2_QNAME, CorrespondenceStatusResultV2.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link no.altinn.schemas.services.serviceengine.notification._2009._10.Notification }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Notification/2009/10", name = "Notification")
    public JAXBElement<no.altinn.schemas.services.serviceengine.notification._2009._10.Notification> createNotification(no.altinn.schemas.services.serviceengine.notification._2009._10.Notification value) {
        return new JAXBElement<no.altinn.schemas.services.serviceengine.notification._2009._10.Notification>(_Notification_QNAME, no.altinn.schemas.services.serviceengine.notification._2009._10.Notification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusChangeV2 }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2014/10", name = "StatusChangeV2")
    public JAXBElement<StatusChangeV2> createStatusChangeV2(StatusChangeV2 value) {
        return new JAXBElement<StatusChangeV2>(_StatusChangeV2_QNAME, StatusChangeV2.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextToken }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Notification/2009/10", name = "TextToken")
    public JAXBElement<TextToken> createTextToken(TextToken value) {
        return new JAXBElement<TextToken>(_TextToken_QNAME, TextToken.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertCorrespondenceV2 }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", name = "InsertCorrespondenceV2")
    public JAXBElement<InsertCorrespondenceV2> createInsertCorrespondenceV2(InsertCorrespondenceV2 value) {
        return new JAXBElement<InsertCorrespondenceV2>(_InsertCorrespondenceV2_QNAME, InsertCorrespondenceV2.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/Intermediary/Shipment/2009/10", name = "ReferenceType")
    public JAXBElement<ReferenceType> createReferenceType(ReferenceType value) {
        return new JAXBElement<ReferenceType>(_ReferenceType_QNAME, ReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CorrespondenceStatusTypeV2 }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/serviceEntity/2014/10", name = "CorrespondenceStatusTypeV2")
    public JAXBElement<CorrespondenceStatusTypeV2> createCorrespondenceStatusTypeV2(CorrespondenceStatusTypeV2 value) {
        return new JAXBElement<CorrespondenceStatusTypeV2>(_CorrespondenceStatusTypeV2_QNAME, CorrespondenceStatusTypeV2.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CorrespondenceStatusFilter }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2013/11", name = "CorrespondenceStatusFilter")
    public JAXBElement<CorrespondenceStatusFilter> createCorrespondenceStatusFilter(CorrespondenceStatusFilter value) {
        return new JAXBElement<CorrespondenceStatusFilter>(_CorrespondenceStatusFilter_QNAME, CorrespondenceStatusFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XmlAttachment }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.altinn.no/services/ServiceEngine/ReporteeElementList/2009/10", name = "XmlAttachment")
    public JAXBElement<XmlAttachment> createXmlAttachment(XmlAttachment value) {
        return new JAXBElement<XmlAttachment>(_XmlAttachment_QNAME, XmlAttachment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BinaryAttachmentExternalBEV2List }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.altinn.no/services/ServiceEngine/ReporteeElementList/2010/10", name = "BinaryAttachmentExternalBEV2List")
    public JAXBElement<BinaryAttachmentExternalBEV2List> createBinaryAttachmentExternalBEV2List(BinaryAttachmentExternalBEV2List value) {
        return new JAXBElement<BinaryAttachmentExternalBEV2List>(_BinaryAttachmentExternalBEV2List_QNAME, BinaryAttachmentExternalBEV2List.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BinaryAttachmentBEList }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.altinn.no/services/ServiceEngine/ReporteeElementList/2009/10", name = "BinaryAttachmentBEList")
    public JAXBElement<BinaryAttachmentBEList> createBinaryAttachmentBEList(BinaryAttachmentBEList value) {
        return new JAXBElement<BinaryAttachmentBEList>(_BinaryAttachmentBEList_QNAME, BinaryAttachmentBEList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/serviceengine/formsengine/2009/10", name = "TransportType")
    public JAXBElement<TransportType> createTransportType(TransportType value) {
        return new JAXBElement<TransportType>(_TransportType_QNAME, TransportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SdpOptions }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", name = "SdpOptions")
    public JAXBElement<SdpOptions> createSdpOptions(SdpOptions value) {
        return new JAXBElement<SdpOptions>(_SdpOptions_QNAME, SdpOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttachmentFunctionType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Subscription/2009/10", name = "AttachmentFunctionType")
    public JAXBElement<AttachmentFunctionType> createAttachmentFunctionType(AttachmentFunctionType value) {
        return new JAXBElement<AttachmentFunctionType>(_AttachmentFunctionType_QNAME, AttachmentFunctionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CorrespondenceInsertLinkBEList }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", name = "CorrespondenceInsertLinkBEList")
    public JAXBElement<CorrespondenceInsertLinkBEList> createCorrespondenceInsertLinkBEList(CorrespondenceInsertLinkBEList value) {
        return new JAXBElement<CorrespondenceInsertLinkBEList>(_CorrespondenceInsertLinkBEList_QNAME, CorrespondenceInsertLinkBEList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExternalContent }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", name = "ExternalContent")
    public JAXBElement<ExternalContent> createExternalContent(ExternalContent value) {
        return new JAXBElement<ExternalContent>(_ExternalContent_QNAME, ExternalContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNotification }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2013/11", name = "ArrayOfNotification")
    public JAXBElement<ArrayOfNotification> createArrayOfNotification(ArrayOfNotification value) {
        return new JAXBElement<ArrayOfNotification>(_ArrayOfNotification_QNAME, ArrayOfNotification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertCorrespondence }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", name = "InsertCorrespondence")
    public JAXBElement<InsertCorrespondence> createInsertCorrespondence(InsertCorrespondence value) {
        return new JAXBElement<InsertCorrespondence>(_InsertCorrespondence_QNAME, InsertCorrespondence.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SdpStatusChange }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", name = "SdpStatusChange")
    public JAXBElement<SdpStatusChange> createSdpStatusChange(SdpStatusChange value) {
        return new JAXBElement<SdpStatusChange>(_SdpStatusChange_QNAME, SdpStatusChange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationBEList }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Notification/2009/10", name = "NotificationBEList")
    public JAXBElement<NotificationBEList> createNotificationBEList(NotificationBEList value) {
        return new JAXBElement<NotificationBEList>(_NotificationBEList_QNAME, NotificationBEList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CorrespondenceStatusInformation }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", name = "CorrespondenceStatusInformation")
    public JAXBElement<CorrespondenceStatusInformation> createCorrespondenceStatusInformation(CorrespondenceStatusInformation value) {
        return new JAXBElement<CorrespondenceStatusInformation>(_CorrespondenceStatusInformation_QNAME, CorrespondenceStatusInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CorrespondenceStatusResultV3 }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", name = "CorrespondenceStatusResultV3")
    public JAXBElement<CorrespondenceStatusResultV3> createCorrespondenceStatusResultV3(CorrespondenceStatusResultV3 value) {
        return new JAXBElement<CorrespondenceStatusResultV3>(_CorrespondenceStatusResultV3_QNAME, CorrespondenceStatusResultV3.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CorrespondenceStatusResult }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2013/11", name = "CorrespondenceStatusResult")
    public JAXBElement<CorrespondenceStatusResult> createCorrespondenceStatusResult(CorrespondenceStatusResult value) {
        return new JAXBElement<CorrespondenceStatusResult>(_CorrespondenceStatusResult_QNAME, CorrespondenceStatusResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltinnFault }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.altinn.no/services/common/fault/2009/10", name = "AltinnFault")
    public JAXBElement<AltinnFault> createAltinnFault(AltinnFault value) {
        return new JAXBElement<AltinnFault>(_AltinnFault_QNAME, AltinnFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatusV2 }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2014/10", name = "ArrayOfStatusV2")
    public JAXBElement<ArrayOfStatusV2> createArrayOfStatusV2(ArrayOfStatusV2 value) {
        return new JAXBElement<ArrayOfStatusV2>(_ArrayOfStatusV2_QNAME, ArrayOfStatusV2.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2013/11", name = "Status")
    public JAXBElement<Status> createStatus(Status value) {
        return new JAXBElement<Status>(_Status_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BinaryAttachment }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.altinn.no/services/ServiceEngine/ReporteeElementList/2009/10", name = "BinaryAttachment")
    public JAXBElement<BinaryAttachment> createBinaryAttachment(BinaryAttachment value) {
        return new JAXBElement<BinaryAttachment>(_BinaryAttachment_QNAME, BinaryAttachment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Attachments }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", name = "Attachments")
    public JAXBElement<Attachments> createAttachments(Attachments value) {
        return new JAXBElement<Attachments>(_Attachments_QNAME, Attachments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiverEndPointBEList }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Notification/2009/10", name = "ReceiverEndPointBEList")
    public JAXBElement<ReceiverEndPointBEList> createReceiverEndPointBEList(ReceiverEndPointBEList value) {
        return new JAXBElement<ReceiverEndPointBEList>(_ReceiverEndPointBEList_QNAME, ReceiverEndPointBEList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertCorrespondenceLinkServiceCode }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", name = "InsertCorrespondenceLinkServiceCode")
    public JAXBElement<InsertCorrespondenceLinkServiceCode> createInsertCorrespondenceLinkServiceCode(InsertCorrespondenceLinkServiceCode value) {
        return new JAXBElement<InsertCorrespondenceLinkServiceCode>(_InsertCorrespondenceLinkServiceCode_QNAME, InsertCorrespondenceLinkServiceCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertCorrespondenceLinkArchiveRef }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", name = "InsertCorrespondenceLinkArchiveRef")
    public JAXBElement<InsertCorrespondenceLinkArchiveRef> createInsertCorrespondenceLinkArchiveRef(InsertCorrespondenceLinkArchiveRef value) {
        return new JAXBElement<InsertCorrespondenceLinkArchiveRef>(_InsertCorrespondenceLinkArchiveRef_QNAME, InsertCorrespondenceLinkArchiveRef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiverEndPoint }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Notification/2009/10", name = "ReceiverEndPoint")
    public JAXBElement<ReceiverEndPoint> createReceiverEndPoint(ReceiverEndPoint value) {
        return new JAXBElement<ReceiverEndPoint>(_ReceiverEndPoint_QNAME, ReceiverEndPoint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiptExternal }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.altinn.no/services/ServiceEngine/Correspondence/2009/10", name = "InsertCorrespondenceBasicV2Result", scope = InsertCorrespondenceBasicV2Response.class)
    public JAXBElement<ReceiptExternal> createInsertCorrespondenceBasicV2ResponseInsertCorrespondenceBasicV2Result(ReceiptExternal value) {
        return new JAXBElement<ReceiptExternal>(_InsertCorrespondenceBasicV2ResponseInsertCorrespondenceBasicV2Result_QNAME, ReceiptExternal.class, InsertCorrespondenceBasicV2Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", name = "ServiceEdition", scope = InsertCorrespondenceV2.class)
    public JAXBElement<String> createInsertCorrespondenceV2ServiceEdition(String value) {
        return new JAXBElement<String>(_InsertCorrespondenceV2ServiceEdition_QNAME, String.class, InsertCorrespondenceV2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExternalContentV2 }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", name = "Content", scope = InsertCorrespondenceV2.class)
    public JAXBElement<ExternalContentV2> createInsertCorrespondenceV2Content(ExternalContentV2 value) {
        return new JAXBElement<ExternalContentV2>(_InsertCorrespondenceV2Content_QNAME, ExternalContentV2.class, InsertCorrespondenceV2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", name = "IsReservable", scope = InsertCorrespondenceV2.class)
    public JAXBElement<Boolean> createInsertCorrespondenceV2IsReservable(Boolean value) {
        return new JAXBElement<Boolean>(_InsertCorrespondenceV2IsReservable_QNAME, Boolean.class, InsertCorrespondenceV2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", name = "ServiceCode", scope = InsertCorrespondenceV2.class)
    public JAXBElement<String> createInsertCorrespondenceV2ServiceCode(String value) {
        return new JAXBElement<String>(_InsertCorrespondenceV2ServiceCode_QNAME, String.class, InsertCorrespondenceV2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", name = "AllowSystemDeleteDateTime", scope = InsertCorrespondenceV2.class)
    public JAXBElement<XMLGregorianCalendar> createInsertCorrespondenceV2AllowSystemDeleteDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InsertCorrespondenceV2AllowSystemDeleteDateTime_QNAME, XMLGregorianCalendar.class, InsertCorrespondenceV2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", name = "Reportee", scope = InsertCorrespondenceV2.class)
    public JAXBElement<String> createInsertCorrespondenceV2Reportee(String value) {
        return new JAXBElement<String>(_InsertCorrespondenceV2Reportee_QNAME, String.class, InsertCorrespondenceV2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SdpOptions }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", name = "SdpOptions", scope = InsertCorrespondenceV2.class)
    public JAXBElement<SdpOptions> createInsertCorrespondenceV2SdpOptions(SdpOptions value) {
        return new JAXBElement<SdpOptions>(_InsertCorrespondenceV2SdpOptions_QNAME, SdpOptions.class, InsertCorrespondenceV2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationBEList }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", name = "Notifications", scope = InsertCorrespondenceV2.class)
    public JAXBElement<NotificationBEList> createInsertCorrespondenceV2Notifications(NotificationBEList value) {
        return new JAXBElement<NotificationBEList>(_InsertCorrespondenceV2Notifications_QNAME, NotificationBEList.class, InsertCorrespondenceV2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CorrespondenceInsertLinkBEList }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", name = "ReplyOptions", scope = InsertCorrespondenceV2.class)
    public JAXBElement<CorrespondenceInsertLinkBEList> createInsertCorrespondenceV2ReplyOptions(CorrespondenceInsertLinkBEList value) {
        return new JAXBElement<CorrespondenceInsertLinkBEList>(_InsertCorrespondenceV2ReplyOptions_QNAME, CorrespondenceInsertLinkBEList.class, InsertCorrespondenceV2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", name = "ArchiveReference", scope = InsertCorrespondenceV2.class)
    public JAXBElement<String> createInsertCorrespondenceV2ArchiveReference(String value) {
        return new JAXBElement<String>(_InsertCorrespondenceV2ArchiveReference_QNAME, String.class, InsertCorrespondenceV2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", name = "MessageSender", scope = InsertCorrespondenceV2.class)
    public JAXBElement<String> createInsertCorrespondenceV2MessageSender(String value) {
        return new JAXBElement<String>(_InsertCorrespondenceV2MessageSender_QNAME, String.class, InsertCorrespondenceV2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", name = "AllowForwarding", scope = InsertCorrespondenceV2.class)
    public JAXBElement<Boolean> createInsertCorrespondenceV2AllowForwarding(Boolean value) {
        return new JAXBElement<Boolean>(_InsertCorrespondenceV2AllowForwarding_QNAME, Boolean.class, InsertCorrespondenceV2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", name = "CaseID", scope = InsertCorrespondenceV2.class)
    public JAXBElement<Integer> createInsertCorrespondenceV2CaseID(Integer value) {
        return new JAXBElement<Integer>(_InsertCorrespondenceV2CaseID_QNAME, Integer.class, InsertCorrespondenceV2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/Intermediary/Receipt/2009/10", name = "ReceiptHistory", scope = ReceiptExternal.class)
    public JAXBElement<String> createReceiptExternalReceiptHistory(String value) {
        return new JAXBElement<String>(_ReceiptExternalReceiptHistory_QNAME, String.class, ReceiptExternal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceList }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/Intermediary/Receipt/2009/10", name = "References", scope = ReceiptExternal.class)
    public JAXBElement<ReferenceList> createReceiptExternalReferences(ReferenceList value) {
        return new JAXBElement<ReferenceList>(_ReceiptExternalReferences_QNAME, ReferenceList.class, ReceiptExternal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiptExternalList }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/Intermediary/Receipt/2009/10", name = "SubReceipts", scope = ReceiptExternal.class)
    public JAXBElement<ReceiptExternalList> createReceiptExternalSubReceipts(ReceiptExternalList value) {
        return new JAXBElement<ReceiptExternalList>(_ReceiptExternalSubReceipts_QNAME, ReceiptExternalList.class, ReceiptExternal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/Intermediary/Receipt/2009/10", name = "ReceiptText", scope = ReceiptExternal.class)
    public JAXBElement<String> createReceiptExternalReceiptText(String value) {
        return new JAXBElement<String>(_ReceiptExternalReceiptText_QNAME, String.class, ReceiptExternal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatusV2 }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", name = "CorrespondenceStatusDetailsList", scope = CorrespondenceStatusInformation.class)
    public JAXBElement<ArrayOfStatusV2> createCorrespondenceStatusInformationCorrespondenceStatusDetailsList(ArrayOfStatusV2 value) {
        return new JAXBElement<ArrayOfStatusV2>(_CorrespondenceStatusInformationCorrespondenceStatusDetailsList_QNAME, ArrayOfStatusV2.class, CorrespondenceStatusInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", name = "ArchiveRef", scope = InsertCorrespondenceLinkArchiveRef.class)
    public JAXBElement<String> createInsertCorrespondenceLinkArchiveRefArchiveRef(String value) {
        return new JAXBElement<String>(_InsertCorrespondenceLinkArchiveRefArchiveRef_QNAME, String.class, InsertCorrespondenceLinkArchiveRef.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", name = "DataFormatId", scope = XmlAttachmentV2.class)
    public JAXBElement<String> createXmlAttachmentV2DataFormatId(String value) {
        return new JAXBElement<String>(_XmlAttachmentV2DataFormatId_QNAME, String.class, XmlAttachmentV2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", name = "FormDataXml", scope = XmlAttachmentV2.class)
    public JAXBElement<String> createXmlAttachmentV2FormDataXml(String value) {
        return new JAXBElement<String>(_XmlAttachmentV2FormDataXml_QNAME, String.class, XmlAttachmentV2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", name = "SendersReference", scope = XmlAttachmentV2.class)
    public JAXBElement<String> createXmlAttachmentV2SendersReference(String value) {
        return new JAXBElement<String>(_XmlAttachmentV2SendersReference_QNAME, String.class, XmlAttachmentV2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", name = "ServiceCode", scope = CorrespondenceStatusResultV3.class)
    public JAXBElement<String> createCorrespondenceStatusResultV3ServiceCode(String value) {
        return new JAXBElement<String>(_CorrespondenceStatusResultV3ServiceCode_QNAME, String.class, CorrespondenceStatusResultV3.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SdpStatusInformation }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", name = "SdpStatusInformation", scope = CorrespondenceStatusResultV3.class)
    public JAXBElement<SdpStatusInformation> createCorrespondenceStatusResultV3SdpStatusInformation(SdpStatusInformation value) {
        return new JAXBElement<SdpStatusInformation>(_SdpStatusInformation_QNAME, SdpStatusInformation.class, CorrespondenceStatusResultV3.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CorrespondenceStatusInformation }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", name = "CorrespondenceStatusInformation", scope = CorrespondenceStatusResultV3.class)
    public JAXBElement<CorrespondenceStatusInformation> createCorrespondenceStatusResultV3CorrespondenceStatusInformation(CorrespondenceStatusInformation value) {
        return new JAXBElement<CorrespondenceStatusInformation>(_CorrespondenceStatusInformation_QNAME, CorrespondenceStatusInformation.class, CorrespondenceStatusResultV3.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Notification/2009/10", name = "TokenValue", scope = TextToken.class)
    public JAXBElement<String> createTextTokenTokenValue(String value) {
        return new JAXBElement<String>(_TextTokenTokenValue_QNAME, String.class, TextToken.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", name = "ServiceEdition", scope = InsertCorrespondenceLinkServiceCode.class)
    public JAXBElement<String> createInsertCorrespondenceLinkServiceCodeServiceEdition(String value) {
        return new JAXBElement<String>(_InsertCorrespondenceLinkServiceCodeServiceEdition_QNAME, String.class, InsertCorrespondenceLinkServiceCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", name = "ServiceCode", scope = InsertCorrespondenceLinkServiceCode.class)
    public JAXBElement<String> createInsertCorrespondenceLinkServiceCodeServiceCode(String value) {
        return new JAXBElement<String>(_InsertCorrespondenceLinkServiceCodeServiceCode_QNAME, String.class, InsertCorrespondenceLinkServiceCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", name = "LinkURL", scope = InsertCorrespondenceLinkServiceURL.class)
    public JAXBElement<String> createInsertCorrespondenceLinkServiceURLLinkURL(String value) {
        return new JAXBElement<String>(_InsertCorrespondenceLinkServiceURLLinkURL_QNAME, String.class, InsertCorrespondenceLinkServiceURL.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", name = "LinkText", scope = InsertCorrespondenceLinkServiceURL.class)
    public JAXBElement<String> createInsertCorrespondenceLinkServiceURLLinkText(String value) {
        return new JAXBElement<String>(_InsertCorrespondenceLinkServiceURLLinkText_QNAME, String.class, InsertCorrespondenceLinkServiceURL.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiptExternal }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.altinn.no/services/ServiceEngine/Correspondence/2009/10", name = "InsertCorrespondenceBasicResult", scope = InsertCorrespondenceBasicResponse.class)
    public JAXBElement<ReceiptExternal> createInsertCorrespondenceBasicResponseInsertCorrespondenceBasicResult(ReceiptExternal value) {
        return new JAXBElement<ReceiptExternal>(_InsertCorrespondenceBasicResponseInsertCorrespondenceBasicResult_QNAME, ReceiptExternal.class, InsertCorrespondenceBasicResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SdpStatusSearchOptions }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", name = "SdpSearchOptions", scope = CorrespondenceStatusFilterV3.class)
    public JAXBElement<SdpStatusSearchOptions> createCorrespondenceStatusFilterV3SdpSearchOptions(SdpStatusSearchOptions value) {
        return new JAXBElement<SdpStatusSearchOptions>(_CorrespondenceStatusFilterV3SdpSearchOptions_QNAME, SdpStatusSearchOptions.class, CorrespondenceStatusFilterV3.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", name = "NotificationSent", scope = CorrespondenceStatusFilterV3.class)
    public JAXBElement<Boolean> createCorrespondenceStatusFilterV3NotificationSent(Boolean value) {
        return new JAXBElement<Boolean>(_CorrespondenceStatusFilterV3NotificationSent_QNAME, Boolean.class, CorrespondenceStatusFilterV3.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", name = "Reportee", scope = CorrespondenceStatusFilterV3.class)
    public JAXBElement<String> createCorrespondenceStatusFilterV3Reportee(String value) {
        return new JAXBElement<String>(_CorrespondenceStatusFilterV3Reportee_QNAME, String.class, CorrespondenceStatusFilterV3.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", name = "CreatedBeforeDate", scope = CorrespondenceStatusFilterV3.class)
    public JAXBElement<XMLGregorianCalendar> createCorrespondenceStatusFilterV3CreatedBeforeDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CorrespondenceStatusFilterV3CreatedBeforeDate_QNAME, XMLGregorianCalendar.class, CorrespondenceStatusFilterV3.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", name = "SendersReference", scope = CorrespondenceStatusFilterV3.class)
    public JAXBElement<String> createCorrespondenceStatusFilterV3SendersReference(String value) {
        return new JAXBElement<String>(_CorrespondenceStatusFilterV3SendersReference_QNAME, String.class, CorrespondenceStatusFilterV3.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", name = "CreatedAfterDate", scope = CorrespondenceStatusFilterV3.class)
    public JAXBElement<XMLGregorianCalendar> createCorrespondenceStatusFilterV3CreatedAfterDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CorrespondenceStatusFilterV3CreatedAfterDate_QNAME, XMLGregorianCalendar.class, CorrespondenceStatusFilterV3.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", name = "BackupAltinn", scope = SdpOptions.class)
    public JAXBElement<Boolean> createSdpOptionsBackupAltinn(Boolean value) {
        return new JAXBElement<Boolean>(_SdpOptionsBackupAltinn_QNAME, Boolean.class, SdpOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2014/10", name = "ServiceCode", scope = CorrespondenceStatusResultV2.class)
    public JAXBElement<String> createCorrespondenceStatusResultV2ServiceCode(String value) {
        return new JAXBElement<String>(_CorrespondenceStatusResultV2ServiceCode_QNAME, String.class, CorrespondenceStatusResultV2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatusV2 }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2014/10", name = "StatusList", scope = CorrespondenceStatusResultV2.class)
    public JAXBElement<ArrayOfStatusV2> createCorrespondenceStatusResultV2StatusList(ArrayOfStatusV2 value) {
        return new JAXBElement<ArrayOfStatusV2>(_CorrespondenceStatusResultV2StatusList_QNAME, ArrayOfStatusV2.class, CorrespondenceStatusResultV2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", name = "LanguageCode", scope = ExternalContentV2.class)
    public JAXBElement<String> createExternalContentV2LanguageCode(String value) {
        return new JAXBElement<String>(_ExternalContentV2LanguageCode_QNAME, String.class, ExternalContentV2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", name = "MessageTitle", scope = ExternalContentV2.class)
    public JAXBElement<String> createExternalContentV2MessageTitle(String value) {
        return new JAXBElement<String>(_ExternalContentV2MessageTitle_QNAME, String.class, ExternalContentV2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttachmentsV2 }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", name = "Attachments", scope = ExternalContentV2.class)
    public JAXBElement<AttachmentsV2> createExternalContentV2Attachments(AttachmentsV2 value) {
        return new JAXBElement<AttachmentsV2>(_ExternalContentV2Attachments_QNAME, AttachmentsV2.class, ExternalContentV2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", name = "MessageSummary", scope = ExternalContentV2.class)
    public JAXBElement<String> createExternalContentV2MessageSummary(String value) {
        return new JAXBElement<String>(_ExternalContentV2MessageSummary_QNAME, String.class, ExternalContentV2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", name = "MessageBody", scope = ExternalContentV2.class)
    public JAXBElement<String> createExternalContentV2MessageBody(String value) {
        return new JAXBElement<String>(_ExternalContentV2MessageBody_QNAME, String.class, ExternalContentV2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", name = "CustomMessageData", scope = ExternalContentV2.class)
    public JAXBElement<String> createExternalContentV2CustomMessageData(String value) {
        return new JAXBElement<String>(_ExternalContentV2CustomMessageData_QNAME, String.class, ExternalContentV2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2013/06", name = "ExternalServiceCode", scope = CorrespondenceServiceInfo.class)
    public JAXBElement<String> createCorrespondenceServiceInfoExternalServiceCode(String value) {
        return new JAXBElement<String>(_CorrespondenceServiceInfoExternalServiceCode_QNAME, String.class, CorrespondenceServiceInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BinaryAttachmentBEList }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", name = "BinaryAttachments", scope = Attachments.class)
    public JAXBElement<BinaryAttachmentBEList> createAttachmentsBinaryAttachments(BinaryAttachmentBEList value) {
        return new JAXBElement<BinaryAttachmentBEList>(_AttachmentsBinaryAttachments_QNAME, BinaryAttachmentBEList.class, Attachments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XmlAttachment }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", name = "XmlAttachment", scope = Attachments.class)
    public JAXBElement<XmlAttachment> createAttachmentsXmlAttachment(XmlAttachment value) {
        return new JAXBElement<XmlAttachment>(_AttachmentsXmlAttachment_QNAME, XmlAttachment.class, Attachments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertCorrespondenceLinkArchiveRef }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", name = "ArchiveReference", scope = ReplyOption.class)
    public JAXBElement<InsertCorrespondenceLinkArchiveRef> createReplyOptionArchiveReference(InsertCorrespondenceLinkArchiveRef value) {
        return new JAXBElement<InsertCorrespondenceLinkArchiveRef>(_ReplyOptionArchiveReference_QNAME, InsertCorrespondenceLinkArchiveRef.class, ReplyOption.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertCorrespondenceLinkServiceURL }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", name = "URL", scope = ReplyOption.class)
    public JAXBElement<InsertCorrespondenceLinkServiceURL> createReplyOptionURL(InsertCorrespondenceLinkServiceURL value) {
        return new JAXBElement<InsertCorrespondenceLinkServiceURL>(_ReplyOptionURL_QNAME, InsertCorrespondenceLinkServiceURL.class, ReplyOption.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertCorrespondenceLinkServiceCode }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", name = "Service", scope = ReplyOption.class)
    public JAXBElement<InsertCorrespondenceLinkServiceCode> createReplyOptionService(InsertCorrespondenceLinkServiceCode value) {
        return new JAXBElement<InsertCorrespondenceLinkServiceCode>(_ReplyOptionService_QNAME, InsertCorrespondenceLinkServiceCode.class, ReplyOption.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Notification/2009/10", name = "LanguageCode", scope = no.altinn.schemas.services.serviceengine.notification._2009._10.Notification.class)
    public JAXBElement<String> createNotificationLanguageCode(String value) {
        return new JAXBElement<String>(_NotificationLanguageCode_QNAME, String.class, no.altinn.schemas.services.serviceengine.notification._2009._10.Notification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Notification/2009/10", name = "FromAddress", scope = no.altinn.schemas.services.serviceengine.notification._2009._10.Notification.class)
    public JAXBElement<String> createNotificationFromAddress(String value) {
        return new JAXBElement<String>(_NotificationFromAddress_QNAME, String.class, no.altinn.schemas.services.serviceengine.notification._2009._10.Notification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Notification/2009/10", name = "NotificationType", scope = no.altinn.schemas.services.serviceengine.notification._2009._10.Notification.class)
    public JAXBElement<String> createNotificationNotificationType(String value) {
        return new JAXBElement<String>(_NotificationNotificationType_QNAME, String.class, no.altinn.schemas.services.serviceengine.notification._2009._10.Notification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextTokenSubstitutionBEList }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Notification/2009/10", name = "TextTokens", scope = no.altinn.schemas.services.serviceengine.notification._2009._10.Notification.class)
    public JAXBElement<TextTokenSubstitutionBEList> createNotificationTextTokens(TextTokenSubstitutionBEList value) {
        return new JAXBElement<TextTokenSubstitutionBEList>(_NotificationTextTokens_QNAME, TextTokenSubstitutionBEList.class, no.altinn.schemas.services.serviceengine.notification._2009._10.Notification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiverEndPointBEList }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Notification/2009/10", name = "ReceiverEndPoints", scope = no.altinn.schemas.services.serviceengine.notification._2009._10.Notification.class)
    public JAXBElement<ReceiverEndPointBEList> createNotificationReceiverEndPoints(ReceiverEndPointBEList value) {
        return new JAXBElement<ReceiverEndPointBEList>(_NotificationReceiverEndPoints_QNAME, ReceiverEndPointBEList.class, no.altinn.schemas.services.serviceengine.notification._2009._10.Notification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertCorrespondence }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.altinn.no/services/ServiceEngine/Correspondence/2009/10", name = "Correspondence", scope = InsertCorrespondenceBasic.class)
    public JAXBElement<InsertCorrespondence> createInsertCorrespondenceBasicCorrespondence(InsertCorrespondence value) {
        return new JAXBElement<InsertCorrespondence>(_InsertCorrespondenceBasicCorrespondence_QNAME, InsertCorrespondence.class, InsertCorrespondenceBasic.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.altinn.no/services/ServiceEngine/Correspondence/2009/10", name = "systemUserName", scope = InsertCorrespondenceBasic.class)
    public JAXBElement<String> createInsertCorrespondenceBasicSystemUserName(String value) {
        return new JAXBElement<String>(_InsertCorrespondenceBasicSystemUserName_QNAME, String.class, InsertCorrespondenceBasic.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.altinn.no/services/ServiceEngine/Correspondence/2009/10", name = "SystemUserCode", scope = InsertCorrespondenceBasic.class)
    public JAXBElement<String> createInsertCorrespondenceBasicSystemUserCode(String value) {
        return new JAXBElement<String>(_InsertCorrespondenceBasicSystemUserCode_QNAME, String.class, InsertCorrespondenceBasic.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.altinn.no/services/ServiceEngine/Correspondence/2009/10", name = "systemPassword", scope = InsertCorrespondenceBasic.class)
    public JAXBElement<String> createInsertCorrespondenceBasicSystemPassword(String value) {
        return new JAXBElement<String>(_InsertCorrespondenceBasicSystemPassword_QNAME, String.class, InsertCorrespondenceBasic.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.altinn.no/services/ServiceEngine/Correspondence/2009/10", name = "ExternalReference", scope = InsertCorrespondenceBasic.class)
    public JAXBElement<String> createInsertCorrespondenceBasicExternalReference(String value) {
        return new JAXBElement<String>(_InsertCorrespondenceBasicExternalReference_QNAME, String.class, InsertCorrespondenceBasic.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.altinn.no/services/ServiceEngine/ReporteeElementList/2009/10", name = "FormDataXml", scope = XmlAttachment.class)
    public JAXBElement<String> createXmlAttachmentFormDataXml(String value) {
        return new JAXBElement<String>(_XmlAttachmentFormDataXml_QNAME, String.class, XmlAttachment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.altinn.no/services/ServiceEngine/ReporteeElementList/2009/10", name = "SendersReference", scope = XmlAttachment.class)
    public JAXBElement<String> createXmlAttachmentSendersReference(String value) {
        return new JAXBElement<String>(_XmlAttachmentSendersReference_QNAME, String.class, XmlAttachment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.altinn.no/services/ServiceEngine/ReporteeElementList/2010/10", name = "SendersReference", scope = BinaryAttachmentV2.class)
    public JAXBElement<String> createBinaryAttachmentV2SendersReference(String value) {
        return new JAXBElement<String>(_BinaryAttachmentV2SendersReference_QNAME, String.class, BinaryAttachmentV2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.altinn.no/services/ServiceEngine/ReporteeElementList/2010/10", name = "Name", scope = BinaryAttachmentV2.class)
    public JAXBElement<String> createBinaryAttachmentV2Name(String value) {
        return new JAXBElement<String>(_BinaryAttachmentV2Name_QNAME, String.class, BinaryAttachmentV2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.altinn.no/services/ServiceEngine/ReporteeElementList/2010/10", name = "Data", scope = BinaryAttachmentV2.class)
    public JAXBElement<byte[]> createBinaryAttachmentV2Data(byte[] value) {
        return new JAXBElement<byte[]>(_BinaryAttachmentV2Data_QNAME, byte[].class, BinaryAttachmentV2.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.altinn.no/services/ServiceEngine/ReporteeElementList/2010/10", name = "FileName", scope = BinaryAttachmentV2.class)
    public JAXBElement<String> createBinaryAttachmentV2FileName(String value) {
        return new JAXBElement<String>(_BinaryAttachmentV2FileName_QNAME, String.class, BinaryAttachmentV2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", name = "LanguageCode", scope = ExternalContent.class)
    public JAXBElement<String> createExternalContentLanguageCode(String value) {
        return new JAXBElement<String>(_ExternalContentLanguageCode_QNAME, String.class, ExternalContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", name = "MessageTitle", scope = ExternalContent.class)
    public JAXBElement<String> createExternalContentMessageTitle(String value) {
        return new JAXBElement<String>(_ExternalContentMessageTitle_QNAME, String.class, ExternalContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Attachments }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", name = "Attachments", scope = ExternalContent.class)
    public JAXBElement<Attachments> createExternalContentAttachments(Attachments value) {
        return new JAXBElement<Attachments>(_Attachments_QNAME, Attachments.class, ExternalContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", name = "MessageSummary", scope = ExternalContent.class)
    public JAXBElement<String> createExternalContentMessageSummary(String value) {
        return new JAXBElement<String>(_ExternalContentMessageSummary_QNAME, String.class, ExternalContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", name = "MessageBody", scope = ExternalContent.class)
    public JAXBElement<String> createExternalContentMessageBody(String value) {
        return new JAXBElement<String>(_ExternalContentMessageBody_QNAME, String.class, ExternalContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", name = "CustomMessageData", scope = ExternalContent.class)
    public JAXBElement<String> createExternalContentCustomMessageData(String value) {
        return new JAXBElement<String>(_ExternalContentCustomMessageData_QNAME, String.class, ExternalContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/Intermediary/Receipt/2009/10", name = "ReferenceValue", scope = Reference.class)
    public JAXBElement<String> createReferenceReferenceValue(String value) {
        return new JAXBElement<String>(_ReferenceReferenceValue_QNAME, String.class, Reference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CorrespondenceStatusResultV3 }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.altinn.no/services/ServiceEngine/Correspondence/2009/10", name = "GetCorrespondenceStatusDetailsBasicV3Result", scope = GetCorrespondenceStatusDetailsBasicV3Response.class)
    public JAXBElement<CorrespondenceStatusResultV3> createGetCorrespondenceStatusDetailsBasicV3ResponseGetCorrespondenceStatusDetailsBasicV3Result(CorrespondenceStatusResultV3 value) {
        return new JAXBElement<CorrespondenceStatusResultV3>(_GetCorrespondenceStatusDetailsBasicV3ResponseGetCorrespondenceStatusDetailsBasicV3Result_QNAME, CorrespondenceStatusResultV3.class, GetCorrespondenceStatusDetailsBasicV3Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSdpStatusDetails }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", name = "SdpStatusDetailsList", scope = SdpStatusInformation.class)
    public JAXBElement<ArrayOfSdpStatusDetails> createSdpStatusInformationSdpStatusDetailsList(ArrayOfSdpStatusDetails value) {
        return new JAXBElement<ArrayOfSdpStatusDetails>(_SdpStatusInformationSdpStatusDetailsList_QNAME, ArrayOfSdpStatusDetails.class, SdpStatusInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", name = "Reportee", scope = SdpStatusDetails.class)
    public JAXBElement<String> createSdpStatusDetailsReportee(String value) {
        return new JAXBElement<String>(_CorrespondenceStatusFilterV3Reportee_QNAME, String.class, SdpStatusDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", name = "CorrespondenceId", scope = SdpStatusDetails.class)
    public JAXBElement<Integer> createSdpStatusDetailsCorrespondenceId(Integer value) {
        return new JAXBElement<Integer>(_SdpStatusDetailsCorrespondenceId_QNAME, Integer.class, SdpStatusDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", name = "Reference", scope = SdpStatusDetails.class)
    public JAXBElement<String> createSdpStatusDetailsReference(String value) {
        return new JAXBElement<String>(_SdpStatusDetailsReference_QNAME, String.class, SdpStatusDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSdpStatusChange }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2016/02", name = "StatusHistory", scope = SdpStatusDetails.class)
    public JAXBElement<ArrayOfSdpStatusChange> createSdpStatusDetailsStatusHistory(ArrayOfSdpStatusChange value) {
        return new JAXBElement<ArrayOfSdpStatusChange>(_SdpStatusDetailsStatusHistory_QNAME, ArrayOfSdpStatusChange.class, SdpStatusDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2013/11", name = "CreatedBeforeDate", scope = CorrespondenceStatusFilter.class)
    public JAXBElement<XMLGregorianCalendar> createCorrespondenceStatusFilterCreatedBeforeDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CorrespondenceStatusFilterCreatedBeforeDate_QNAME, XMLGregorianCalendar.class, CorrespondenceStatusFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2013/11", name = "NotificationSent", scope = CorrespondenceStatusFilter.class)
    public JAXBElement<Boolean> createCorrespondenceStatusFilterNotificationSent(Boolean value) {
        return new JAXBElement<Boolean>(_CorrespondenceStatusFilterNotificationSent_QNAME, Boolean.class, CorrespondenceStatusFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2013/11", name = "Reportee", scope = CorrespondenceStatusFilter.class)
    public JAXBElement<String> createCorrespondenceStatusFilterReportee(String value) {
        return new JAXBElement<String>(_CorrespondenceStatusFilterReportee_QNAME, String.class, CorrespondenceStatusFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2013/11", name = "CreatedAfterDate", scope = CorrespondenceStatusFilter.class)
    public JAXBElement<XMLGregorianCalendar> createCorrespondenceStatusFilterCreatedAfterDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CorrespondenceStatusFilterCreatedAfterDate_QNAME, XMLGregorianCalendar.class, CorrespondenceStatusFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2013/11", name = "SendersReference", scope = CorrespondenceStatusFilter.class)
    public JAXBElement<String> createCorrespondenceStatusFilterSendersReference(String value) {
        return new JAXBElement<String>(_CorrespondenceStatusFilterSendersReference_QNAME, String.class, CorrespondenceStatusFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XmlAttachmentListV2 }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", name = "XmlAttachmentList", scope = AttachmentsV2.class)
    public JAXBElement<XmlAttachmentListV2> createAttachmentsV2XmlAttachmentList(XmlAttachmentListV2 value) {
        return new JAXBElement<XmlAttachmentListV2>(_AttachmentsV2XmlAttachmentList_QNAME, XmlAttachmentListV2.class, AttachmentsV2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BinaryAttachmentExternalBEV2List }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2010/10", name = "BinaryAttachments", scope = AttachmentsV2.class)
    public JAXBElement<BinaryAttachmentExternalBEV2List> createAttachmentsV2BinaryAttachments(BinaryAttachmentExternalBEV2List value) {
        return new JAXBElement<BinaryAttachmentExternalBEV2List>(_AttachmentsV2BinaryAttachments_QNAME, BinaryAttachmentExternalBEV2List.class, AttachmentsV2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Notification/2009/10", name = "ReceiverAddress", scope = ReceiverEndPoint.class)
    public JAXBElement<String> createReceiverEndPointReceiverAddress(String value) {
        return new JAXBElement<String>(_ReceiverEndPointReceiverAddress_QNAME, String.class, ReceiverEndPoint.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Notification/2009/10", name = "TransportType", scope = ReceiverEndPoint.class)
    public JAXBElement<TransportType> createReceiverEndPointTransportType(TransportType value) {
        return new JAXBElement<TransportType>(_ReceiverEndPointTransportType_QNAME, TransportType.class, ReceiverEndPoint.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2014/10", name = "Reportee", scope = StatusV2.class)
    public JAXBElement<String> createStatusV2Reportee(String value) {
        return new JAXBElement<String>(_StatusV2Reportee_QNAME, String.class, StatusV2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatusChangeV2 }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2014/10", name = "StatusChanges", scope = StatusV2.class)
    public JAXBElement<ArrayOfStatusChangeV2> createStatusV2StatusChanges(ArrayOfStatusChangeV2 value) {
        return new JAXBElement<ArrayOfStatusChangeV2>(_StatusV2StatusChanges_QNAME, ArrayOfStatusChangeV2.class, StatusV2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNotification }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2014/10", name = "Notifications", scope = StatusV2.class)
    public JAXBElement<ArrayOfNotification> createStatusV2Notifications(ArrayOfNotification value) {
        return new JAXBElement<ArrayOfNotification>(_StatusV2Notifications_QNAME, ArrayOfNotification.class, StatusV2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2014/10", name = "SendersReference", scope = StatusV2.class)
    public JAXBElement<String> createStatusV2SendersReference(String value) {
        return new JAXBElement<String>(_StatusV2SendersReference_QNAME, String.class, StatusV2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.altinn.no/services/ServiceEngine/ReporteeElementList/2009/10", name = "FileName", scope = BinaryAttachment.class)
    public JAXBElement<String> createBinaryAttachmentFileName(String value) {
        return new JAXBElement<String>(_BinaryAttachmentFileName_QNAME, String.class, BinaryAttachment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.altinn.no/services/ServiceEngine/ReporteeElementList/2009/10", name = "SendersReference", scope = BinaryAttachment.class)
    public JAXBElement<String> createBinaryAttachmentSendersReference(String value) {
        return new JAXBElement<String>(_XmlAttachmentSendersReference_QNAME, String.class, BinaryAttachment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.altinn.no/services/ServiceEngine/ReporteeElementList/2009/10", name = "Name", scope = BinaryAttachment.class)
    public JAXBElement<String> createBinaryAttachmentName(String value) {
        return new JAXBElement<String>(_BinaryAttachmentName_QNAME, String.class, BinaryAttachment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.altinn.no/services/ServiceEngine/ReporteeElementList/2009/10", name = "Data", scope = BinaryAttachment.class)
    public JAXBElement<byte[]> createBinaryAttachmentData(byte[] value) {
        return new JAXBElement<byte[]>(_BinaryAttachmentData_QNAME, byte[].class, BinaryAttachment.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CorrespondenceStatusResultV2 }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.altinn.no/services/ServiceEngine/Correspondence/2009/10", name = "GetCorrespondenceStatusDetailsBasicV2Result", scope = GetCorrespondenceStatusDetailsBasicV2Response.class)
    public JAXBElement<CorrespondenceStatusResultV2> createGetCorrespondenceStatusDetailsBasicV2ResponseGetCorrespondenceStatusDetailsBasicV2Result(CorrespondenceStatusResultV2 value) {
        return new JAXBElement<CorrespondenceStatusResultV2>(_GetCorrespondenceStatusDetailsBasicV2ResponseGetCorrespondenceStatusDetailsBasicV2Result_QNAME, CorrespondenceStatusResultV2.class, GetCorrespondenceStatusDetailsBasicV2Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2013/11", name = "Reportee", scope = Status.class)
    public JAXBElement<String> createStatusReportee(String value) {
        return new JAXBElement<String>(_CorrespondenceStatusFilterReportee_QNAME, String.class, Status.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNotification }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2013/11", name = "Notifications", scope = Status.class)
    public JAXBElement<ArrayOfNotification> createStatusNotifications(ArrayOfNotification value) {
        return new JAXBElement<ArrayOfNotification>(_StatusNotifications_QNAME, ArrayOfNotification.class, Status.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2013/11", name = "SendersReference", scope = Status.class)
    public JAXBElement<String> createStatusSendersReference(String value) {
        return new JAXBElement<String>(_CorrespondenceStatusFilterSendersReference_QNAME, String.class, Status.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatusChange }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2013/11", name = "StatusChanges", scope = Status.class)
    public JAXBElement<ArrayOfStatusChange> createStatusStatusChanges(ArrayOfStatusChange value) {
        return new JAXBElement<ArrayOfStatusChange>(_StatusStatusChanges_QNAME, ArrayOfStatusChange.class, Status.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CorrespondenceServiceInfo }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.altinn.no/services/ServiceEngine/Correspondence/2009/10", name = "CreateSimpleCorrespondenceServiceBasicResult", scope = CreateSimpleCorrespondenceServiceBasicResponse.class)
    public JAXBElement<CorrespondenceServiceInfo> createCreateSimpleCorrespondenceServiceBasicResponseCreateSimpleCorrespondenceServiceBasicResult(CorrespondenceServiceInfo value) {
        return new JAXBElement<CorrespondenceServiceInfo>(_CreateSimpleCorrespondenceServiceBasicResponseCreateSimpleCorrespondenceServiceBasicResult_QNAME, CorrespondenceServiceInfo.class, CreateSimpleCorrespondenceServiceBasicResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2014/10", name = "NotificationSent", scope = CorrespondenceStatusFilterV2.class)
    public JAXBElement<Boolean> createCorrespondenceStatusFilterV2NotificationSent(Boolean value) {
        return new JAXBElement<Boolean>(_CorrespondenceStatusFilterV2NotificationSent_QNAME, Boolean.class, CorrespondenceStatusFilterV2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2014/10", name = "Reportee", scope = CorrespondenceStatusFilterV2.class)
    public JAXBElement<String> createCorrespondenceStatusFilterV2Reportee(String value) {
        return new JAXBElement<String>(_StatusV2Reportee_QNAME, String.class, CorrespondenceStatusFilterV2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2014/10", name = "CreatedBeforeDate", scope = CorrespondenceStatusFilterV2.class)
    public JAXBElement<XMLGregorianCalendar> createCorrespondenceStatusFilterV2CreatedBeforeDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CorrespondenceStatusFilterV2CreatedBeforeDate_QNAME, XMLGregorianCalendar.class, CorrespondenceStatusFilterV2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2014/10", name = "SendersReference", scope = CorrespondenceStatusFilterV2.class)
    public JAXBElement<String> createCorrespondenceStatusFilterV2SendersReference(String value) {
        return new JAXBElement<String>(_StatusV2SendersReference_QNAME, String.class, CorrespondenceStatusFilterV2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2014/10", name = "CreatedAfterDate", scope = CorrespondenceStatusFilterV2.class)
    public JAXBElement<XMLGregorianCalendar> createCorrespondenceStatusFilterV2CreatedAfterDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CorrespondenceStatusFilterV2CreatedAfterDate_QNAME, XMLGregorianCalendar.class, CorrespondenceStatusFilterV2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2013/11", name = "Recipient", scope = Notification.class)
    public JAXBElement<String> createNotificationStatusRecipient(String value) {
        return new JAXBElement<String>(_NotificationStatusRecipient_QNAME, String.class, Notification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2013/11", name = "SentDate", scope = Notification.class)
    public JAXBElement<XMLGregorianCalendar> createNotificationStatusSentDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_NotificationStatusSentDate_QNAME, XMLGregorianCalendar.class, Notification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatus }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2013/11", name = "StatusList", scope = CorrespondenceStatusResult.class)
    public JAXBElement<ArrayOfStatus> createCorrespondenceStatusResultStatusList(ArrayOfStatus value) {
        return new JAXBElement<ArrayOfStatus>(_CorrespondenceStatusResultStatusList_QNAME, ArrayOfStatus.class, CorrespondenceStatusResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2013/11", name = "ServiceCode", scope = CorrespondenceStatusResult.class)
    public JAXBElement<String> createCorrespondenceStatusResultServiceCode(String value) {
        return new JAXBElement<String>(_CorrespondenceStatusResultServiceCode_QNAME, String.class, CorrespondenceStatusResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CorrespondenceStatusResult }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.altinn.no/services/ServiceEngine/Correspondence/2009/10", name = "GetCorrespondenceStatusDetailsBasicResult", scope = GetCorrespondenceStatusDetailsBasicResponse.class)
    public JAXBElement<CorrespondenceStatusResult> createGetCorrespondenceStatusDetailsBasicResponseGetCorrespondenceStatusDetailsBasicResult(CorrespondenceStatusResult value) {
        return new JAXBElement<CorrespondenceStatusResult>(_GetCorrespondenceStatusDetailsBasicResponseGetCorrespondenceStatusDetailsBasicResult_QNAME, CorrespondenceStatusResult.class, GetCorrespondenceStatusDetailsBasicResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.altinn.no/services/common/fault/2009/10", name = "UserGuid", scope = AltinnFault.class)
    public JAXBElement<String> createAltinnFaultUserGuid(String value) {
        return new JAXBElement<String>(_AltinnFaultUserGuid_QNAME, String.class, AltinnFault.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.altinn.no/services/common/fault/2009/10", name = "UserId", scope = AltinnFault.class)
    public JAXBElement<String> createAltinnFaultUserId(String value) {
        return new JAXBElement<String>(_AltinnFaultUserId_QNAME, String.class, AltinnFault.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.altinn.no/services/common/fault/2009/10", name = "AltinnExtendedErrorMessage", scope = AltinnFault.class)
    public JAXBElement<String> createAltinnFaultAltinnExtendedErrorMessage(String value) {
        return new JAXBElement<String>(_AltinnFaultAltinnExtendedErrorMessage_QNAME, String.class, AltinnFault.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.altinn.no/services/common/fault/2009/10", name = "ErrorGuid", scope = AltinnFault.class)
    public JAXBElement<String> createAltinnFaultErrorGuid(String value) {
        return new JAXBElement<String>(_AltinnFaultErrorGuid_QNAME, String.class, AltinnFault.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.altinn.no/services/common/fault/2009/10", name = "AltinnLocalizedErrorMessage", scope = AltinnFault.class)
    public JAXBElement<String> createAltinnFaultAltinnLocalizedErrorMessage(String value) {
        return new JAXBElement<String>(_AltinnFaultAltinnLocalizedErrorMessage_QNAME, String.class, AltinnFault.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.altinn.no/services/common/fault/2009/10", name = "AltinnErrorMessage", scope = AltinnFault.class)
    public JAXBElement<String> createAltinnFaultAltinnErrorMessage(String value) {
        return new JAXBElement<String>(_AltinnFaultAltinnErrorMessage_QNAME, String.class, AltinnFault.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", name = "ArchiveReference", scope = InsertCorrespondence.class)
    public JAXBElement<String> createInsertCorrespondenceArchiveReference(String value) {
        return new JAXBElement<String>(_ReplyOptionArchiveReference_QNAME, String.class, InsertCorrespondence.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", name = "ServiceEdition", scope = InsertCorrespondence.class)
    public JAXBElement<String> createInsertCorrespondenceServiceEdition(String value) {
        return new JAXBElement<String>(_InsertCorrespondenceLinkServiceCodeServiceEdition_QNAME, String.class, InsertCorrespondence.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExternalContent }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", name = "Content", scope = InsertCorrespondence.class)
    public JAXBElement<ExternalContent> createInsertCorrespondenceContent(ExternalContent value) {
        return new JAXBElement<ExternalContent>(_InsertCorrespondenceContent_QNAME, ExternalContent.class, InsertCorrespondence.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", name = "ServiceCode", scope = InsertCorrespondence.class)
    public JAXBElement<String> createInsertCorrespondenceServiceCode(String value) {
        return new JAXBElement<String>(_InsertCorrespondenceLinkServiceCodeServiceCode_QNAME, String.class, InsertCorrespondence.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", name = "AllowSystemDeleteDateTime", scope = InsertCorrespondence.class)
    public JAXBElement<XMLGregorianCalendar> createInsertCorrespondenceAllowSystemDeleteDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InsertCorrespondenceAllowSystemDeleteDateTime_QNAME, XMLGregorianCalendar.class, InsertCorrespondence.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", name = "Reportee", scope = InsertCorrespondence.class)
    public JAXBElement<String> createInsertCorrespondenceReportee(String value) {
        return new JAXBElement<String>(_InsertCorrespondenceReportee_QNAME, String.class, InsertCorrespondence.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationBEList }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", name = "Notifications", scope = InsertCorrespondence.class)
    public JAXBElement<NotificationBEList> createInsertCorrespondenceNotifications(NotificationBEList value) {
        return new JAXBElement<NotificationBEList>(_InsertCorrespondenceNotifications_QNAME, NotificationBEList.class, InsertCorrespondence.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CorrespondenceInsertLinkBEList }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.altinn.no/services/ServiceEngine/Correspondence/2009/10", name = "ReplyOptions", scope = InsertCorrespondence.class)
    public JAXBElement<CorrespondenceInsertLinkBEList> createInsertCorrespondenceReplyOptions(CorrespondenceInsertLinkBEList value) {
        return new JAXBElement<CorrespondenceInsertLinkBEList>(_InsertCorrespondenceReplyOptions_QNAME, CorrespondenceInsertLinkBEList.class, InsertCorrespondence.class, value);
    }

}

