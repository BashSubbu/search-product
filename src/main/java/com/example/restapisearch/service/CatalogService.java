package com.example.restapisearch.service;

import java.util.List;

import com.example.restapisearch.dto.CatalogProjection;
import com.example.restapisearch.repository.CatalogRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogService implements ICatalogService{

    @Autowired
    private CatalogRepository catalogRepository;

    @Override
    public List<CatalogProjection> getAllCatalogsInfo() {
        return catalogRepository.getAllCatalogsInfo();
    }

    @Override
    public List<CatalogProjection> getAllCatalogSearchInfo(String searchText) {
        return catalogRepository.getAllCatalogSearchInfo(searchText);
    }
    
}
