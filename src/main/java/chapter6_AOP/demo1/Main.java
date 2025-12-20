package chapter6_AOP.demo1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();;
        var service = context.getBean(CurrencyService.class);
        service.changeCurrency("US");
    }
}
