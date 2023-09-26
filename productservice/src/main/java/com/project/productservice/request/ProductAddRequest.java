package com.project.productservice.request;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class ProductAddRequest {
    private String name;
    private String description;
    private BigDecimal price;
}
