package com.example.secondary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.AsAddressMultiValueField;
import com.example.entity.AsAddressMultiValueFieldId;
import java.util.List;
public interface AsAddressMultiValueFieldSecondaryRepository extends JpaRepository<AsAddressMultiValueField, AsAddressMultiValueFieldId> {
    List<AsAddressMultiValueField> findByIdADDRESSGUID(String ADDRESSGUID);
}
