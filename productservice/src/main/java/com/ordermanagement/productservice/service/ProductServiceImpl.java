package com.ordermanagement.productservice.service;

import com.ordermanagement.productservice.dto.ProductCreateRequest;
import com.ordermanagement.productservice.dto.ProductResponse;
import com.ordermanagement.productservice.model.Product;
import com.ordermanagement.productservice.repository.IProductDao;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<ProductResponse> getAllProducts(){
       List<Product> productList =  productDao.findAll();
       return productList.stream().map(this::getProductResponse).toList();
    }

    private ProductResponse getProductResponse(Product product){
        return  ProductResponse.builder()
                .id(product.getId())
                .description(product.getDescription())
                .name(product.getName())
                .price(product.getPrice())
                .build();
    }
}
