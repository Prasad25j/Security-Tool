package com.example.dto;

import java.util.List;
import lombok.Data;

@Data
public class CompanyPageDto {
    private String pageGuid;
    private List<ButtonDto> buttons;
}
