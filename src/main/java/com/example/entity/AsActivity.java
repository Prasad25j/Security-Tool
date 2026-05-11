package com.example.entity;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity(name = "ASACTIVITY")
public class AsActivity {
    @Id
    private String ACTIVITYGUID;
    private String TRANSACTIONGUID;
    private String TYPECODE;
    private String STATUSCODE;
    private LocalDateTime EFFECTIVEDATE;
    private LocalDateTime ACTIVEFROMDATE;
    private LocalDateTime ACTIVETODATE;
    private String CLIENTNUMBER;
    private String POLICYGUID;
    private String RELATEDGUID;
    @Lob
    private String XMLDATA;
    private Long PROCESSINGORDER;
    private String ERRORSTATUSCODE;
    private String SUSPENSESTATUSCODE;
    private LocalDateTime ACTIVITYGMT;
    private LocalDateTime ENTRYGMT;
    private LocalDateTime CREATIONGMT;
    private String SCHEDULEGUID;
    //private String SUBSTATUSCODE;
    private String ARCHIVALSTATUSCODE;
    private String ORIGINALACTIVITYGUID;

    public String getACTIVITYGUID() {
        return ACTIVITYGUID;
    }

    public void setACTIVITYGUID(String aCTIVITYGUID) {
        ACTIVITYGUID = aCTIVITYGUID;
    }

    public String getTRANSACTIONGUID() {
        return TRANSACTIONGUID;
    }

    public void setTRANSACTIONGUID(String tRANSACTIONGUID) {
        TRANSACTIONGUID = tRANSACTIONGUID;
    }

    public String getTYPECODE() {
        return TYPECODE;
    }

    public void setTYPECODE(String tYPECODE) {
        TYPECODE = tYPECODE;
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

    public LocalDateTime getACTIVEFROMDATE() {
        return ACTIVEFROMDATE;
    }

    public void setACTIVEFROMDATE(LocalDateTime aCTIVEFROMDATE) {
        ACTIVEFROMDATE = aCTIVEFROMDATE;
    }

    public LocalDateTime getACTIVETODATE() {
        return ACTIVETODATE;
    }

    public void setACTIVETODATE(LocalDateTime aCTIVETODATE) {
        ACTIVETODATE = aCTIVETODATE;
    }

    public String getCLIENTNUMBER() {
        return CLIENTNUMBER;
    }

    public void setCLIENTNUMBER(String cLIENTNUMBER) {
        CLIENTNUMBER = cLIENTNUMBER;
    }

    public String getPOLICYGUID() {
        return POLICYGUID;
    }

    public void setPOLICYGUID(String pOLICYGUID) {
        POLICYGUID = pOLICYGUID;
    }

    public String getRELATEDGUID() {
        return RELATEDGUID;
    }

    public void setRELATEDGUID(String rELATEDGUID) {
        RELATEDGUID = rELATEDGUID;
    }

    public String getXMLDATA() {
        return XMLDATA;
    }

    public void setXMLDATA(String xMLDATA) {
        XMLDATA = xMLDATA;
    }

    public Long getPROCESSINGORDER() {
        return PROCESSINGORDER;
    }

    public void setPROCESSINGORDER(Long pROCESSINGORDER) {
        PROCESSINGORDER = pROCESSINGORDER;
    }

    public String getERRORSTATUSCODE() {
        return ERRORSTATUSCODE;
    }

    public void setERRORSTATUSCODE(String eRRORSTATUSCODE) {
        ERRORSTATUSCODE = eRRORSTATUSCODE;
    }

    public String getSUSPENSESTATUSCODE() {
        return SUSPENSESTATUSCODE;
    }

    public void setSUSPENSESTATUSCODE(String sUSPENSESTATUSCODE) {
        SUSPENSESTATUSCODE = sUSPENSESTATUSCODE;
    }

    public LocalDateTime getACTIVITYGMT() {
        return ACTIVITYGMT;
    }

    public void setACTIVITYGMT(LocalDateTime aCTIVITYGMT) {
        ACTIVITYGMT = aCTIVITYGMT;
    }

    public LocalDateTime getENTRYGMT() {
        return ENTRYGMT;
    }

    public void setENTRYGMT(LocalDateTime eNTRYGMT) {
        ENTRYGMT = eNTRYGMT;
    }

    public LocalDateTime getCREATIONGMT() {
        return CREATIONGMT;
    }

    public void setCREATIONGMT(LocalDateTime cREATIONGMT) {
        CREATIONGMT = cREATIONGMT;
    }

    public String getSCHEDULEGUID() {
        return SCHEDULEGUID;
    }

    public void setSCHEDULEGUID(String sCHEDULEGUID) {
        SCHEDULEGUID = sCHEDULEGUID;
    }

	/*
	 * public String getSUBSTATUSCODE() { return SUBSTATUSCODE; }
	 * 
	 * public void setSUBSTATUSCODE(String sUBSTATUSCODE) { SUBSTATUSCODE =
	 * sUBSTATUSCODE; }
	 */
    
    

    public String getARCHIVALSTATUSCODE() {
		return ARCHIVALSTATUSCODE;
	}

	public void setARCHIVALSTATUSCODE(String aRCHIVALSTATUSCODE) {
		ARCHIVALSTATUSCODE = aRCHIVALSTATUSCODE;
	}

	public String getORIGINALACTIVITYGUID() {
        return ORIGINALACTIVITYGUID;
    }

    public void setORIGINALACTIVITYGUID(String oRIGINALACTIVITYGUID) {
        ORIGINALACTIVITYGUID = oRIGINALACTIVITYGUID;
    }
}
