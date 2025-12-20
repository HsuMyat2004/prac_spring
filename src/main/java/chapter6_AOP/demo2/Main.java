package chapter6_AOP.demo2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new
                AnnotationConfigApplicationContext(ProjectConfig.class);
        context.registerShutdownHook();
        var service = context.getBean(AmazingCurrencyService.class);
        service.changeCurrency("UK");
    }
}
