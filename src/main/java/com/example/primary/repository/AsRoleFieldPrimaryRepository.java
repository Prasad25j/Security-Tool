package com.example.primary.repository;

import com.example.entity.AsRoleField;
import com.example.entity.AsRoleFieldId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AsRoleFieldPrimaryRepository extends JpaRepository<AsRoleField, AsRoleFieldId> {
    List<AsRoleField> findByIdROLEGUID(String ROLEGUID);
}
