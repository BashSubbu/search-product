package com.example.restapisearch.service;

import com.example.restapisearch.entity.Product;
import com.example.restapisearch.input.ProductInput;
import com.example.restapisearch.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public List<Product> search(String query) {
        List<Product> productList = productRepository.search(query);
        return productList;
    }

    // method to save product
    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }
    // test branch changes
}
