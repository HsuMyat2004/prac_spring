package chapter4.autowired.main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "chapter4.autowired.proxies",
        "chapter4.autowired.services",
        "chapter4.autowired.respositories"
})
public class ProjectConfiguration {
}
