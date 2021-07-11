package com.vpc.rest.api.productdata.service;

import com.vpc.rest.api.productdata.exception.ApiException;
import com.vpc.rest.api.productdata.model.ProductData;
import com.vpc.rest.api.productdata.repository.ProductDataRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductDataServiceImpl implements ProductDataService {

    private static final Logger log = LoggerFactory.getLogger(ProductDataServiceImpl.class);

    private final ProductDataRepository productDataRepository;

    @Override
    public ProductData getProductData(String productId) throws ApiException {

        Optional<ProductData> productData = productDataRepository.findByProductId(productId);
        if (productData.isPresent()) {
            return productData.get();
        }
        throw new ApiException(String.format("Product with id: %s not found", productId));
    }

}
