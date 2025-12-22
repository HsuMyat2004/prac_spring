package chapter6_AOP.demo4.with_interface;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        var context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        context.registerShutdownHook();

        var myTestService = context.getBean(MyTestServiceInterface.class);
        //interface calling must be done

        myTestService.test1("Hello");
        myTestService.test3("Hello");



    }
}
