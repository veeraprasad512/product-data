package com.vpc.rest.api.productdata.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document(collection = "productdata")
public class ProductData {

    @JsonProperty("id")
    private String productId;
    private String name;

}
