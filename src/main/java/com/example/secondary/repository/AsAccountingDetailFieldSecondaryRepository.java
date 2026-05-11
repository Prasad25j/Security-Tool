package com.example.secondary.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.AsAccountingDetail;
import com.example.entity.AsAccountingDetailField;
import com.example.entity.AsAccountingDetailFieldId;

@Repository
public interface AsAccountingDetailFieldSecondaryRepository extends JpaRepository<AsAccountingDetailField,AsAccountingDetailFieldId>{

    List<AsAccountingDetailField> findByIdAccountingDetailGuidIn(List<String> accountingDetailGuids);

}
