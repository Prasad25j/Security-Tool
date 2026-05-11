package com.example.secondaryDev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.AsSecurityGroup;

public interface AsSecurityGroupSecondaryDevRepository extends JpaRepository<AsSecurityGroup, String> {
}
