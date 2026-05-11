package com.example.secondary.repository;

import com.example.entity.AsRequirementActivity;
import com.example.entity.AsRequirementActivityId;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface AsRequirementActivitySecondaryRepository extends JpaRepository<AsRequirementActivity, AsRequirementActivityId> {
    List<AsRequirementActivity> findByIdREQUIREMENTGUID(String REQUIREMENTGUID);
}