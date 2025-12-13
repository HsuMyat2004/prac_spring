package chapter3.bean_and_component;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;

   // private String name;

    private final Parrot parrot;

    public Person(Parrot parrot2) {
        this.parrot = parrot2;
    }

    @PostConstruct
    public void init() {
        this.name = "John";
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public Parrot getParrot(){
        return parrot;
    }

    // setter is not allowed because parrot in person declared as final (no change after)
//    public void setParrot(Parrot parrot){
//        this.parrot = parrot;
//    }
}
