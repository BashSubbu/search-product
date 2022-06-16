package com.example.restapisearch.controller;

import com.example.restapisearch.dto.CatalogAssetInfo;
import com.example.restapisearch.entity.Catalog;
import com.example.restapisearch.entity.CatalogAssets;
import com.example.restapisearch.repository.CatalogAssetsRepository;
import com.example.restapisearch.repository.CatalogRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MarketPlaceController {

    @Autowired
    private CatalogRepository catalogRepository;

    @Autowired
    private CatalogAssetsRepository catalogAssetsRepository;

    @PostMapping("/v1/catalog")
    public ResponseEntity<Object> saveCatalog(@RequestBody Catalog catalog) {
        Catalog outputCatalog = null;
        if(catalog!=null){
            outputCatalog = catalogRepository.save(catalog);
            return new ResponseEntity<>(outputCatalog,HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>("create catalog failed",HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
    }

    @PostMapping("/v1/catalog/asset")
    public ResponseEntity<Object> addAsset(@RequestBody CatalogAssetInfo catalogAssetsInfo) {
        Long catalogId = null;
        Catalog catalog = null;
        String assetName = null;
        CatalogAssets catalogAssets = null;
        if(catalogAssetsInfo!=null){
            catalogId = catalogAssetsInfo.getCatalogId();
            // get catalog based on catalogId
            catalog = catalogRepository.getById(catalogId);
            assetName = catalogAssetsInfo.getAssetName();
            // creating asset and adding asset details
            catalogAssets = new CatalogAssets();
            catalogAssets.setAssetName(assetName);
            catalogAssets.setCatalog(catalog);
            catalogAssetsRepository.save(catalogAssets);
            return new ResponseEntity<>("add asset to catalog successful",HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>("add asset to catalog failed",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
