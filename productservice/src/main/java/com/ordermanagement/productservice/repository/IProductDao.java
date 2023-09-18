package com.ordermanagement.productservice.repository;

import com.ordermanagement.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IProductDao extends MongoRepository<Product,String> {
}
