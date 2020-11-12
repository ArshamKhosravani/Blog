package com.asgar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
    private String name ;
    @Autowired
    private Product product ;

//
//    public User(String name, Product product) {
//        this.name = name;
//        this.product = product;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", product=" + product +
                '}';
    }
}
