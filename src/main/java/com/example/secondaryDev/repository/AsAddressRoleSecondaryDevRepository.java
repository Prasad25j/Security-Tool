package com.example.secondaryDev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.AsAddressRole;
import java.util.List;

public interface AsAddressRoleSecondaryDevRepository extends JpaRepository<AsAddressRole, String> {
    
}
