package chapter3.constructor_injection_autowired;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;

   // private String name;

    private final Parrot parrot;

    @Autowired
    public Person(Parrot parrot) {
        this.parrot = parrot;
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
