package com.example.evansWS.services;

import com.example.evansWS.models.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();

    void addProduct(Product product);

    void updateProduct(Long productId, Product product);

    void removeProduct(Long productId);


}
