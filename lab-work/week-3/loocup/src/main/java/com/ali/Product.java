package com.ali;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Product {
    private String name ;
    private long price ;

    public double getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
