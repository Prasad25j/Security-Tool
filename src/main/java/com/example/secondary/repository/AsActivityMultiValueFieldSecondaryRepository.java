package com.example.secondary.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.AsActivityMultiValueField;
import com.example.entity.AsActivityMultiValueFieldId;

public interface AsActivityMultiValueFieldSecondaryRepository extends JpaRepository<AsActivityMultiValueField, AsActivityMultiValueFieldId> {
    List<AsActivityMultiValueField> findByIdACTIVITYGUID(String ACTIVITYGUID);
}
