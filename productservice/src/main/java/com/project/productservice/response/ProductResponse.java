package com.project.productservice.response;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

@Data
@Builder
public class ProductResponse {
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}
