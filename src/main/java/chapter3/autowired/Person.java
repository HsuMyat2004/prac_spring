package chapter3.autowired;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "Kate";

   // private String name;

    @Autowired
    private Parrot parrot;

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
    public void setParrot(Parrot parrot){
        this.parrot = parrot;
    }
}
