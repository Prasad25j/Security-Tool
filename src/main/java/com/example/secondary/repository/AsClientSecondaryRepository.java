package com.example.secondary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.AsClient;
import java.util.List;
public interface AsClientSecondaryRepository extends JpaRepository<AsClient, String> {
    List<AsClient> findByCLIENTGUID(String clientGuid);
}
