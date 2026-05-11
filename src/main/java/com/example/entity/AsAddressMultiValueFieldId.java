package com.example.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class AsAddressMultiValueFieldId implements Serializable {
    private String ADDRESSGUID;
    private String FIELDNAME;
    private Long FIELDINDEX;

    // Getters and Setters
    public String getADDRESSGUID() {
        return ADDRESSGUID;
    }

    public void setADDRESSGUID(String ADDRESSGUID) {
        this.ADDRESSGUID = ADDRESSGUID;
    }

    public String getFIELDNAME() {
        return FIELDNAME;
    }

    public void setFIELDNAME(String FIELDNAME) {
        this.FIELDNAME = FIELDNAME;
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
        return Objects.hash(ADDRESSGUID, FIELDNAME, FIELDINDEX);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AsAddressMultiValueFieldId that = (AsAddressMultiValueFieldId) obj;
        return Objects.equals(ADDRESSGUID, that.ADDRESSGUID) &&
               Objects.equals(FIELDNAME, that.FIELDNAME) &&
               Objects.equals(FIELDINDEX, that.FIELDINDEX);
    }
}
