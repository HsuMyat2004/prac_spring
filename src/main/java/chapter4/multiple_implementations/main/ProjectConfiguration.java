package chapter4.multiple_implementations.main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "chapter4.multiple_implementations.proxies",
        "chapter4.multiple_implementations.services",
        "chapter4.multiple_implementations.respositories"
})
public class ProjectConfiguration {
}
