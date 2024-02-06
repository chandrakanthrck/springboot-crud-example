package com.crudops.springbootcrudexample.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//to initiate getters and setters using annotation
@Data
@AllArgsConstructor
@NoArgsConstructor
//as it is an entity class we need this annotation
@Entity
//name of table, if we do not specify it, it will take default class naem as the table name
@Table(name = "PRODUCT_TBL")
public class Product {
    //taking id as the primary key
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int quantity;
    private double price;
}
