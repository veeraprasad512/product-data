package com.vpc.rest.api.productdata.exception;

public class ApiException extends RuntimeException{
    public ApiException(String message) {
        super(message);
    }
}
