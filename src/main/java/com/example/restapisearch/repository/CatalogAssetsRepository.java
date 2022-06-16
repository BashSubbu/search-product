package com.example.restapisearch.repository;

import com.example.restapisearch.entity.CatalogAssets;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogAssetsRepository extends JpaRepository<CatalogAssets,Long> {
    
}
