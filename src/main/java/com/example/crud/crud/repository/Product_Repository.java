package com.example.crud.crud.repository;

import com.example.crud.crud.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Product_Repository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}
