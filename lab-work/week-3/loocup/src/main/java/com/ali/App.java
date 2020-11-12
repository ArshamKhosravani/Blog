package com.ali;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
       // ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        // ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        User user = context.getBean(User.class);
        Product product = context.getBean(Product.class);
        product.setName("moz");
        product.setPrice(20000);
        user.setName("ali");
        user.setLastName("piry");
        user.setProduct(product);

        User user1 = context.getBean(User.class);
        user1.setName("asgar");
        user1.setLastName("asgari");
        Product product1 = context.getBean(Product.class);
        product1.setName("khiar");
        product1.setPrice(5000);
        user1.setProduct(product1);
        System.out.println(user);
        System.out.println(user1);
    }
}
