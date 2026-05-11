package com.example.secondary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.entity.AsPhone;
import java.util.List;
@Repository
public interface AsPhoneSecondaryRepository extends JpaRepository<AsPhone, String> {
    List<AsPhone> findByPHONENUMBERGUID(String PHONENUMBERGUID);
}
