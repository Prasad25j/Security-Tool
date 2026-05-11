package com.example.dto;

import java.util.List;
import lombok.Data;

@Data
public class CompanyDto {
    private String companyGuid;
    private List<CompanyPageDto> companyPages;
    private List<CompanyInquiryDto> companyInquiries;
    private List<CompanyWebServiceDto> companyWebServices;
    private List<ProductDto> products;
    private List<PlanDto> plans;
}
