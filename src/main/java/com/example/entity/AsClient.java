package com.example.entity;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
@Entity
@Table(name = "ASCLIENT")
public class AsClient {
	@Id
	private String CLIENTGUID;
	private String TYPECODE;
	private String COMPANYNAME;
	private String LASTNAME;
	private String FIRSTNAME;
	private String MIDDLEINITIAL;
	private String PREFIX;
	private String SUFFIX;
	private String SEX;
	private LocalDateTime DATEOFBIRTH;
	private LocalDateTime DATEOFDEATH;
	private String TAXID;
	private String EMAIL = "uatrigeandrew@gmail.com";
	
	@Lob
	private String XMLDATA;
	
	private LocalDateTime UPDATEDGMT;
	private String LEGALRESIDENCECOUNTRYCODE;
	private String RADIO1;
	private String RADIO2;
	private String COMBO1;
	private String ALTERNATENAME1 = "uatrigeandrew@gmail.com";
	private String ALTERNATENAME2 = "+2540111959555";
	private String ALTERNATENAME3;
	private String ALTERNATENAME4;
	private String ALTERNATENAME5;
	private String ADDITIONALPREFIX;
	private String ADDITIONALSUFFIX;
	private String TAXIDTYPE;
	private String TITLE;
	private String MARITALSTATUS;
	private String BIRTHCOUNTRYCODE;
	private String CITIZENSHIPCOUNTRYCODE;
	private String BIRTHREGIONCODE;
	private String PRIMARYPHONE = "+2540111959555";
	private String TEXTFIELD1;
	private String TEXTFIELD2;
	private String CHECKBOX1;
	private String CHECKBOX2;
	private String COMBO2;
	private LocalDateTime DATE1;
	private LocalDateTime DATE2;
	private String ENTITYTYPECODE;
	private String STATUSCODE;
	public String getCLIENTGUID() {
		return CLIENTGUID;
	}
	public void setCLIENTGUID(String cLIENTGUID) {
		CLIENTGUID = cLIENTGUID;
	}
	public String getTYPECODE() {
		return TYPECODE;
	}
	public void setTYPECODE(String tYPECODE) {
		TYPECODE = tYPECODE;
	}
	public String getCOMPANYNAME() {
		return COMPANYNAME;
	}
	public void setCOMPANYNAME(String cOMPANYNAME) {
		COMPANYNAME = cOMPANYNAME;
	}
	public String getLASTNAME() {
		return LASTNAME;
	}
	public void setLASTNAME(String lASTNAME) {
		LASTNAME = lASTNAME;
	}
	public String getFIRSTNAME() {
		return FIRSTNAME;
	}
	public void setFIRSTNAME(String fIRSTNAME) {
		FIRSTNAME = fIRSTNAME;
	}
	public String getMIDDLEINITIAL() {
		return MIDDLEINITIAL;
	}
	public void setMIDDLEINITIAL(String mIDDLEINITIAL) {
		MIDDLEINITIAL = mIDDLEINITIAL;
	}
	public String getPREFIX() {
		return PREFIX;
	}
	public void setPREFIX(String pREFIX) {
		PREFIX = pREFIX;
	}
	public String getSUFFIX() {
		return SUFFIX;
	}
	public void setSUFFIX(String sUFFIX) {
		SUFFIX = sUFFIX;
	}
	public String getSEX() {
		return SEX;
	}
	public void setSEX(String sEX) {
		SEX = sEX;
	}
	public LocalDateTime getDATEOFBIRTH() {
		return DATEOFBIRTH;
	}
	public void setDATEOFBIRTH(LocalDateTime dATEOFBIRTH) {
		DATEOFBIRTH = dATEOFBIRTH;
	}
	public LocalDateTime getDATEOFDEATH() {
		return DATEOFDEATH;
	}
	public void setDATEOFDEATH(LocalDateTime dATEOFDEATH) {
		DATEOFDEATH = dATEOFDEATH;
	}
	public String getTAXID() {
		return TAXID;
	}
	public void setTAXID(String tAXID) {
		TAXID = tAXID;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public String getXMLDATA() {
		return XMLDATA;
	}
	public void setXMLDATA(String xMLDATA) {
		XMLDATA = xMLDATA;
	}
	public LocalDateTime getUPDATEDGMT() {
		return UPDATEDGMT;
	}
	public void setUPDATEDGMT(LocalDateTime uPDATEDGMT) {
		UPDATEDGMT = uPDATEDGMT;
	}
	public String getLEGALRESIDENCECOUNTRYCODE() {
		return LEGALRESIDENCECOUNTRYCODE;
	}
	public void setLEGALRESIDENCECOUNTRYCODE(String lEGALRESIDENCECOUNTRYCODE) {
		LEGALRESIDENCECOUNTRYCODE = lEGALRESIDENCECOUNTRYCODE;
	}
	public String getRADIO1() {
		return RADIO1;
	}
	public void setRADIO1(String rADIO1) {
		RADIO1 = rADIO1;
	}
	public String getRADIO2() {
		return RADIO2;
	}
	public void setRADIO2(String rADIO2) {
		RADIO2 = rADIO2;
	}
	public String getCOMBO1() {
		return COMBO1;
	}
	public void setCOMBO1(String cOMBO1) {
		COMBO1 = cOMBO1;
	}
	public String getALTERNATENAME1() {
		return ALTERNATENAME1;
	}
	public void setALTERNATENAME1(String aLTERNATENAME1) {
		ALTERNATENAME1 = aLTERNATENAME1;
	}
	public String getALTERNATENAME2() {
		return ALTERNATENAME2;
	}
	public void setALTERNATENAME2(String aLTERNATENAME2) {
		ALTERNATENAME2 = aLTERNATENAME2;
	}
	public String getALTERNATENAME3() {
		return ALTERNATENAME3;
	}
	public void setALTERNATENAME3(String aLTERNATENAME3) {
		ALTERNATENAME3 = aLTERNATENAME3;
	}
	public String getALTERNATENAME4() {
		return ALTERNATENAME4;
	}
	public void setALTERNATENAME4(String aLTERNATENAME4) {
		ALTERNATENAME4 = aLTERNATENAME4;
	}
	public String getALTERNATENAME5() {
		return ALTERNATENAME5;
	}
	public void setALTERNATENAME5(String aLTERNATENAME5) {
		ALTERNATENAME5 = aLTERNATENAME5;
	}
	public String getADDITIONALPREFIX() {
		return ADDITIONALPREFIX;
	}
	public void setADDITIONALPREFIX(String aDDITIONALPREFIX) {
		ADDITIONALPREFIX = aDDITIONALPREFIX;
	}
	public String getADDITIONALSUFFIX() {
		return ADDITIONALSUFFIX;
	}
	public void setADDITIONALSUFFIX(String aDDITIONALSUFFIX) {
		ADDITIONALSUFFIX = aDDITIONALSUFFIX;
	}
	public String getTAXIDTYPE() {
		return TAXIDTYPE;
	}
	public void setTAXIDTYPE(String tAXIDTYPE) {
		TAXIDTYPE = tAXIDTYPE;
	}
	public String getTITLE() {
		return TITLE;
	}
	public void setTITLE(String tITLE) {
		TITLE = tITLE;
	}
	public String getMARITALSTATUS() {
		return MARITALSTATUS;
	}
	public void setMARITALSTATUS(String mARITALSTATUS) {
		MARITALSTATUS = mARITALSTATUS;
	}
	public String getBIRTHCOUNTRYCODE() {
		return BIRTHCOUNTRYCODE;
	}
	public void setBIRTHCOUNTRYCODE(String bIRTHCOUNTRYCODE) {
		BIRTHCOUNTRYCODE = bIRTHCOUNTRYCODE;
	}
	public String getCITIZENSHIPCOUNTRYCODE() {
		return CITIZENSHIPCOUNTRYCODE;
	}
	public void setCITIZENSHIPCOUNTRYCODE(String cITIZENSHIPCOUNTRYCODE) {
		CITIZENSHIPCOUNTRYCODE = cITIZENSHIPCOUNTRYCODE;
	}
	public String getBIRTHREGIONCODE() {
		return BIRTHREGIONCODE;
	}
	public void setBIRTHREGIONCODE(String bIRTHREGIONCODE) {
		BIRTHREGIONCODE = bIRTHREGIONCODE;
	}
	public String getPRIMARYPHONE() {
		return PRIMARYPHONE;
	}
	public void setPRIMARYPHONE(String pRIMARYPHONE) {
		PRIMARYPHONE = pRIMARYPHONE;
	}
	public String getTEXTFIELD1() {
		return TEXTFIELD1;
	}
	public void setTEXTFIELD1(String tEXTFIELD1) {
		TEXTFIELD1 = tEXTFIELD1;
	}
	public String getTEXTFIELD2() {
		return TEXTFIELD2;
	}
	public void setTEXTFIELD2(String tEXTFIELD2) {
		TEXTFIELD2 = tEXTFIELD2;
	}
	public String getCHECKBOX1() {
		return CHECKBOX1;
	}
	public void setCHECKBOX1(String cHECKBOX1) {
		CHECKBOX1 = cHECKBOX1;
	}
	public String getCHECKBOX2() {
		return CHECKBOX2;
	}
	public void setCHECKBOX2(String cHECKBOX2) {
		CHECKBOX2 = cHECKBOX2;
	}
	public String getCOMBO2() {
		return COMBO2;
	}
	public void setCOMBO2(String cOMBO2) {
		COMBO2 = cOMBO2;
	}
	public LocalDateTime getDATE1() {
		return DATE1;
	}
	public void setDATE1(LocalDateTime dATE1) {
		DATE1 = dATE1;
	}
	public LocalDateTime getDATE2() {
		return DATE2;
	}
	public void setDATE2(LocalDateTime dATE2) {
		DATE2 = dATE2;
	}
	public String getENTITYTYPECODE() {
		return ENTITYTYPECODE;
	}
	public void setENTITYTYPECODE(String eNTITYTYPECODE) {
		ENTITYTYPECODE = eNTITYTYPECODE;
	}
	public String getSTATUSCODE() {
		return STATUSCODE;
	}
	public void setSTATUSCODE(String sTATUSCODE) {
		STATUSCODE = sTATUSCODE;
	}
	
}
