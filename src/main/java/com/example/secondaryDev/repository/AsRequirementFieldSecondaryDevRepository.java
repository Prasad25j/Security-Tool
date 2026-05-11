// Secondary Repository
package com.example.secondaryDev.repository;

import com.example.entity.AsRequirementField;
import com.example.entity.AsRequirementFieldId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AsRequirementFieldSecondaryDevRepository extends JpaRepository<AsRequirementField, AsRequirementFieldId> {
  
}
