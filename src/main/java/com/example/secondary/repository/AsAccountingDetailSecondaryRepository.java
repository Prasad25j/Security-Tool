package com.example.secondary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.AsAccountingDetail;
import java.util.List;

@Repository
public interface AsAccountingDetailSecondaryRepository extends JpaRepository<AsAccountingDetail, String>{
    List<AsAccountingDetail> findByactivityGuidIn(List<String> activityGuid);

}
