package com.asgar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        User user = context.getBean(User.class);
        Product product = context.getBean(Product.class);
        user.setName("ali");
        product.setName("moz");
        System.out.println(user);
    }
}
