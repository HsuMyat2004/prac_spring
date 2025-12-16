package chapter5.demo3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//singleton bean default is eager
public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);    }
}

