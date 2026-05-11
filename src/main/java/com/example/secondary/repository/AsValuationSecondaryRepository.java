package com.example.secondary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.example.entity.AsValuation;

@Repository
public interface AsValuationSecondaryRepository extends JpaRepository<AsValuation, String>{
    List<AsValuation> findByPolicyGuidAndActivityGuidIn(String policyGuid, List<String> activityGuids);

}
