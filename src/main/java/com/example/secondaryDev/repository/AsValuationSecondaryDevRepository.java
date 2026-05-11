package com.example.secondaryDev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.AsValuation;

@Repository
public interface AsValuationSecondaryDevRepository extends JpaRepository<AsValuation, String>{

}
