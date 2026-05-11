package com.example.primary.repository;

import com.example.entity.AsRequirementActivity;
import com.example.entity.AsRequirementActivityId;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AsRequirementActivityPrimaryRepository extends JpaRepository<AsRequirementActivity, AsRequirementActivityId> {
    List<AsRequirementActivity> findByIdREQUIREMENTGUID(String REQUIREMENTGUID);
}