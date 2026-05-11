package com.example.primary.repository;


import com.example.entity.AsSegmentMultiValueField;
import com.example.entity.AsSegmentMultiValueFieldId;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AsSegmentMultiValueFieldPrimaryRepository extends JpaRepository<AsSegmentMultiValueField, AsSegmentMultiValueFieldId> {
	List<AsSegmentMultiValueField> findByIdSEGMENTGUID(String SEGMENTGUID);
}
