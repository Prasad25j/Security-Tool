package com.example.secondaryDev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.AsAuthProduct;

public interface AsAuthProductSecondaryDevRepository extends JpaRepository<AsAuthProduct, String> {
}
