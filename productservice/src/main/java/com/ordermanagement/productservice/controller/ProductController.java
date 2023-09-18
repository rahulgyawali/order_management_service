package com.ordermanagement.productservice.controller;

import com.ordermanagement.productservice.dto.ProductCreateRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addProduct(@RequestBody ProductCreateRequest productCreateRequest){

    }

}
