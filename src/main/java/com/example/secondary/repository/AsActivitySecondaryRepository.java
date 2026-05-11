package com.example.secondary.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.entity.AsActivity;

@Repository
public interface AsActivitySecondaryRepository extends JpaRepository<AsActivity, String> {
    List<AsActivity> findByPOLICYGUID(String POLICYGUID);
}
