package com.example.secondary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.entity.AsSegment;
import java.util.List;
@Repository
public interface AsSegmentSecondaryRepository extends JpaRepository<AsSegment, String> {
    List<AsSegment> findByPOLICYGUID(String POLICYGUID);
}
