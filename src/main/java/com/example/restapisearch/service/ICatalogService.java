package com.example.restapisearch.service;

import java.util.List;

import com.example.restapisearch.dto.CatalogProjection;
// some feature branch changes
public interface ICatalogService {
    List<CatalogProjection> getAllCatalogsInfo();
    List<CatalogProjection> getAllCatalogSearchInfo(String searchText);
}
