package com.crudops.springbootcrudexample.repository;

import com.crudops.springbootcrudexample.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

//Arguments passed : Model name is product, and datatype of primary key is Int

public interface ProductRepository extends JpaRepository<Product, Integer> {

    Product findByName(String name);

}
