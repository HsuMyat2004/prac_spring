package chapter6.demo3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

// step 1. Enables the aspects mechanism in a Spring app
@Configuration
@ComponentScan(basePackages = "chapter6.demo3")
@EnableAspectJAutoProxy // Enables the aspects mechanism in our Spring app

public class ProjectConfig {
    @Bean
    public LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }
}
