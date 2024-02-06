package com.crudops.springbootcrudexample.controller;

import com.crudops.springbootcrudexample.entity.Product;
import com.crudops.springbootcrudexample.service.ProductService;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService service;
    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return service.saveProduct(product);
    }
    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> product){
        return service.saveProducts(product);
    }

    @PostMapping("/findProducts")
    public List<Product> findAllProduct(){
        return service.getProducts();
    }

    @PostMapping("/findProductsById/{id}")
    public Product findProductById(@PathVariable  int id){
        return service.getProductById(id);
    }

    @PostMapping("/addProductsByName/{name}")
    public Product findProductByName(@PathVariable  String name){
        return service.getProductByName(name);
    }

    @PutMapping("/updateProduct")
    public Product updateProduct(@RequestBody Product product){
        return service.updateProduct(product);
    }

    @DeleteMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable  int id){
        return service.deleteProduct(id);
    }

}
