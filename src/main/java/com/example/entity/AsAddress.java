package com.example.entity;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
@Entity
@Table(name = "ASADDRESS")
public class AsAddress {
 @Id
 private String ADDRESSGUID;
 private String ADDRESSLINE1;
 private String ADDRESSLINE2;
 private String ADDRESSLINE3;
 private String ADDRESSLINE4;
 private String CITY;
 private String STATECODE;
 private String COUNTRYCODE;
 private String POSTALID;
 private String EMAIL;
 private String PHONENUMBER;
 private String FAXNUMBER;
 @Lob
 private String XMLDATA;
 private LocalDateTime EFFECTIVEDATE;
 private LocalDateTime EXPIRATIONDATE;
 private String ADDRESSLINE5;
 private String ADDRESSLINE6;
 private String REGIONCODE;
 private String MUNICIPALITYCODE;
 
public String getADDRESSGUID() {
	return ADDRESSGUID;
}
public void setADDRESSGUID(String aDDRESSGUID) {
	ADDRESSGUID = aDDRESSGUID;
}
public String getADDRESSLINE1() {
	return ADDRESSLINE1;
}
public void setADDRESSLINE1(String aDDRESSLINE1) {
	ADDRESSLINE1 = aDDRESSLINE1;
}
public String getADDRESSLINE2() {
	return ADDRESSLINE2;
}
public void setADDRESSLINE2(String aDDRESSLINE2) {
	ADDRESSLINE2 = aDDRESSLINE2;
}
public String getADDRESSLINE3() {
	return ADDRESSLINE3;
}
public void setADDRESSLINE3(String aDDRESSLINE3) {
	ADDRESSLINE3 = aDDRESSLINE3;
}
public String getADDRESSLINE4() {
	return ADDRESSLINE4;
}
public void setADDRESSLINE4(String aDDRESSLINE4) {
	ADDRESSLINE4 = aDDRESSLINE4;
}
public String getCITY() {
	return CITY;
}
public void setCITY(String cITY) {
	CITY = cITY;
}
public String getSTATECODE() {
	return STATECODE;
}
public void setSTATECODE(String sTATECODE) {
	STATECODE = sTATECODE;
}
public String getCOUNTRYCODE() {
	return COUNTRYCODE;
}
public void setCOUNTRYCODE(String cOUNTRYCODE) {
	COUNTRYCODE = cOUNTRYCODE;
}
public String getPOSTALID() {
	return POSTALID;
}
public void setPOSTALID(String pOSTALID) {
	POSTALID = pOSTALID;
}
public String getEMAIL() {
	return EMAIL;
}
public void setEMAIL(String eMAIL) {
	EMAIL = eMAIL;
}
public String getPHONENUMBER() {
	return PHONENUMBER;
}
public void setPHONENUMBER(String pHONENUMBER) {
	PHONENUMBER = pHONENUMBER;
}
public String getFAXNUMBER() {
	return FAXNUMBER;
}
public void setFAXNUMBER(String fAXNUMBER) {
	FAXNUMBER = fAXNUMBER;
}
public String getXMLDATA() {
	return XMLDATA;
}
public void setXMLDATA(String xMLDATA) {
	XMLDATA = xMLDATA;
}
public LocalDateTime getEFFECTIVEDATE() {
	return EFFECTIVEDATE;
}
public void setEFFECTIVEDATE(LocalDateTime eFFECTIVEDATE) {
	EFFECTIVEDATE = eFFECTIVEDATE;
}
public LocalDateTime getEXPIRATIONDATE() {
	return EXPIRATIONDATE;
}
public void setEXPIRATIONDATE(LocalDateTime eXPIRATIONDATE) {
	EXPIRATIONDATE = eXPIRATIONDATE;
}
public String getADDRESSLINE5() {
	return ADDRESSLINE5;
}
public void setADDRESSLINE5(String aDDRESSLINE5) {
	ADDRESSLINE5 = aDDRESSLINE5;
}
public String getADDRESSLINE6() {
	return ADDRESSLINE6;
}
public void setADDRESSLINE6(String aDDRESSLINE6) {
	ADDRESSLINE6 = aDDRESSLINE6;
}
public String getREGIONCODE() {
	return REGIONCODE;
}
public void setREGIONCODE(String rEGIONCODE) {
	REGIONCODE = rEGIONCODE;
}
public String getMUNICIPALITYCODE() {
	return MUNICIPALITYCODE;
}
public void setMUNICIPALITYCODE(String mUNICIPALITYCODE) {
	MUNICIPALITYCODE = mUNICIPALITYCODE;
}
}
