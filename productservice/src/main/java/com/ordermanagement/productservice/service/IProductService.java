package com.ordermanagement.productservice.service;

import com.ordermanagement.productservice.dto.ProductCreateRequest;
import com.ordermanagement.productservice.dto.ProductResponse;

import java.util.List;

public interface IProductService {

    public void createProduct(ProductCreateRequest productCreateRequest);

    public List<ProductResponse> getAllProducts();
}
