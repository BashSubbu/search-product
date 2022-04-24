package com.example.restapisearch.controller;
import com.example.restapisearch.entity.Product;
import com.example.restapisearch.input.ProductInput;
import com.example.restapisearch.service.IProductService;
import com.example.restapisearch.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private IProductService productService;

    @PostMapping("/v1/product")
    public ResponseEntity<Object> createProduct(@RequestBody ProductInput productInput){
        Product product = new Product();
        product.setName(productInput.getName());
        product.setDescription(productInput.getDescription());
        product.setActive(productInput.isActive());
       return ResponseEntity.ok(productService.save(product));
    }

    @GetMapping("/v1/search")
    public ResponseEntity<Object> searchProduct(@RequestParam(name = "query") String query){
        return ResponseEntity.ok(productService.search(query));
    }

    @GetMapping("/v1/products")
    public ResponseEntity<Object> getAllProducts(){
        return ResponseEntity.ok(productService.findAll());
    }



}
