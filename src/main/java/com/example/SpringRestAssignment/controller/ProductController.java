package com.example.SpringRestAssignment.controller;


import com.example.SpringRestAssignment.bean.Product;
import com.example.SpringRestAssignment.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/addProduct")
    Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @GetMapping("/getProducts")
    List<Product> getProduct() {
        return productService.getProducts();
    }

    @GetMapping("/getProductById/{prodId}")
    Product getProductById(@PathVariable("prodId") int prodId) {
        return productService.getProductById(prodId);
    }

    @GetMapping("/getProductByName/{name}")
    Product getProductByName(@PathVariable("name") String name) {
        return productService.getProductByName(name);
    }

    @PutMapping("/updateProduct")
    Product updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }

    @DeleteMapping("/deleteProduct")
    void deleteProduct(@RequestBody Product product) {
        productService.deleteProduct(product);
    }

    @DeleteMapping("/deleteProductById/{prodId}")
    void deleteProductById(@PathVariable("prodId") int prodId){
        productService.deleteProductById(prodId);
    }


}

