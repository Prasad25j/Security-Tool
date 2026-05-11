// Primary Repository
package com.example.primary.repository;

import com.example.entity.AsRequirementClient;
import com.example.entity.AsRequirementClientId;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AsRequirementClientPrimaryRepository extends JpaRepository<AsRequirementClient, AsRequirementClientId> {
    List<AsRequirementClient> findByIdREQUIREMENTGUID(String REQUIREMENTGUID);
	
}

