package com.example.secondaryDev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.AsSuspense;

@Repository
public interface AsSuspenseSecondaryDevRepository extends JpaRepository<AsSuspense, String>{

}
