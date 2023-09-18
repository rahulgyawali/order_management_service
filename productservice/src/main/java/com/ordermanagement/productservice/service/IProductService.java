package com.ordermanagement.productservice.service;

import com.ordermanagement.productservice.dto.ProductCreateRequest;

public interface IProductService {

    public void createProduct(ProductCreateRequest productCreateRequest);
}
