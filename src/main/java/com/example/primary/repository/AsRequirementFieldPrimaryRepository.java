// Primary Repository
package com.example.primary.repository;

import com.example.entity.AsRequirementField;
import com.example.entity.AsRequirementFieldId;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AsRequirementFieldPrimaryRepository extends JpaRepository<AsRequirementField, AsRequirementFieldId> {
    List<AsRequirementField> findByIdREQUIREMENTGUID(String REQUIREMENTGUID);
}

