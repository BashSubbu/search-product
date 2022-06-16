package com.example.restapisearch.repository;

import com.example.restapisearch.entity.Catalog;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogRepository extends JpaRepository<Catalog,Long>{
    
}
