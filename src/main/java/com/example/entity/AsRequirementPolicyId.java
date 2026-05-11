package com.example.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class AsRequirementPolicyId implements Serializable {

    private String REQUIREMENTGUID;
    private String POLICYGUID;

    // Constructors, getters, setters, equals, and hashCode

    public AsRequirementPolicyId() {}

    public AsRequirementPolicyId(String REQUIREMENTGUID, String POLICYGUID) {
        this.REQUIREMENTGUID = REQUIREMENTGUID;
        this.POLICYGUID = POLICYGUID;
    }

    public String getREQUIREMENTGUID() {
        return REQUIREMENTGUID;
    }

    public void setREQUIREMENTGUID(String REQUIREMENTGUID) {
        this.REQUIREMENTGUID = REQUIREMENTGUID;
    }

    public String getPOLICYGUID() {
        return POLICYGUID;
    }

    public void setPOLICYGUID(String POLICYGUID) {
        this.POLICYGUID = POLICYGUID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AsRequirementPolicyId that = (AsRequirementPolicyId) o;
        return Objects.equals(REQUIREMENTGUID, that.REQUIREMENTGUID) &&
               Objects.equals(POLICYGUID, that.POLICYGUID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(REQUIREMENTGUID, POLICYGUID);
    }
}
