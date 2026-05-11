package com.example.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ASREQUIREMENT")
public class AsRequirement {
   @Id
   private String REQUIREMENTGUID;
   private String REQUIREMENTDEFINITIONGUID;
   private String STATUSCODE;
   private String TYPECODE;
   private LocalDateTime OPENDATE;
   private LocalDateTime CLOSEDATE;
   private LocalDateTime DUEDATE;
   private LocalDateTime EXPIRATIONDATE;
   private LocalDateTime LASTMODIFIEDGMT;
   private String LASTMODIFIEDBY;
   private String MESSAGE;
   private String PREVIOUSSTATUSCODE;
   private String COMMENTS;
   private String CREATEDBY;
   private LocalDateTime OVERDUEGMT;
   private LocalDateTime NEXTPROCESSGMT;
   private LocalDateTime LOCKEDGMT;
   private LocalDateTime CREATEDGMT;
   
public String getREQUIREMENTGUID() {
	return REQUIREMENTGUID;
}
public void setREQUIREMENTGUID(String rEQUIREMENTGUID) {
	REQUIREMENTGUID = rEQUIREMENTGUID;
}
public String getREQUIREMENTDEFINITIONGUID() {
	return REQUIREMENTDEFINITIONGUID;
}
public void setREQUIREMENTDEFINITIONGUID(String rEQUIREMENTDEFINITIONGUID) {
	REQUIREMENTDEFINITIONGUID = rEQUIREMENTDEFINITIONGUID;
}
public String getSTATUSCODE() {
	return STATUSCODE;
}
public void setSTATUSCODE(String sTATUSCODE) {
	STATUSCODE = sTATUSCODE;
}
public String getTYPECODE() {
	return TYPECODE;
}
public void setTYPECODE(String tYPECODE) {
	TYPECODE = tYPECODE;
}
public LocalDateTime getOPENDATE() {
	return OPENDATE;
}
public void setOPENDATE(LocalDateTime oPENDATE) {
	OPENDATE = oPENDATE;
}
public LocalDateTime getCLOSEDATE() {
	return CLOSEDATE;
}
public void setCLOSEDATE(LocalDateTime cLOSEDATE) {
	CLOSEDATE = cLOSEDATE;
}
public LocalDateTime getDUEDATE() {
	return DUEDATE;
}
public void setDUEDATE(LocalDateTime dUEDATE) {
	DUEDATE = dUEDATE;
}
public LocalDateTime getEXPIRATIONDATE() {
	return EXPIRATIONDATE;
}
public void setEXPIRATIONDATE(LocalDateTime eXPIRATIONDATE) {
	EXPIRATIONDATE = eXPIRATIONDATE;
}
public LocalDateTime getLASTMODIFIEDGMT() {
	return LASTMODIFIEDGMT;
}
public void setLASTMODIFIEDGMT(LocalDateTime lASTMODIFIEDGMT) {
	LASTMODIFIEDGMT = lASTMODIFIEDGMT;
}
public String getLASTMODIFIEDBY() {
	return LASTMODIFIEDBY;
}
public void setLASTMODIFIEDBY(String lASTMODIFIEDBY) {
	LASTMODIFIEDBY = lASTMODIFIEDBY;
}
public String getMESSAGE() {
	return MESSAGE;
}
public void setMESSAGE(String mESSAGE) {
	MESSAGE = mESSAGE;
}
public String getPREVIOUSSTATUSCODE() {
	return PREVIOUSSTATUSCODE;
}
public void setPREVIOUSSTATUSCODE(String pREVIOUSSTATUSCODE) {
	PREVIOUSSTATUSCODE = pREVIOUSSTATUSCODE;
}
public String getCOMMENTS() {
	return COMMENTS;
}
public void setCOMMENTS(String cOMMENTS) {
	COMMENTS = cOMMENTS;
}
public String getCREATEDBY() {
	return CREATEDBY;
}
public void setCREATEDBY(String cREATEDBY) {
	CREATEDBY = cREATEDBY;
}
public LocalDateTime getOVERDUEGMT() {
	return OVERDUEGMT;
}
public void setOVERDUEGMT(LocalDateTime oVERDUEGMT) {
	OVERDUEGMT = oVERDUEGMT;
}
public LocalDateTime getNEXTPROCESSGMT() {
	return NEXTPROCESSGMT;
}
public void setNEXTPROCESSGMT(LocalDateTime nEXTPROCESSGMT) {
	NEXTPROCESSGMT = nEXTPROCESSGMT;
}
public LocalDateTime getLOCKEDGMT() {
	return LOCKEDGMT;
}
public void setLOCKEDGMT(LocalDateTime lOCKEDGMT) {
	LOCKEDGMT = lOCKEDGMT;
}
public LocalDateTime getCREATEDGMT() {
	return CREATEDGMT;
}
public void setCREATEDGMT(LocalDateTime cREATEDGMT) {
	CREATEDGMT = cREATEDGMT;
}
   

}
