package com.example.primary.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.entity.AsValuationXml;

@Repository
public interface AsValuationXmlPrimaryRepository extends JpaRepository<AsValuationXml, String> {
	List<AsValuationXml> findByactivityGuidIn(List<String> activityGuid);
}
