package com.ordermanagement.productservice.service;

import com.ordermanagement.productservice.dto.ProductCreateRequest;
import com.ordermanagement.productservice.model.Product;
import com.ordermanagement.productservice.repository.IProductDao;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl  implements IProductService{

    private IProductDao productDao;

    public void createProduct(ProductCreateRequest productCreateRequest){
        Product product = Product.builder()
                .description(productCreateRequest.getDescription())
                .name(productCreateRequest.getName())
                .price(productCreateRequest.getPrice()).build();
        productDao.save(product);
    }
}
