package com.example.entity;

import java.io.Serializable;
import java.util.Objects;

public class AsClientMultiValueFieldId implements Serializable {
    private String CLIENTGUID;
    private String FIELDNAME;
    private String FIELDINDEX;

    // Default constructor
    public AsClientMultiValueFieldId() {}

    // Parameterized constructor
    public AsClientMultiValueFieldId(String CLIENTGUID, String FIELDNAME, String FIELDINDEX) {
        this.CLIENTGUID = CLIENTGUID;
        this.FIELDNAME = FIELDNAME;
        this.FIELDINDEX = FIELDINDEX;
    }

    // Getters and setters
    public String getCLIENTGUID() {
        return CLIENTGUID;
    }

    public void setCLIENTGUID(String CLIENTGUID) {
        this.CLIENTGUID = CLIENTGUID;
    }

    public String getFIELDNAME() {
        return FIELDNAME;
    }

    public void setFIELDNAME(String FIELDNAME) {
        this.FIELDNAME = FIELDNAME;
    }

    public String getFIELDINDEX() {
        return FIELDINDEX;
    }

    public void setFIELDINDEX(String FIELDINDEX) {
        this.FIELDINDEX = FIELDINDEX;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AsClientMultiValueFieldId that = (AsClientMultiValueFieldId) o;
        return CLIENTGUID.equals(that.CLIENTGUID) &&
                FIELDNAME.equals(that.FIELDNAME) &&
                FIELDINDEX.equals(that.FIELDINDEX);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CLIENTGUID, FIELDNAME, FIELDINDEX);
    }
}
