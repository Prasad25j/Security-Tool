package com.example.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class AsRoleFieldId implements Serializable {
    private String ROLEGUID;
    private String FIELDNAME;

    public AsRoleFieldId() {}

    public AsRoleFieldId(String ROLEGUID, String FIELDNAME) {
        this.ROLEGUID = ROLEGUID;
        this.FIELDNAME = FIELDNAME;
    }

    public String getROLEGUID() {
        return ROLEGUID;
    }

    public void setROLEGUID(String ROLEGUID) {
        this.ROLEGUID = ROLEGUID;
    }

    public String getFIELDNAME() {
        return FIELDNAME;
    }

    public void setFIELDNAME(String FIELDNAME) {
        this.FIELDNAME = FIELDNAME;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AsRoleFieldId that = (AsRoleFieldId) o;
        return Objects.equals(ROLEGUID, that.ROLEGUID) && Objects.equals(FIELDNAME, that.FIELDNAME);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ROLEGUID, FIELDNAME);
    }
}
