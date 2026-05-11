package com.example.dto;

import java.util.List;
import lombok.Data;

@Data
public class ProductTransactionDto {
    private String transactionGuid;
    private List<ButtonDto> buttons;
}
