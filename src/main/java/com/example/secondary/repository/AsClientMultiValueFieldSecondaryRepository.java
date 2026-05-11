package com.example.secondary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.entity.AsClientMultiValueField;
import com.example.entity.AsClientMultiValueFieldId;
import java.util.List;

@Repository
public interface AsClientMultiValueFieldSecondaryRepository extends JpaRepository<AsClientMultiValueField, AsClientMultiValueFieldId> {
    List<AsClientMultiValueField> findByIdCLIENTGUID(String CLIENTGUID);
}