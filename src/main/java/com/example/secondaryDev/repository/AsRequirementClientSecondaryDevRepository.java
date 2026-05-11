// Secondary Repository
package com.example.secondaryDev.repository;

import com.example.entity.AsRequirementClient;
import com.example.entity.AsRequirementClientId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AsRequirementClientSecondaryDevRepository extends JpaRepository<AsRequirementClient, AsRequirementClientId> {
   
}
