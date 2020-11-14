package com.bahar;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {


    public static void main(String[] args) {
      /*
      step 1: xml
      ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");

        User user1 = (User) context.getBean("myUser");
                 user1.setName("elham");
                 user1.setLastName("dddd");
                 Product product= (Product) context.getBean("myProduct");
                 user1.setProduct(product);
                 System.out.println(user1);



*/
     // step2: xml+ annotation

 /*       ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);

        User user1 = (User) context.getBean("myUser");
        user1.setName("elham");
        user1.setLastName("dddd");
        Product product= (Product) context.getBean("myProduct");
        user1.setProduct(product);
        System.out.println(user1);
*/
        // step 3: java+Annotation+xml

     ApplicationContext context= new AnnotationConfigApplicationContext(Config.class);

        User user1 = (User) context.getBean("myUser");
        user1.setName("elham");
        user1.setLastName("dddd");
        Product product1= (Product) context.getBean("myProduct");
        product1.setName("wearhousessssss");
        user1.setProduct(product1);
        System.out.println(product1);
        System.out.println(user1);


        User user2 = (User) context.getBean("myUser");
        user2.setName("elham");
        user2.setLastName("dddd");
        Product product2= (Product) context.getBean("myProduct");
        product2.setName(" aaaaaaaa");
        user1.setProduct(product2);
        System.out.println(product2);
        System.out.println(user2);


   }
}
