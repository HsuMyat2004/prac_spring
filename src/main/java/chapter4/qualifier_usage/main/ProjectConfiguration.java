package chapter4.qualifier_usage.main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "chapter4.qualifier_usage.proxies",
        "chapter4.qualifier_usage.services",
        "chapter4.qualifier_usage.respositories"
})
public class ProjectConfiguration {
}
