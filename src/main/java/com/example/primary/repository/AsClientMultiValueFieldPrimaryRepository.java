package com.example.primary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.entity.AsClientMultiValueField;
import com.example.entity.AsClientMultiValueFieldId;
import java.util.List;

@Repository
public interface AsClientMultiValueFieldPrimaryRepository extends JpaRepository<AsClientMultiValueField, AsClientMultiValueFieldId> {
    List<AsClientMultiValueField> findByIdCLIENTGUID(String CLIENTGUID);
}
