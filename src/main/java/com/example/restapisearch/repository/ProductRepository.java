package com.example.restapisearch.repository;

import com.example.restapisearch.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository  extends JpaRepository<Product,Long> {

    @Query("SELECT p FROM Product p WHERE p.name LIKE CONCAT('%',:query, '%') OR p.description LIKE CONCAT('%',:query, '%')")
    List<Product> search(String query);

    List<Product> findAll();

}
