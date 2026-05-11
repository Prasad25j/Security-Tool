package com.example.entity;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "ASROLE")

public class AsRole {
 @Id
 private String ROLEGUID;
 private String COMPANYGUID;
 private String POLICYGUID;
 private String SEGMENTGUID;
 private String CLIENTGUID;
 private String EXTERNALCLIENTGUID;
 private String STATECODE;
 private String ROLECODE;
 private String PERCENTDOLLARCODE;
 private BigDecimal ROLEPERCENT;
 private BigDecimal ROLEAMOUNT;
 @Lob
 private String XMLDATA;
 private String STATUSCODE;
 
public String getROLEGUID() {
	return ROLEGUID;
}
public void setROLEGUID(String rOLEGUID) {
	ROLEGUID = rOLEGUID;
}
public String getCOMPANYGUID() {
	return COMPANYGUID;
}
public void setCOMPANYGUID(String cOMPANYGUID) {
	COMPANYGUID = cOMPANYGUID;
}
public String getPOLICYGUID() {
	return POLICYGUID;
}
public void setPOLICYGUID(String pOLICYGUID) {
	POLICYGUID = pOLICYGUID;
}
public String getSEGMENTGUID() {
	return SEGMENTGUID;
}
public void setSEGMENTGUID(String sEGMENTGUID) {
	SEGMENTGUID = sEGMENTGUID;
}
public String getCLIENTGUID() {
	return CLIENTGUID;
}
public void setCLIENTGUID(String cLIENTGUID) {
	CLIENTGUID = cLIENTGUID;
}
public String getEXTERNALCLIENTGUID() {
	return EXTERNALCLIENTGUID;
}
public void setEXTERNALCLIENTGUID(String eXTERNALCLIENTGUID) {
	EXTERNALCLIENTGUID = eXTERNALCLIENTGUID;
}
public String getSTATECODE() {
	return STATECODE;
}
public void setSTATECODE(String sTATECODE) {
	STATECODE = sTATECODE;
}
public String getROLECODE() {
	return ROLECODE;
}
public void setROLECODE(String rOLECODE) {
	ROLECODE = rOLECODE;
}
public String getPERCENTDOLLARCODE() {
	return PERCENTDOLLARCODE;
}
public void setPERCENTDOLLARCODE(String pERCENTDOLLARCODE) {
	PERCENTDOLLARCODE = pERCENTDOLLARCODE;
}
public BigDecimal getROLEPERCENT() {
	return ROLEPERCENT;
}
public void setROLEPERCENT(BigDecimal rOLEPERCENT) {
	ROLEPERCENT = rOLEPERCENT;
}
public BigDecimal getROLEAMOUNT() {
	return ROLEAMOUNT;
}
public void setROLEAMOUNT(BigDecimal rOLEAMOUNT) {
	ROLEAMOUNT = rOLEAMOUNT;
}
public String getXMLDATA() {
	return XMLDATA;
}
public void setXMLDATA(String xMLDATA) {
	XMLDATA = xMLDATA;
}
public String getSTATUSCODE() {
	return STATUSCODE;
}
public void setSTATUSCODE(String sTATUSCODE) {
	STATUSCODE = sTATUSCODE;
}
}
