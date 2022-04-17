package com.example.SpringRestAssignment.repository;


import com.example.SpringRestAssignment.bean.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
    Product findByProductName(String name);
}

