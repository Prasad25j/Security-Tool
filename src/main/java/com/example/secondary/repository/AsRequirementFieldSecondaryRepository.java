// Secondary Repository
package com.example.secondary.repository;

import com.example.entity.AsRequirementField;
import com.example.entity.AsRequirementFieldId;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface AsRequirementFieldSecondaryRepository extends JpaRepository<AsRequirementField, AsRequirementFieldId> {
    List<AsRequirementField> findByIdREQUIREMENTGUID(String REQUIREMENTGUID);
}
