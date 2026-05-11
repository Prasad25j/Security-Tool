package com.example.secondary.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.entity.AsPolicy;
@Repository
public interface SecondaryRepository extends JpaRepository<AsPolicy, String> {
    List<AsPolicy> POLICYGUID(String POLICYGUID);
    List<AsPolicy> POLICYNUMBER(String POLICYNUMBER);
}