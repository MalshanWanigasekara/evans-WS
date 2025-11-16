package com.example.evansWS.controllers;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.example.evansWS.models.Product;
import com.example.evansWS.services.ProductServiceImpl;

@RestController
@RequestMapping("/product")
public class ProductController {
    
    private final ProductServiceImpl productService;

    ProductController(ProductServiceImpl productService){
        this.productService = productService;
    }

    @GetMapping
    @CircuitBreaker(name = "testCB", fallbackMethod = "fallback")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();

    }

    @PostMapping
    public void addProduct(@RequestBody Product newProduct){
        productService.addProduct(newProduct);
    }

    @PutMapping("/{pid}")
    public void updateProduct(@PathVariable Long pid, @RequestBody Product updatingProduct){
        productService.updateProduct(pid, updatingProduct);

    }

    public String fallback(Throwable ex) {
        return "Fallback response due to error.";
    }
    
}
