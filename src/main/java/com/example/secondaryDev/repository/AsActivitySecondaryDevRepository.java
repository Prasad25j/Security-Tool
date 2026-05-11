package com.example.secondaryDev.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.entity.AsActivity;

@Repository
public interface AsActivitySecondaryDevRepository extends JpaRepository<AsActivity, String> {
	
}
