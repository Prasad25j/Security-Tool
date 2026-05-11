package com.example.dto;

import java.util.List;
import lombok.Data;

@Data
public class PlanPageDto {
    private String pageGuid;
    private List<ButtonDto> buttons;
}
