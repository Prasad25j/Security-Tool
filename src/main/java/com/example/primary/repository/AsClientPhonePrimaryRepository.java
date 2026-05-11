package com.example.primary.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.AsClientPhone;

public interface AsClientPhonePrimaryRepository extends JpaRepository<AsClientPhone, String> {
    List<AsClientPhone> findByCLIENTGUID(String CLIENTGUID);
}
