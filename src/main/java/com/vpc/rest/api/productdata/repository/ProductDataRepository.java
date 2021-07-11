package com.vpc.rest.api.productdata.repository;

import com.vpc.rest.api.productdata.model.ProductData;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ProductDataRepository extends MongoRepository<ProductData, String> {
    Optional<ProductData> findByProductId(String productId);
}
