package com.example.secondary.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.AsAddressField;
import com.example.entity.AsAddressFieldId;

public interface AsAddressFieldSecondaryRepository extends JpaRepository<AsAddressField, AsAddressFieldId> {
    List<AsAddressField> findByIdADDRESSGUID(String ADDRESSGUID);
}
