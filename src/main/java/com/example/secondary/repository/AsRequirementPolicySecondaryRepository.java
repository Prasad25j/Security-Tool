package com.example.secondary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.AsRequirementPolicy;
import com.example.entity.AsRequirementPolicyId;
import java.util.List;
public interface AsRequirementPolicySecondaryRepository extends JpaRepository<AsRequirementPolicy, AsRequirementPolicyId> {
    List<AsRequirementPolicy> findByIdPOLICYGUID(String POLICYGUID);
}
