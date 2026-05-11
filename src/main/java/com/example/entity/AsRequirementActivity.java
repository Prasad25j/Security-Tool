package com.example.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ASREQUIREMENTACTIVITY")
public class AsRequirementActivity {

    @EmbeddedId
    private AsRequirementActivityId id;

    // Additional fields if needed

    // Getters and Setters for id
    public AsRequirementActivityId getId() {
        return id;
    }

    public void setId(AsRequirementActivityId id) {
        this.id = id;
    }
}
