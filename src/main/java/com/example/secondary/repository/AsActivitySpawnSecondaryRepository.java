package com.example.secondary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.entity.AsActivitySpawn;
import com.example.entity.AsActivitySpawnId;
import java.util.List;
@Repository
public interface AsActivitySpawnSecondaryRepository extends JpaRepository<AsActivitySpawn, AsActivitySpawnId> {
    List<AsActivitySpawn> findByIdACTIVITYGUID(String ACTIVITYGUID);
}
