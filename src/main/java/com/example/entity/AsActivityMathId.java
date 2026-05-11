package com.example.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class AsActivityMathId implements Serializable {

    private String ACTIVITYGUID;
    private String MATHNAME;

    // Default constructor
    public AsActivityMathId() {}

    // Parameterized constructor
    public AsActivityMathId(String ACTIVITYGUID, String MATHNAME) {
        this.ACTIVITYGUID = ACTIVITYGUID;
        this.MATHNAME = MATHNAME;
    }

    // Getters and Setters
    public String getACTIVITYGUID() {
        return ACTIVITYGUID;
    }

    public void setACTIVITYGUID(String ACTIVITYGUID) {
        this.ACTIVITYGUID = ACTIVITYGUID;
    }

    public String getMATHNAME() {
        return MATHNAME;
    }

    public void setMATHNAME(String MATHNAME) {
        this.MATHNAME = MATHNAME;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AsActivityMathId that = (AsActivityMathId) o;
        return ACTIVITYGUID.equals(that.ACTIVITYGUID) &&
                MATHNAME.equals(that.MATHNAME);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ACTIVITYGUID, MATHNAME);
    }
}
