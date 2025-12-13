package chapter3.paremeter_injection_more_than_one_bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);

        System.out.println("Person Name: " + person.getName());
        System.out.println("Parrot Name: " + person.getParrot());

    }
}
