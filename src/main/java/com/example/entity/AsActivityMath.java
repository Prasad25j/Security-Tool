package com.example.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ASACTIVITYMATH")
public class AsActivityMath {

    @EmbeddedId
    private AsActivityMathId id;

    private String MATHVALUE;
    private String CURRENCYCODE;
    private String SOURCETYPECODE;

    // Getters and Setters
    public AsActivityMathId getId() {
        return id;
    }

    public void setId(AsActivityMathId id) {
        this.id = id;
    }

    public String getMATHVALUE() {
        return MATHVALUE;
    }

    public void setMATHVALUE(String MATHVALUE) {
        this.MATHVALUE = MATHVALUE;
    }

    public String getCURRENCYCODE() {
        return CURRENCYCODE;
    }

    public void setCURRENCYCODE(String CURRENCYCODE) {
        this.CURRENCYCODE = CURRENCYCODE;
    }

    public String getSOURCETYPECODE() {
        return SOURCETYPECODE;
    }

    public void setSOURCETYPECODE(String SOURCETYPECODE) {
        this.SOURCETYPECODE = SOURCETYPECODE;
    }
}
