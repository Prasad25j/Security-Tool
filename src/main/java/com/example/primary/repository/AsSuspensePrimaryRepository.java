package com.example.primary.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.entity.AsSuspense;

@Repository
public interface AsSuspensePrimaryRepository extends JpaRepository<AsSuspense, String>{
	  List<AsSuspense> findBypolicyNumber(String policyNumber);
}
