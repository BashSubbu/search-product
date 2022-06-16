package com.example.restapisearch.repository;

import com.example.restapisearch.entity.CatalogAssets;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogAssetsRepository extends JpaRepository<CatalogAssets,Long> {
    
}
