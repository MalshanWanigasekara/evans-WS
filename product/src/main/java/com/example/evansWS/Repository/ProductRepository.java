package com.example.evansWS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.evansWS.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    
}
