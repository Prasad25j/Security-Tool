package com.example.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class AsActivitySpawnId implements Serializable {

    private String ACTIVITYGUID;
    private String SPAWNEDBYGUID;

    // Default constructor
    public AsActivitySpawnId() {}

    // Parameterized constructor
    public AsActivitySpawnId(String ACTIVITYGUID, String SPAWNEDBYGUID) {
        this.ACTIVITYGUID = ACTIVITYGUID;
        this.SPAWNEDBYGUID = SPAWNEDBYGUID;
    }

    // Getters and Setters
    public String getACTIVITYGUID() {
        return ACTIVITYGUID;
    }

    public void setACTIVITYGUID(String ACTIVITYGUID) {
        this.ACTIVITYGUID = ACTIVITYGUID;
    }

    public String getSPAWNEDBYGUID() {
        return SPAWNEDBYGUID;
    }

    public void setSPAWNEDBYGUID(String SPAWNEDBYGUID) {
        this.SPAWNEDBYGUID = SPAWNEDBYGUID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AsActivitySpawnId that = (AsActivitySpawnId) o;
        return ACTIVITYGUID.equals(that.ACTIVITYGUID) &&
                SPAWNEDBYGUID.equals(that.SPAWNEDBYGUID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ACTIVITYGUID, SPAWNEDBYGUID);
    }
}
