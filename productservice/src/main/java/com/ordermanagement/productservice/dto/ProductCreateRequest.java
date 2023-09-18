package com.ordermanagement.productservice.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductCreateRequest {
    private String name;
    private String description;
    private BigDecimal price;
}
