package com.example.secondaryDev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.entity.AsActivitySpawn;
import com.example.entity.AsActivitySpawnId;

@Repository
public interface AsActivitySpawnSecondaryDevRepository extends JpaRepository<AsActivitySpawn, AsActivitySpawnId> {
    
}
