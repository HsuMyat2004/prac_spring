package chapter6_AOP.demo4.without_interface;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        var context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        context.registerShutdownHook();

        var myTestService = context.getBean(MyTestService.class); //NoSuchMethodException Error occurs

        try{
          Class<?> clazz = myTestService.getClass();
          Method method = clazz.getDeclaredMethod("test4", String.class);
          method.setAccessible(true);
          method.invoke(myTestService,"::How are you");
        } catch (Exception e){
            e.printStackTrace();
        }

        myTestService.test1("Hello");
        myTestService.test2("Hello");
        myTestService.test3("Hello");



    }
}
