package com.example.secondary.repository;

import com.example.entity.AsSegmentField;
import com.example.entity.AsSegmentFieldId;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface AsSegmentFieldSecondaryRepository extends JpaRepository<AsSegmentField, AsSegmentFieldId> {
    List<AsSegmentField> findByIdSEGMENTGUID(String SEGMENTGUID);
}
