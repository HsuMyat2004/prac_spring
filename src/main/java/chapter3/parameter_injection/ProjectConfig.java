package chapter3.parameter_injection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    public Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("Ko ko");
        return p;
    }

    @Bean
    public Person person(Parrot parrot) { // injecting through method parameter
        Person p = new Person();
        p.setName("Ella");
        p.setParrot(parrot);// that parameter is called
        return p;
    }
}
