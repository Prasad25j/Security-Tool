package com.example.secondaryDev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.AsSegmentField;
import com.example.entity.AsSuspenseField;
import com.example.entity.AsSuspenseFieldId;

@Repository
public interface AsSuspenseFieldSecondaryDevRepository extends JpaRepository<AsSuspenseField, AsSuspenseFieldId>{

}
