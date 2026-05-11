package com.example.primary.repository;

import com.example.entity.AsSegmentField;
import com.example.entity.AsSegmentFieldId;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AsSegmentFieldPrimaryRepository extends JpaRepository<AsSegmentField, AsSegmentFieldId> {
	List<AsSegmentField> findByIdSEGMENTGUID(String SEGMENTGUID);
}
