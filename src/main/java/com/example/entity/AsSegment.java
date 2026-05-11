package com.example.entity;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "ASSEGMENT")

public class AsSegment {
     @Id
     private String SEGMENTGUID;
     private String PARENTSEGMENTGUID;
     private String POLICYGUID;
     private String SEGMENTNAMEGUID;
     private String STATUSCODE;
     private LocalDateTime EFFECTIVEDATE;
     @Lob
     private String XMLDATA;
     private String PLANSEGMENTNAMEGUID;
     
	public String getSEGMENTGUID() {
		return SEGMENTGUID;
	}
	public void setSEGMENTGUID(String sEGMENTGUID) {
		SEGMENTGUID = sEGMENTGUID;
	}
	public String getPARENTSEGMENTGUID() {
		return PARENTSEGMENTGUID;
	}
	public void setPARENTSEGMENTGUID(String pARENTSEGMENTGUID) {
		PARENTSEGMENTGUID = pARENTSEGMENTGUID;
	}
	public String getPOLICYGUID() {
		return POLICYGUID;
	}
	public void setPOLICYGUID(String pOLICYGUID) {
		POLICYGUID = pOLICYGUID;
	}
	public String getSEGMENTNAMEGUID() {
		return SEGMENTNAMEGUID;
	}
	public void setSEGMENTNAMEGUID(String sEGMENTNAMEGUID) {
		SEGMENTNAMEGUID = sEGMENTNAMEGUID;
	}
	public String getSTATUSCODE() {
		return STATUSCODE;
	}
	public void setSTATUSCODE(String sTATUSCODE) {
		STATUSCODE = sTATUSCODE;
	}
	public LocalDateTime getEFFECTIVEDATE() {
		return EFFECTIVEDATE;
	}
	public void setEFFECTIVEDATE(LocalDateTime eFFECTIVEDATE) {
		EFFECTIVEDATE = eFFECTIVEDATE;
	}
	public String getXMLDATA() {
		return XMLDATA;
	}
	public void setXMLDATA(String xMLDATA) {
		XMLDATA = xMLDATA;
	}
	public String getPLANSEGMENTNAMEGUID() {
		return PLANSEGMENTNAMEGUID;
	}
	public void setPLANSEGMENTNAMEGUID(String pLANSEGMENTNAMEGUID) {
		PLANSEGMENTNAMEGUID = pLANSEGMENTNAMEGUID;
	}
}
