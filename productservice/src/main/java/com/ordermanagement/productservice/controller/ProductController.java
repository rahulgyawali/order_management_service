package com.ordermanagement.productservice.controller;

import com.ordermanagement.productservice.dto.ProductCreateRequest;
import com.ordermanagement.productservice.dto.ProductResponse;
import com.ordermanagement.productservice.repository.IProductDao;
import com.ordermanagement.productservice.service.IProductService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    private IProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addProduct(@RequestBody ProductCreateRequest productCreateRequest){
        productService.createProduct(productCreateRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse>  viewProduct(){
        return productService.getAllProducts();
    }
}
