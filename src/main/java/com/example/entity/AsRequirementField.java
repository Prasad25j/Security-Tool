package com.example.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ASREQUIREMENTFIELD")
public class AsRequirementField {

    @EmbeddedId
    private AsRequirementFieldId id;

    private String FIELDTYPECODE;
    private LocalDateTime DATEVALUE;
    private String TEXTVALUE;
    private Long INTVALUE;
    private BigDecimal FLOATVALUE;
    private Long OPTIONTEXTFLAG;
    private String OPTIONTEXT;
    private String CURRENCYCODE;
    private String BIGTEXTVALUE;
    
	public AsRequirementFieldId getId() {
		return id;
	}
	public void setId(AsRequirementFieldId id) {
		this.id = id;
	}
	public String getFIELDTYPECODE() {
		return FIELDTYPECODE;
	}
	public void setFIELDTYPECODE(String fIELDTYPECODE) {
		FIELDTYPECODE = fIELDTYPECODE;
	}
	public LocalDateTime getDATEVALUE() {
		return DATEVALUE;
	}
	public void setDATEVALUE(LocalDateTime dATEVALUE) {
		DATEVALUE = dATEVALUE;
	}
	public String getTEXTVALUE() {
		return TEXTVALUE;
	}
	public void setTEXTVALUE(String tEXTVALUE) {
		TEXTVALUE = tEXTVALUE;
	}
	public Long getINTVALUE() {
		return INTVALUE;
	}
	public void setINTVALUE(Long iNTVALUE) {
		INTVALUE = iNTVALUE;
	}
	public BigDecimal getFLOATVALUE() {
		return FLOATVALUE;
	}
	public void setFLOATVALUE(BigDecimal fLOATVALUE) {
		FLOATVALUE = fLOATVALUE;
	}
	public Long getOPTIONTEXTFLAG() {
		return OPTIONTEXTFLAG;
	}
	public void setOPTIONTEXTFLAG(Long oPTIONTEXTFLAG) {
		OPTIONTEXTFLAG = oPTIONTEXTFLAG;
	}
	public String getOPTIONTEXT() {
		return OPTIONTEXT;
	}
	public void setOPTIONTEXT(String oPTIONTEXT) {
		OPTIONTEXT = oPTIONTEXT;
	}
	public String getCURRENCYCODE() {
		return CURRENCYCODE;
	}
	public void setCURRENCYCODE(String cURRENCYCODE) {
		CURRENCYCODE = cURRENCYCODE;
	}
	public String getBIGTEXTVALUE() {
		return BIGTEXTVALUE;
	}
	public void setBIGTEXTVALUE(String bIGTEXTVALUE) {
		BIGTEXTVALUE = bIGTEXTVALUE;
	}

    
}
