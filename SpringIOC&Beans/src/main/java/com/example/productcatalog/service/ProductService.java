package com.example.productcatalog.service;

import com.example.productcatalog.entity.Product;

import java.util.List;

public interface ProductService {

    Product saveProduct(Product product);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);

}
