package com.example.restapisearch.repository;

import java.util.List;
import com.example.restapisearch.dto.CatalogProjection;
import com.example.restapisearch.entity.Catalog;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface CatalogRepository extends JpaRepository<Catalog,Long>{
    @Query(value = "select c.id as Id,c.name as Name,ca.asset_name as assetName from catalog c INNER JOIN catalog_assets ca on c.id=ca.catalog_id",nativeQuery = true)
    List<CatalogProjection> getAllCatalogsInfo();
}
