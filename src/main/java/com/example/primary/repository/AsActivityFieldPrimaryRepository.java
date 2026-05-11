package com.example.primary.repository;

import java.util.List;
import com.example.entity.AsActivityField;
import com.example.entity.AsActivityFieldId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsActivityFieldPrimaryRepository extends JpaRepository<AsActivityField, AsActivityFieldId> {
    List<AsActivityField> findByIdACTIVITYGUID(String ACTIVITYGUID);
}
