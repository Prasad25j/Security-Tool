package com.example.secondaryDev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.entity.AsSegment;

@Repository
public interface AsSegmentSecondaryDevRepository extends JpaRepository<AsSegment, String> {
}
