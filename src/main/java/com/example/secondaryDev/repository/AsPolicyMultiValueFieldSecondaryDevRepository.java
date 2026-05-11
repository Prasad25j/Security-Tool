package com.example.secondaryDev.repository;

import com.example.entity.AsPolicyMultiValueField;
import com.example.entity.AsPolicyMultiValueFieldId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsPolicyMultiValueFieldSecondaryDevRepository extends JpaRepository<AsPolicyMultiValueField, AsPolicyMultiValueFieldId> {
}
