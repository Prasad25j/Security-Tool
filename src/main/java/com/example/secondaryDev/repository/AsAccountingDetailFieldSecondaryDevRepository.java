package com.example.secondaryDev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.AsAccountingDetail;
import com.example.entity.AsAccountingDetailField;
import com.example.entity.AsAccountingDetailFieldId;

@Repository
public interface AsAccountingDetailFieldSecondaryDevRepository extends JpaRepository<AsAccountingDetailField,AsAccountingDetailFieldId>{
	

}
