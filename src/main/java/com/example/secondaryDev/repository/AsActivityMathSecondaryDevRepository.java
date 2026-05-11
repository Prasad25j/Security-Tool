package com.example.secondaryDev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.entity.AsActivityMath;
import com.example.entity.AsActivityMathId;

@Repository
public interface AsActivityMathSecondaryDevRepository extends JpaRepository<AsActivityMath, AsActivityMathId> {
    // Define query methods if needed
}
