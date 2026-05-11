package com.example.secondary.repository;

import com.example.entity.AsPolicyField;
import com.example.entity.AsPolicyFieldId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface AsPolicyFieldSecondaryRepository extends JpaRepository<AsPolicyField, AsPolicyFieldId> {
    List<AsPolicyField> findByIdPOLICYGUID(String POLICYGUID);
}
