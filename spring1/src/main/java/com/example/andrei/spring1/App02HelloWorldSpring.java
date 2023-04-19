package com.example.andrei.spring1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

    public static void main(String[] args) {

        // 1. Launch a Spring Context (Caseta aceea verde din interiorul JVM-ului)

        // Prin HelloWorldConfiguration.class, Spring va lua o intansta de tip Class a clasei HelloWorldConfiguration.
        // pentru a vedea membrii, metodele si alte metadate ale clasei HelloWorldConfiguration.
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // 2. Configure the things that we want spring to manage - @Configuartion
        // HelloWorldConfiguration.java - @Configuration
        // name - @Bean

        // 3. Retrieve the Beans manged by Spring Context

        System.out.println( context.getBean("name"));
        System.out.println( context.getBean("age"));
        System.out.println( context.getBean("person"));
        System.out.println( context.getBean("person2"));
        System.out.println( context.getBean("person3"));
        System.out.println( context.getBean("adress2"));
        //System.out.println( context.getBean(Adress.class));





    }

}
