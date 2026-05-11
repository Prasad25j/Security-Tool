package com.example.secondary.repository;

import com.example.entity.AsPolicyMultiValueField;
import com.example.entity.AsPolicyMultiValueFieldId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface AsPolicyMultiValueFieldSecondaryRepository extends JpaRepository<AsPolicyMultiValueField, AsPolicyMultiValueFieldId> {
    List<AsPolicyMultiValueField> findByIdPOLICYGUID(String POLICYGUID);
}
