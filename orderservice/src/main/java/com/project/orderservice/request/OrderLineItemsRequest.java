package com.project.orderservice.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class OrderLineItemsRequest {
    private Long id;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;
}
