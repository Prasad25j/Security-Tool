package com.example.secondaryDev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.AsAuthTransaction;

public interface AsAuthTransactionSecondaryDevRepository extends JpaRepository<AsAuthTransaction, String> {
}
