package com.example.primary.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.AsClient;


public interface AsClientPrimaryRepository extends JpaRepository<AsClient, String> {
	List<AsClient> findByCLIENTGUID(String clientGuid);
}

