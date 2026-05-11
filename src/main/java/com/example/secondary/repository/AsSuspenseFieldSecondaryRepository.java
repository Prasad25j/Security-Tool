package com.example.secondary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.AsSegmentField;
import com.example.entity.AsSuspenseField;
import com.example.entity.AsSuspenseFieldId;
import java.util.List;
@Repository
public interface AsSuspenseFieldSecondaryRepository extends JpaRepository<AsSuspenseField, AsSuspenseFieldId>{
    List<AsSuspenseField> findByIdSuspenseGuid(String suspenseGuid);
}
