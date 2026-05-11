package com.example.secondary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.AsAddress;
import java.util.List;

public interface AsAddressSecondaryRepository extends JpaRepository<AsAddress, String> {
    List<AsAddress> findByADDRESSGUID(String ADDRESSGUID);
}
