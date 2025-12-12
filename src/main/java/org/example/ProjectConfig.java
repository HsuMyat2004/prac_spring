package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "org.example")
public class ProjectConfig {

    // bean annotation methods only can write under configuration annotation class

//    @Bean
//    Cat cat1(){
//        var cat = new Cat();
//        cat.setCatName("cat1");
//        return cat;
//    }
//
//    // if there will many beans and u didn't define it u will get no unique bean definition exception error
//    @Bean
//    @Value("cat2")
//    Cat cat2(){
//        var cat = new Cat();
//        cat.setCatName("cat2");
//        return cat;
//    }
//
//    @Bean(name = "cat3")
//    Cat cat3(){
//        var cat = new Cat();
//        cat.setCatName("cat3");
//        return cat;
//    }
//
//    @Bean("cat4")
//    Cat cat4(){
//        var cat = new Cat();
//        cat.setCatName("cat4");
//        return cat;
//    }
}
