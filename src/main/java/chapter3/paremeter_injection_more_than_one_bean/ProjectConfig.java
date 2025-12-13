package chapter3.paremeter_injection_more_than_one_bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {
    @Bean
    public Parrot parrot1() {
        Parrot p = new Parrot();
        p.setName("Ko ko");
        return p;
    }

    @Bean
   // @Primary
    public Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("Ni Ni");
        return p;
    }

//    @Bean
//    public Person person(
//            Parrot parrot2) { // injecting through method parameter
//        Person p = new Person();
//        p.setName("Ella");
//        p.setParrot(parrot2);// that parameter is called
//        return p;
//    }

    // No qualifying bean of type error
    @Bean
    public Person person(
           @Qualifier("parrot2") Parrot parrot) { // injecting through method parameter
        Person p = new Person();
        p.setName("Ella");
        p.setParrot(parrot);// that parameter is called
        return p;
    }
}
