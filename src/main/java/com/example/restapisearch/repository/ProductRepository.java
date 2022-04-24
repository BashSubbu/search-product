package com.example.restapisearch.repository;

import com.example.restapisearch.entity.Product;
import com.example.restapisearch.input.ProductInput;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository  extends JpaRepository<Product,Long> {

    Product save(Product product);

    @Query("SELECT p FROM Product p WHERE p.name LIKE CONCAT('%',:query, '%') OR p.description LIKE CONCAT('%',:query, '%')")
    List<Product> search(String query);

    List<Product> findAll();

}
