package com.example.primary.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.entity.AsPhone;

@Repository
public interface AsPhonePrimaryRepository extends JpaRepository<AsPhone, String> {
   List<AsPhone> findByPHONENUMBERGUID(String PHONENUMBERGUID);
}
