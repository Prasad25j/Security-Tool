package com.example.secondary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.AsAddressPhone;
import java.util.List;

public interface AsAddressPhoneSecondaryRepository extends JpaRepository<AsAddressPhone, String> {
    List<AsAddressPhone> findByADDRESSGUID(String ADDRESSGUID);
}
