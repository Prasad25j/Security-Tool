package com.example.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ASACTIVITYMULTIVALUEFIELD")
public class AsActivityMultiValueField {

    @Id
    private AsActivityMultiValueFieldId id;

    private String FIELDTYPECODE;
    private LocalDateTime DATEVALUE;
    private String TEXTVALUE;
    private Long INTVALUE;
    private BigDecimal FLOATVALUE;
    private Long OPTIONTEXTFLAG;
    private String OPTIONTEXT;
    private String CURRENCYCODE;
    private String BIGTEXTVALUE;
    private String GROUPNAME;

    // Getters and Setters
    public AsActivityMultiValueFieldId getId() {
        return id;
    }

    public void setId(AsActivityMultiValueFieldId id) {
        this.id = id;
    }

    public String getFIELDTYPECODE() {
        return FIELDTYPECODE;
    }

    public void setFIELDTYPECODE(String FIELDTYPECODE) {
        this.FIELDTYPECODE = FIELDTYPECODE;
    }

    public LocalDateTime getDATEVALUE() {
        return DATEVALUE;
    }

    public void setDATEVALUE(LocalDateTime DATEVALUE) {
        this.DATEVALUE = DATEVALUE;
    }

    public String getTEXTVALUE() {
        return TEXTVALUE;
    }

    public void setTEXTVALUE(String TEXTVALUE) {
        this.TEXTVALUE = TEXTVALUE;
    }

    public Long getINTVALUE() {
        return INTVALUE;
    }

    public void setINTVALUE(Long INTVALUE) {
        this.INTVALUE = INTVALUE;
    }

    public BigDecimal getFLOATVALUE() {
        return FLOATVALUE;
    }

    public void setFLOATVALUE(BigDecimal FLOATVALUE) {
        this.FLOATVALUE = FLOATVALUE;
    }

    public Long getOPTIONTEXTFLAG() {
        return OPTIONTEXTFLAG;
    }

    public void setOPTIONTEXTFLAG(Long OPTIONTEXTFLAG) {
        this.OPTIONTEXTFLAG = OPTIONTEXTFLAG;
    }

    public String getOPTIONTEXT() {
        return OPTIONTEXT;
    }

    public void setOPTIONTEXT(String OPTIONTEXT) {
        this.OPTIONTEXT = OPTIONTEXT;
    }

    public String getCURRENCYCODE() {
        return CURRENCYCODE;
    }

    public void setCURRENCYCODE(String CURRENCYCODE) {
        this.CURRENCYCODE = CURRENCYCODE;
    }

    public String getBIGTEXTVALUE() {
        return BIGTEXTVALUE;
    }

    public void setBIGTEXTVALUE(String BIGTEXTVALUE) {
        this.BIGTEXTVALUE = BIGTEXTVALUE;
    }

    public String getGROUPNAME() {
        return GROUPNAME;
    }

    public void setGROUPNAME(String GROUPNAME) {
        this.GROUPNAME = GROUPNAME;
    }
}
