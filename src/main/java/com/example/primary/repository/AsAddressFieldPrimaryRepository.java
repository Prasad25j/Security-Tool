package com.example.primary.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.AsAddressField;
import com.example.entity.AsAddressFieldId;

public interface AsAddressFieldPrimaryRepository extends JpaRepository<AsAddressField, AsAddressFieldId> {
    List<AsAddressField> findByIdADDRESSGUID(String ADDRESSGUID);
}
