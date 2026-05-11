package com.example.secondaryDev.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.AsAddressField;
import com.example.entity.AsAddressFieldId;

public interface AsAddressFieldSecondaryDevRepository extends JpaRepository<AsAddressField, AsAddressFieldId> {
    
}
