package com.example.entity;

import java.io.Serializable;
import java.util.Objects;

public class AsClientFieldId implements Serializable {
    private String CLIENTGUID;
    private String FIELDNAME;

    public AsClientFieldId() {}

    public AsClientFieldId(String CLIENTGUID, String FIELDNAME) {
        this.CLIENTGUID = CLIENTGUID;
        this.FIELDNAME = FIELDNAME;
    }

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

    @Override
    public int hashCode() {
        return Objects.hash(CLIENTGUID, FIELDNAME);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AsClientFieldId that = (AsClientFieldId) o;
        return Objects.equals(CLIENTGUID, that.CLIENTGUID) && 
               Objects.equals(FIELDNAME, that.FIELDNAME);
    }
}
