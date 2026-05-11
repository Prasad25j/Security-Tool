package com.example.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class AsSegmentMultiValueFieldId implements Serializable {
    private String SEGMENTGUID;
    private String FIELDNAME;
    private String FIELDINDEX;

    public AsSegmentMultiValueFieldId() {
    }

    public AsSegmentMultiValueFieldId(String SEGMENTGUID, String FIELDNAME, String FIELDINDEX) {
        this.SEGMENTGUID = SEGMENTGUID;
        this.FIELDNAME = FIELDNAME;
        this.FIELDINDEX = FIELDINDEX;
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
        AsSegmentMultiValueFieldId that = (AsSegmentMultiValueFieldId) o;
        return Objects.equals(SEGMENTGUID, that.SEGMENTGUID) &&
               Objects.equals(FIELDNAME, that.FIELDNAME) &&
               Objects.equals(FIELDINDEX, that.FIELDINDEX);
    }

    @Override
    public int hashCode() {
        return Objects.hash(SEGMENTGUID, FIELDNAME, FIELDINDEX);
    }
}
