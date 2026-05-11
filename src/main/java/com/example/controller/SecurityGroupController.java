package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.dto.SecurityGroupRequestDto;
import com.example.service.SecurityGroupService;
import java.util.List;

@RestController
@RequestMapping("/api/security-groups")
public class SecurityGroupController {

    @Autowired
    private SecurityGroupService securityGroupService;

    /**
     * Accepts the security group JSON payload and returns the generated
     * SQL INSERT queries without executing them against the database.
     */
    @PostMapping
    public ResponseEntity<List<String>> createSecurityGroup(@RequestBody SecurityGroupRequestDto request) {
        List<String> queries = securityGroupService.generateInsertQueries(request);
        return ResponseEntity.ok(queries);
    }
}
