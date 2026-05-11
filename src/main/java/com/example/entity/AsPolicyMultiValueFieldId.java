package com.example.entity;

import java.io.Serializable;
import java.util.Objects;

public class AsPolicyMultiValueFieldId implements Serializable {
    private String POLICYGUID;
    private Long FIELDINDEX;

    // Default constructor
    public AsPolicyMultiValueFieldId() {}

    // Parameterized constructor
    public AsPolicyMultiValueFieldId(String POLICYGUID, Long FIELDINDEX) {
        this.POLICYGUID = POLICYGUID;
        this.FIELDINDEX = FIELDINDEX;
    }

    // Getters and setters
    public String getPOLICYGUID() {
        return POLICYGUID;
    }

    public void setPOLICYGUID(String POLICYGUID) {
        this.POLICYGUID = POLICYGUID;
    }

    public Long getFIELDINDEX() {
        return FIELDINDEX;
    }

    public void setFIELDINDEX(Long FIELDINDEX) {
        this.FIELDINDEX = FIELDINDEX;
    }

    // hashCode and equals methods
    @Override
    public int hashCode() {
        return Objects.hash(POLICYGUID, FIELDINDEX);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AsPolicyMultiValueFieldId that = (AsPolicyMultiValueFieldId) o;
        return Objects.equals(POLICYGUID, that.POLICYGUID) && Objects.equals(FIELDINDEX, that.FIELDINDEX);
    }
}
