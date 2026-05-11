package com.example.secondary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.example.entity.AsSuspense;

@Repository
public interface AsSuspenseSecondaryRepository extends JpaRepository<AsSuspense, String>{
    List<AsSuspense> findBypolicyNumber(String policyNumber);
}
