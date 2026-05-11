package com.example.secondaryDev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.AsAddress;
import java.util.List;

public interface AsAddressSecondaryDevRepository extends JpaRepository<AsAddress, String> {
	
}
