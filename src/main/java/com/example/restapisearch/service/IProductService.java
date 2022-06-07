package com.example.restapisearch.service;

import com.example.restapisearch.entity.Product;
import com.example.restapisearch.input.ProductInput;

import java.util.List;

public interface IProductService {
    List<Product> search(String query);
    Product save(Product product);
    List<Product> findAll();
    // feature branch 5 changes

    // test changes for feature branch5
}
