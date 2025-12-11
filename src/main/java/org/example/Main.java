package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//        Cat c = context.getBean("cat2",Cat.class);
        Cat c = context.getBean(Cat.class);
        System.out.println(c.getName());
        System.out.println(c.getAge());

//        String s = context.getBean(String.class);
//        System.out.println(s);
//
//        Integer i = context.getBean(Integer.class);
//        System.out.println(i);
    }
}