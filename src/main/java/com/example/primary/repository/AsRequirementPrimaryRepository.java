package com.example.primary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.AsRequirement;

import java.util.List;

public interface AsRequirementPrimaryRepository extends JpaRepository<AsRequirement, String> {
    List<AsRequirement> findByREQUIREMENTGUID(String REQUIREMENTGUID);
}
