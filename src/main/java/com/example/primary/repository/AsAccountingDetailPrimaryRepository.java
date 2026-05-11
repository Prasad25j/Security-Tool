package com.example.primary.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.AsAccountingDetail;

@Repository
public interface AsAccountingDetailPrimaryRepository extends JpaRepository<AsAccountingDetail, String>{
	
	List<AsAccountingDetail> findByactivityGuidIn(List<String> activityGuid);

}
