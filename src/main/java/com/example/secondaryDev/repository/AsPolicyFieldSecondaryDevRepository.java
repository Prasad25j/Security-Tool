package com.example.secondaryDev.repository;

import com.example.entity.AsPolicyField;
import com.example.entity.AsPolicyFieldId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsPolicyFieldSecondaryDevRepository extends JpaRepository<AsPolicyField, AsPolicyFieldId> {
}
