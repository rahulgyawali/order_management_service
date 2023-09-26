package com.project.productservice.service;

import com.project.productservice.model.Product;
import com.project.productservice.request.ProductAddRequest;
import com.project.productservice.response.ProductResponse;

import java.util.List;

public interface IProductService {
    public void addProduct(ProductAddRequest request);
    public List<ProductResponse> getAllProduct();
}
