package com.example.secondaryDev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.AsRequirement;

import java.util.List;

public interface AsRequirementSecondaryDevRepository extends JpaRepository<AsRequirement, String> {
    
}
