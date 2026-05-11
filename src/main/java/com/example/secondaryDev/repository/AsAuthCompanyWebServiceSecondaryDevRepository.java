package com.example.secondaryDev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.AsAuthCompanyWebService;
import com.example.entity.AsAuthCompanyWebServiceId;

public interface AsAuthCompanyWebServiceSecondaryDevRepository extends JpaRepository<AsAuthCompanyWebService, AsAuthCompanyWebServiceId> {
}
