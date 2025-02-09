package com.example.evansWS.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.evansWS.Repository.ProductRepository;
import com.example.evansWS.models.Product;

@Service
public class ProductService {

    ProductRepository productRepository;

    ProductService(ProductRepository productRepository){

        this.productRepository = productRepository;

    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public void addProduct(Product product){
        productRepository.save(product);
    }

    public void updateProduct(Long productId, Product product){
        product.setProductId(productId);
        productRepository.save(product);
    }
    
}
