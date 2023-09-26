package com.project.productservice.dao;

import com.project.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IProductDao extends MongoRepository<Product,String> {
}
