package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "org.example")
public class ProjectConfig {

//    @Bean(name = "Bo Phyu")
//    Cat cat1(){
//        var c = new Cat("Bo Phyu",12);
////        c.setName("Bo Phyu");
//        return c;
//    }
//
//    @Bean(value = "Bo Ni")
//    //@Primary
//    Cat cat2(){
//        var c = new Cat("Bo Ni",12);
////        c.setName("Bo Phyu");
//        return c;
//    }
//
//
//    @Bean
//    String hello(){
//        return "Hello World";
//    }
//
//    @Bean
//    Integer number(){
//        return 10;
//    }

}
