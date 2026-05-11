package com.example.dto;

import java.util.List;
import lombok.Data;

@Data
public class SecurityGroupDto {
    private String groupName;
    private List<CompanyDto> companies;
}
