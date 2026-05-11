package com.example.primary.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.entity.AsActivityMath;
import com.example.entity.AsActivityMathId;

@Repository
public interface AsActivityMathPrimaryRepository extends JpaRepository<AsActivityMath, AsActivityMathId> {
    List<AsActivityMath> findByIdACTIVITYGUID(String ACTIVITYGUID);
}
