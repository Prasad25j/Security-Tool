package com.example.primary.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.AsSegmentField;
import com.example.entity.AsSuspense;
import com.example.entity.AsSuspenseField;
import com.example.entity.AsSuspenseFieldId;

@Repository
public interface AsSuspenseFieldPrimaryRepository extends JpaRepository<AsSuspenseField, AsSuspenseFieldId>{
	
	 List<AsSuspenseField> findByIdSuspenseGuid(String suspenseGuid);

}
