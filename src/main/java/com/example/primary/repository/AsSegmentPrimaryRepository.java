package com.example.primary.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.entity.AsSegment;

@Repository
public interface AsSegmentPrimaryRepository extends JpaRepository<AsSegment, String> {
    List<AsSegment> findByPOLICYGUID(String POLICYGUID);
}
