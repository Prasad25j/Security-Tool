package com.example.primary.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.AsRequirementPolicy;
import com.example.entity.AsRequirementPolicyId;

public interface AsRequirementPolicyPrimaryRepository extends JpaRepository<AsRequirementPolicy, AsRequirementPolicyId> {
    List<AsRequirementPolicy> findByIdPOLICYGUID(String POLICYGUID);
}
