package com.example.secondaryDev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.AsClient;

public interface AsClientSecondaryDevRepository extends JpaRepository<AsClient, String> {
}
