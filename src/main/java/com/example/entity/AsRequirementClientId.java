package com.example.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class AsRequirementClientId implements Serializable {

    private String REQUIREMENTGUID;
    private String CLIENTGUID;

    // Constructors, getters, setters, equals, and hashCode

    public AsRequirementClientId() {}

    public AsRequirementClientId(String REQUIREMENTGUID, String CLIENTGUID) {
        this.REQUIREMENTGUID = REQUIREMENTGUID;
        this.CLIENTGUID = CLIENTGUID;
    }

    public String getREQUIREMENTGUID() {
        return REQUIREMENTGUID;
    }

    public void setREQUIREMENTGUID(String REQUIREMENTGUID) {
        this.REQUIREMENTGUID = REQUIREMENTGUID;
    }

    public String getCLIENTGUID() {
        return CLIENTGUID;
    }

    public void setCLIENTGUID(String CLIENTGUID) {
        this.CLIENTGUID = CLIENTGUID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AsRequirementClientId that = (AsRequirementClientId) o;
        return Objects.equals(REQUIREMENTGUID, that.REQUIREMENTGUID) &&
               Objects.equals(CLIENTGUID, that.CLIENTGUID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(REQUIREMENTGUID, CLIENTGUID);
    }
}
