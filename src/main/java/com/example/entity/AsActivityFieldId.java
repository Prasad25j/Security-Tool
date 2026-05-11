package com.example.entity;

import java.io.Serializable;
import java.util.Objects;

@javax.persistence.Embeddable
public class AsActivityFieldId implements Serializable {

    private String ACTIVITYGUID;
    private String FIELDNAME;

    // Default constructor
    public AsActivityFieldId() {}

    // Parameterized constructor
    public AsActivityFieldId(String ACTIVITYGUID, String FIELDNAME) {
        this.ACTIVITYGUID = ACTIVITYGUID;
        this.FIELDNAME = FIELDNAME;
    }

    // Getters and Setters
    public String getACTIVITYGUID() {
        return ACTIVITYGUID;
    }

    public void setACTIVITYGUID(String ACTIVITYGUID) {
        this.ACTIVITYGUID = ACTIVITYGUID;
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
        AsActivityFieldId that = (AsActivityFieldId) o;
        return ACTIVITYGUID.equals(that.ACTIVITYGUID) &&
                FIELDNAME.equals(that.FIELDNAME);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ACTIVITYGUID, FIELDNAME);
    }
}
