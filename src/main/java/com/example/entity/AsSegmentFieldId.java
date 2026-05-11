package com.example.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class AsSegmentFieldId implements Serializable {
    private String SEGMENTGUID;
    private String FIELDNAME;

    public AsSegmentFieldId() {
    }

    public AsSegmentFieldId(String SEGMENTGUID, String FIELDNAME) {
        this.SEGMENTGUID = SEGMENTGUID;
        this.FIELDNAME = FIELDNAME;
    }

    // getters and setters

    public String getSEGMENTGUID() {
        return SEGMENTGUID;
    }

    public void setSEGMENTGUID(String SEGMENTGUID) {
        this.SEGMENTGUID = SEGMENTGUID;
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
        AsSegmentFieldId that = (AsSegmentFieldId) o;
        return Objects.equals(SEGMENTGUID, that.SEGMENTGUID) && Objects.equals(FIELDNAME, that.FIELDNAME);
    }

    @Override
    public int hashCode() {
        return Objects.hash(SEGMENTGUID, FIELDNAME);
    }
}
