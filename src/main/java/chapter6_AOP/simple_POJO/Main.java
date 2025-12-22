package chapter6_AOP.simple_POJO;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try{
            MyTestService myTestService = new MyTestService();
            Class<?> clazz = myTestService.getClass();
            Method method = clazz.getDeclaredMethod("test4",String.class);
            method.setAccessible(true);
            method.invoke(myTestService,"Hello World");
        } catch (Exception e){
            e.printStackTrace();
        }


    }
}
