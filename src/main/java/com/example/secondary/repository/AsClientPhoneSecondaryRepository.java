package com.example.secondary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.AsClientPhone;
import java.util.List;
public interface AsClientPhoneSecondaryRepository extends JpaRepository<AsClientPhone, String> {
    List<AsClientPhone> findByCLIENTGUID(String CLIENTGUID);
}
