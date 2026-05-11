package com.example.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ASREQUIREMENTCLIENT")
public class AsRequirementClient {

    @EmbeddedId
    private AsRequirementClientId id;

    // Additional fields if needed

    // Getters and Setters for id
    public AsRequirementClientId getId() {
        return id;
    }

    public void setId(AsRequirementClientId id) {
        this.id = id;
    }

    public String getREQUIREMENTGUID() {
        return id.getREQUIREMENTGUID();
    }

    public void setREQUIREMENTGUID(String REQUIREMENTGUID) {
        id.setREQUIREMENTGUID(REQUIREMENTGUID);
    }

    public String getCLIENTGUID() {
        return id.getCLIENTGUID();
    }

    public void setCLIENTGUID(String CLIENTGUID) {
        id.setCLIENTGUID(CLIENTGUID);
    }
}
