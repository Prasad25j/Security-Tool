package com.example.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ASACTIVITYSPAWN")
public class AsActivitySpawn {

    @EmbeddedId
    private AsActivitySpawnId id;

    // Getters and Setters
    public AsActivitySpawnId getId() {
        return id;
    }

    public void setId(AsActivitySpawnId id) {
        this.id = id;
    }
}
