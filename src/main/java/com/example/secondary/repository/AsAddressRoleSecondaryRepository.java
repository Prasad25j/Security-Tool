package com.example.secondary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.AsAddressRole;
import java.util.List;

public interface AsAddressRoleSecondaryRepository extends JpaRepository<AsAddressRole, String> {
    List<AsAddressRole> findByCLIENTGUID(String CLIENTGUID);
}
