package com.example.dto;

import java.util.List;
import lombok.Data;

@Data
public class PlanTransactionDto {
    private String transactionGuid;
    private List<ButtonDto> buttons;
}
