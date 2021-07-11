package com.vpc.rest.api.productdata.controller;

import com.vpc.rest.api.productdata.model.ProductData;
import com.vpc.rest.api.productdata.service.ProductDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
public class ProductDataController {

    @Autowired
    private ProductDataService productDataService;

    @GetMapping(value="/productdata/{productId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ProductData> retrieveProductData (@PathVariable String productId) {

        return ResponseEntity.ok(productDataService.getProductData(productId));
    }
}
