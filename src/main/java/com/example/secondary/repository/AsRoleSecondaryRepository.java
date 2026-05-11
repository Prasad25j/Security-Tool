package com.example.secondary.repository;

import com.example.entity.AsRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface AsRoleSecondaryRepository extends JpaRepository<AsRole, String> {
    List<AsRole> findByPOLICYGUID(String POLICYGUID);
}
