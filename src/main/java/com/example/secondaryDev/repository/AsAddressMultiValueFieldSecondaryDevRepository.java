package com.example.secondaryDev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.AsAddressMultiValueField;
import com.example.entity.AsAddressMultiValueFieldId;

public interface AsAddressMultiValueFieldSecondaryDevRepository extends JpaRepository<AsAddressMultiValueField, AsAddressMultiValueFieldId> {
    
}
