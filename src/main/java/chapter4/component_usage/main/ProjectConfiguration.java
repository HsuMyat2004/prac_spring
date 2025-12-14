package chapter4.component_usage.main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "chapter4.component_usage.proxies",
        "chapter4.component_usage.services",
        "chapter4.component_usage.respositories"
})
public class ProjectConfiguration {
}
