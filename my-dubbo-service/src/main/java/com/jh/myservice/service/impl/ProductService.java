package com.jh.myservice.service.impl;

import java.util.Random;

import org.springframework.stereotype.Service;

import com.jh.myservice.service.IProduct;

@Service
public class ProductService implements IProduct {

    private final Random r = new Random();

    @Override
    public Long getProductId() {
        return r.nextLong();
    }

    @Override
    public String getProductName() {
        return "Product-" + r.nextLong();
    }

}
