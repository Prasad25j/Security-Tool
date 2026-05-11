package com.example.primary.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.AsAddressPhone;

public interface AsAddressPhonePrimaryRepository extends JpaRepository<AsAddressPhone, String> {
    List<AsAddressPhone> findByADDRESSGUID(String ADDRESSGUID);
}
