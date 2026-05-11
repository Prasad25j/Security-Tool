package com.example.primary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.entity.AsClientField;
import com.example.entity.AsClientFieldId;

import java.util.List;

@Repository
public interface AsClientFieldPrimaryRepository extends JpaRepository<AsClientField, AsClientFieldId> {
    List<AsClientField> findByIdCLIENTGUID(String CLIENTGUID);
}
 




