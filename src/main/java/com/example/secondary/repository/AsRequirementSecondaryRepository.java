package com.example.secondary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.AsRequirement;

import java.util.List;

public interface AsRequirementSecondaryRepository extends JpaRepository<AsRequirement, String> {
    List<AsRequirement> findByREQUIREMENTGUID(String REQUIREMENTGUID);
}
