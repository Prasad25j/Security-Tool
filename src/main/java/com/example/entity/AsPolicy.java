package com.example.entity;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "ASPOLICY")
public class AsPolicy {
	@Id
	private String POLICYGUID;
	private String POLICYNUMBER;
	private String POLICYNAME;
	private LocalDateTime CREATIONDATE;
	private String ISSUESTATECODE;
	private LocalDateTime PLANDATE;
	private String STATUSCODE;
	private String COMPANYGUID;
	private String PLANGUID;
	private String XMLDATA;
	private LocalDateTime UPDATEDGMT;
	private String  SYSTEMCODE;
	
	public String getPOLICYGUID() {
		return POLICYGUID;
	}
	public void setPOLICYGUID(String pOLICYGUID) {
		POLICYGUID = pOLICYGUID;
	}
	public String getPOLICYNUMBER() {
		return this.POLICYNUMBER;
	}
	public void setPOLICYNUMBER(String pOLICYNUMBER) {
	    POLICYNUMBER = pOLICYNUMBER;
	}
	public String getPOLICYNAME() {
		return POLICYNAME;
	}
	public void setPOLICYNAME(String pOLICYNAME) {
		POLICYNAME = pOLICYNAME;
	}
	public LocalDateTime getCREATIONDATE() {
		return CREATIONDATE;
	}
	public void setCREATIONDATE(LocalDateTime cREATIONDATE) {
		CREATIONDATE = cREATIONDATE;
	}
	public String getISSUESTATECODE() {
		return ISSUESTATECODE;
	}
	public void setISSUESATATECODE(String iSSUESTATECODE) {
		ISSUESTATECODE = iSSUESTATECODE;
	}
	public LocalDateTime getPLANDATE() {
		return PLANDATE;
	}
	public void setPLANDATE(LocalDateTime pLANDATE) {
		PLANDATE = pLANDATE;
	}
	public String getSTATUSCODE() {
		return STATUSCODE;
	}
	public void setSTATUSCODE(String sTATUSCODE) {
		STATUSCODE = sTATUSCODE;
	}
	public String getCOMPANYGUID() {
		return COMPANYGUID;
	}
	public void setCOMPANYGUID(String cOMPANYGUID) {
		COMPANYGUID = cOMPANYGUID;
	}
	public String getPLANGUID() {
		return PLANGUID;
	}
	public void setPLANGUID(String pLANGUID) {
		PLANGUID = pLANGUID;
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
	public String getSYSTEMCODE() {
		return SYSTEMCODE;
	}
	public void setSYSTEMCODE(String sYSTEMCODE) {
		SYSTEMCODE = sYSTEMCODE;
	}	
	
}











