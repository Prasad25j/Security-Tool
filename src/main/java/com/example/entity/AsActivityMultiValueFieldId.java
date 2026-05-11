package com.example.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class AsActivityMultiValueFieldId implements Serializable {

    private String ACTIVITYGUID;
    private String FIELDNAME;
    private String FIELDINDEX;

    // Default constructor
    public AsActivityMultiValueFieldId() {}

    // Parameterized constructor
    public AsActivityMultiValueFieldId(String ACTIVITYGUID, String FIELDNAME, String FIELDINDEX) {
        this.ACTIVITYGUID = ACTIVITYGUID;
        this.FIELDNAME = FIELDNAME;
        this.FIELDINDEX = FIELDINDEX;
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
        AsActivityMultiValueFieldId that = (AsActivityMultiValueFieldId) o;
        return ACTIVITYGUID.equals(that.ACTIVITYGUID) &&
                FIELDNAME.equals(that.FIELDNAME) &&
                FIELDINDEX.equals(that.FIELDINDEX);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ACTIVITYGUID, FIELDNAME, FIELDINDEX);
    }
}
