package com.example.andrei.spring1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Automatically genereted getters and setters and constructor and toString and equals and hashCode
record Person(String name, int age, Adress adress) {}
record Adress(String fisrtLine, String city){}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Andrei";
    }

    @Bean
    public int age(){
        return 21;
    }

    // Diferite variante de a crea Bean-uri (valori, alte bean-uri sau parametrii)
    @Bean
    public Person person(){
         return new Person("Andres", 22, new Adress("Alee", "Iasi"));
    }

    @Bean
    public Person person2(){
        return new Person(name(), age(), adress1());
    }

    @Bean
    public Person person3(String name, int age, Adress adress2){
        return new Person(name, age, adress2);
    }

    @Bean(name = "adress1") // Daca nu punem name, atunci Spring va folosi numele metodei ca nume default al bean-ului.
    public Adress adress1(){
        return new Adress("Strada", "Bucuresti");
    }

    @Bean(name = "adress2")
    public Adress adress2(){
        return new Adress("First", "Cluj");
    }


}
