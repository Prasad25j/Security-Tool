package com.example.dto;

import java.util.List;
import lombok.Data;

@Data
public class PlanDto {
    private String planGuid;
    private List<PlanPageDto> planPages;
    private List<PlanTransactionDto> planTransactions;
}
