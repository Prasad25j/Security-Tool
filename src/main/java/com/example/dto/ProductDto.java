package com.example.dto;

import java.util.List;
import lombok.Data;

@Data
public class ProductDto {
    private String productGuid;
    private List<ProductPageDto> productPages;
    private List<ProductTransactionDto> productTransactions;
}
