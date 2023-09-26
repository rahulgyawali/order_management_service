package com.project.productservice.service;

import com.project.productservice.dao.IProductDao;
import com.project.productservice.model.Product;
import com.project.productservice.request.ProductAddRequest;
import com.project.productservice.response.ProductResponse;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Slf4j
@Service
public class ProductService implements IProductService{

    private IProductDao productDao;

    public void addProduct(ProductAddRequest request){
        Product product =  Product.builder()
                            .name(request.getName())
                            .description(request.getDescription())
                            .price(request.getPrice())
                            .build();
        log.info("Saving Product");
        productDao.save(product);
        log.info("Saved Product with id "+product.getId());
    }

    public List<ProductResponse> getAllProduct() {
        List<Product> productList = productDao.findAll();
        return productList.stream().map(this::convertProductToProductResponse).toList();
    }

    private ProductResponse convertProductToProductResponse(Product product){
        return ProductResponse.builder()
                .id(product.getId())
                .description(product.getDescription())
                .price(product.getPrice())
                .name(product.getName())
                .build();
    }
}
