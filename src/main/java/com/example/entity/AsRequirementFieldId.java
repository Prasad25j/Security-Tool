package com.example.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class AsRequirementFieldId implements Serializable {

    private String REQUIREMENTGUID;
    private String FIELDNAME;

    // Constructors, getters, setters, equals, and hashCode

    public AsRequirementFieldId() {}

    public AsRequirementFieldId(String REQUIREMENTGUID, String FIELDNAME) {
        this.REQUIREMENTGUID = REQUIREMENTGUID;
        this.FIELDNAME = FIELDNAME;
    }

    public String getREQUIREMENTGUID() {
        return REQUIREMENTGUID;
    }

    public void setREQUIREMENTGUID(String REQUIREMENTGUID) {
        this.REQUIREMENTGUID = REQUIREMENTGUID;
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
        AsRequirementFieldId that = (AsRequirementFieldId) o;
        return Objects.equals(REQUIREMENTGUID, that.REQUIREMENTGUID) &&
               Objects.equals(FIELDNAME, that.FIELDNAME);
    }

    @Override
    public int hashCode() {
        return Objects.hash(REQUIREMENTGUID, FIELDNAME);
    }
}
