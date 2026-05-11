package com.example.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ASREQUIREMENTPOLICY")
public class AsRequirementPolicy {

    @EmbeddedId
    private AsRequirementPolicyId id;

    // Constructors, getters, and setters

    public AsRequirementPolicy() {}

    public AsRequirementPolicy(AsRequirementPolicyId id) {
        this.id = id;
    }

    public AsRequirementPolicyId getId() {
        return id;
    }

    public void setId(AsRequirementPolicyId id) {
        this.id = id;
    }
}
