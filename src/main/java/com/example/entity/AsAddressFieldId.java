package com.example.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class AsAddressFieldId implements Serializable {
    private String ADDRESSGUID;
    private String FIELDNAME;

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

    // hashCode and equals methods

    @Override
    public int hashCode() {
        return Objects.hash(ADDRESSGUID, FIELDNAME);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AsAddressFieldId that = (AsAddressFieldId) obj;
        return Objects.equals(ADDRESSGUID, that.ADDRESSGUID) &&
               Objects.equals(FIELDNAME, that.FIELDNAME);
    }
}
