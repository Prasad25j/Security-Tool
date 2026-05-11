package com.example.secondary.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.entity.AsActivityField;
import com.example.entity.AsActivityFieldId;

@Repository
public interface AsActivityFieldSecondaryRepository extends JpaRepository<AsActivityField, AsActivityFieldId> {
    List<AsActivityField> findByIdACTIVITYGUID(String ACTIVITYGUID);
}