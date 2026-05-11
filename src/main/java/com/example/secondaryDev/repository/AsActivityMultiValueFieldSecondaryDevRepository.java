package com.example.secondaryDev.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.AsActivityMultiValueField;
import com.example.entity.AsActivityMultiValueFieldId;

public interface AsActivityMultiValueFieldSecondaryDevRepository extends JpaRepository<AsActivityMultiValueField, AsActivityMultiValueFieldId> {
    
}
