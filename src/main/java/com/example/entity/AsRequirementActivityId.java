package com.example.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class AsRequirementActivityId implements Serializable {

    private String REQUIREMENTGUID;
    private String ACTIVITYGUID;

    // Constructors, getters, setters, equals, and hashCode

    public AsRequirementActivityId() {}

    public AsRequirementActivityId(String REQUIREMENTGUID, String ACTIVITYGUID) {
        this.REQUIREMENTGUID = REQUIREMENTGUID;
        this.ACTIVITYGUID = ACTIVITYGUID;
    }

    public String getREQUIREMENTGUID() {
        return REQUIREMENTGUID;
    }

    public void setREQUIREMENTGUID(String REQUIREMENTGUID) {
        this.REQUIREMENTGUID = REQUIREMENTGUID;
    }

    public String getACTIVITYGUID() {
        return ACTIVITYGUID;
    }

    public void setACTIVITYGUID(String ACTIVITYGUID) {
        this.ACTIVITYGUID = ACTIVITYGUID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AsRequirementActivityId that = (AsRequirementActivityId) o;
        return Objects.equals(REQUIREMENTGUID, that.REQUIREMENTGUID) &&
               Objects.equals(ACTIVITYGUID, that.ACTIVITYGUID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(REQUIREMENTGUID, ACTIVITYGUID);
    }
}
