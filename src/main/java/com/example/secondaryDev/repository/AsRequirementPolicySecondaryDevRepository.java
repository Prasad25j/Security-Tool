package com.example.secondaryDev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.AsRequirementPolicy;
import com.example.entity.AsRequirementPolicyId;

public interface AsRequirementPolicySecondaryDevRepository extends JpaRepository<AsRequirementPolicy, AsRequirementPolicyId> {
}
