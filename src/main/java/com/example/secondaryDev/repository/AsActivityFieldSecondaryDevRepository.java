package com.example.secondaryDev.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.entity.AsActivityField;
import com.example.entity.AsActivityFieldId;

@Repository
public interface AsActivityFieldSecondaryDevRepository extends JpaRepository<AsActivityField, AsActivityFieldId> {
    
}