package com.example.secondaryDev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.AsAuthCompany;

public interface AsAuthCompanySecondaryDevRepository extends JpaRepository<AsAuthCompany, String> {
}
