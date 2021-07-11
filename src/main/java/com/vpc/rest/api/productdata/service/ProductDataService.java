package com.vpc.rest.api.productdata.service;

import com.vpc.rest.api.productdata.exception.ApiException;
import com.vpc.rest.api.productdata.model.ProductData;

public interface ProductDataService {

    ProductData getProductData(String productId) throws ApiException;
}
