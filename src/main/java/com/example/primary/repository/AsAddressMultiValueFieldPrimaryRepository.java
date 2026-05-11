package com.example.primary.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.AsAddressMultiValueField;
import com.example.entity.AsAddressMultiValueFieldId;

public interface AsAddressMultiValueFieldPrimaryRepository extends JpaRepository<AsAddressMultiValueField, AsAddressMultiValueFieldId> {
    List<AsAddressMultiValueField> findByIdADDRESSGUID(String ADDRESSGUID);
}
