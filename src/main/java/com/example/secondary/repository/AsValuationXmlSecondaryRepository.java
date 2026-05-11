package com.example.secondary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.example.entity.AsValuationXml;

@Repository
public interface AsValuationXmlSecondaryRepository extends JpaRepository<AsValuationXml, String> {
    List<AsValuationXml> findByactivityGuidIn(List<String> activityGuid);
}
