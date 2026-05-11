package com.example.secondary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.entity.AsActivityMath;
import com.example.entity.AsActivityMathId;
import java.util.List;

@Repository
public interface AsActivityMathSecondaryRepository extends JpaRepository<AsActivityMath, AsActivityMathId> {
    // Define query methods if needed
    List<AsActivityMath> findByIdACTIVITYGUID(String ACTIVITYGUID);
}
