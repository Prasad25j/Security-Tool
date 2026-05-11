package com.example.primary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.AsAddressRole;
import java.util.List;

public interface AsAddressRolePrimaryRepository extends JpaRepository<AsAddressRole, String> {
    List<AsAddressRole> findByCLIENTGUID(String CLIENTGUID);
}
