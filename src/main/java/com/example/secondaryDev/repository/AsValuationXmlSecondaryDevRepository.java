package com.example.secondaryDev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.AsValuationXml;

@Repository
public interface AsValuationXmlSecondaryDevRepository extends JpaRepository<AsValuationXml, String> {

}
