package chapter3.parameter_injection;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
    private String name;

    @Autowired
    private Parrot parrot;

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
