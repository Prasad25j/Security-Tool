package com.example.secondaryDev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.AsAddressPhone;
import java.util.List;

public interface AsAddressPhoneSecondaryDevRepository extends JpaRepository<AsAddressPhone, String> {
    
}
