package com.example.secondaryDev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.entity.AsPhone;

@Repository
public interface AsPhoneSecondaryDevRepository extends JpaRepository<AsPhone, String> {
    
}
