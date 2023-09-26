package com.project.productservice.controller;

import com.project.productservice.model.Product;
import com.project.productservice.request.ProductAddRequest;
import com.project.productservice.response.ProductResponse;
import com.project.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    private ProductService productService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addProduct(@RequestBody ProductAddRequest  request){
        productService.addProduct(request);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getProduct(@RequestBody ProductAddRequest  request){
        return  productService.getAllProduct();
    }
}
