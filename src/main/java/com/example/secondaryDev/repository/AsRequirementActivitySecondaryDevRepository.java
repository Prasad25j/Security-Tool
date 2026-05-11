package com.example.secondaryDev.repository;

import com.example.entity.AsRequirementActivity;
import com.example.entity.AsRequirementActivityId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AsRequirementActivitySecondaryDevRepository extends JpaRepository<AsRequirementActivity, AsRequirementActivityId> {
    
}