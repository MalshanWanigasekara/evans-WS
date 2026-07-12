package com.example.productservice.services;

import java.util.ArrayList;
import java.util.List;

//import org.springframework.stereotype.Service;

import com.example.productservice.Repository.ProductRepository;
import com.example.productservice.models.Product;

//@Service
public class ProductServiceImpl implements ProductService {

    ProductRepository productRepository;

    ProductServiceImpl(ProductRepository productRepository){

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

    public void removeProduct(Long productId){

    }

    void testMethod(){

        StringBuilder stringBuilder = new StringBuilder("Evan");

        StringBuffer stringBuffer = new StringBuffer();

        List<String> nameList = new ArrayList<>();
        nameList.add("malshan");
        nameList.add("Sawani");
        nameList.add("Evan");

        List<String> modifiedList = nameList.stream()
                .filter(n->n.startsWith("m"))
                .map(String::toUpperCase)
                .toList();
    }


    
}
