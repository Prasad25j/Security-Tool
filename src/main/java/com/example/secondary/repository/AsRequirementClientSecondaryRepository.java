// Secondary Repository
package com.example.secondary.repository;

import com.example.entity.AsRequirementClient;
import com.example.entity.AsRequirementClientId;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface AsRequirementClientSecondaryRepository extends JpaRepository<AsRequirementClient, AsRequirementClientId> {
    List<AsRequirementClient> findByIdREQUIREMENTGUID(String REQUIREMENTGUID);
}
