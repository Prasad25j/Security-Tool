package com.example.secondary.repository;

import com.example.entity.AsSegmentMultiValueField;
import com.example.entity.AsSegmentMultiValueFieldId;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface AsSegmentMultiValueFieldSecondaryRepository extends JpaRepository<AsSegmentMultiValueField, AsSegmentMultiValueFieldId> {

    List<AsSegmentMultiValueField> findByIdSEGMENTGUID(String SEGMENTGUID);
}
