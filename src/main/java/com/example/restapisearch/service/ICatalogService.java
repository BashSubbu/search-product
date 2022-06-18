package com.example.restapisearch.service;

import java.util.List;

import com.example.restapisearch.dto.CatalogProjection;

public interface ICatalogService {
    List<CatalogProjection> getAllCatalogsInfo();
    List<CatalogProjection> getAllCatalogSearchInfo(String searchText);

    
}