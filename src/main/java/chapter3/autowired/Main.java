package chapter3.autowired;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        Parrot parrot = context.getBean(Parrot.class);

        System.out.println("Person Name: " + person.getName());
        System.out.println("Parrot Name: " + person.getParrot());
        System.out.println("Person's Parrot Name: " + parrot.getName());

    }
}
