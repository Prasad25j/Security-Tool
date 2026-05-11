package com.example.primary.repository;

import com.example.entity.AsPolicyField;
import com.example.entity.AsPolicyFieldId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AsPolicyFieldPrimaryRepository extends JpaRepository<AsPolicyField, AsPolicyFieldId> {
    List<AsPolicyField> findByIdPOLICYGUID(String POLICYGUID);
}
