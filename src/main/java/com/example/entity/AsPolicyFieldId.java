package com.example.entity;

import java.io.Serializable;
import java.util.Objects;

public class AsPolicyFieldId implements Serializable {
    private String POLICYGUID;
    private String FIELDNAME;

    // Default constructor
    public AsPolicyFieldId() {}

    // Parameterized constructor
    public AsPolicyFieldId(String POLICYGUID, String FIELDNAME) {
        this.POLICYGUID = POLICYGUID;
        this.FIELDNAME = FIELDNAME;
    }

    // Getters and setters
    public String getPOLICYGUID() {
        return POLICYGUID;
    }

    public void setPOLICYGUID(String POLICYGUID) {
        this.POLICYGUID = POLICYGUID;
    }

    public String getFIELDNAME() {
        return FIELDNAME;
    }

    public void setFIELDNAME(String FIELDNAME) {
        this.FIELDNAME = FIELDNAME;
    }

    // hashCode and equals methods
    @Override
    public int hashCode() {
        return Objects.hash(POLICYGUID, FIELDNAME);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AsPolicyFieldId that = (AsPolicyFieldId) o;
        return Objects.equals(POLICYGUID, that.POLICYGUID) && Objects.equals(FIELDNAME, that.FIELDNAME);
    }
}
