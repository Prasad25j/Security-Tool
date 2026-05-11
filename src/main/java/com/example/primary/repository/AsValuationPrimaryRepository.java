package com.example.primary.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.AsValuation;

@Repository
public interface AsValuationPrimaryRepository extends JpaRepository<AsValuation, String>{
	
	List<AsValuation> findByPolicyGuidAndActivityGuidIn(String policyGuid, List<String> activityGuids);

}
