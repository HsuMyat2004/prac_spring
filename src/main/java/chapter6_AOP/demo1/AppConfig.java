package chapter6_AOP.demo1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy(proxyTargetClass = true) //if it's true then it will become JDK Dynamic proxy to CGLIB proxy
public class AppConfig {
}
