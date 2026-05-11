package com.example.primary.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.entity.AsActivitySpawn;
import com.example.entity.AsActivitySpawnId;

@Repository
public interface AsActivitySpawnPrimaryRepository extends JpaRepository<AsActivitySpawn, AsActivitySpawnId> {
    List<AsActivitySpawn> findByIdACTIVITYGUID(String ACTIVITYGUID);
}
