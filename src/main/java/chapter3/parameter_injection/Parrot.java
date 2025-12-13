package chapter3.parameter_injection;

import org.springframework.context.annotation.Bean;


public class Parrot {
    private String name;

    public Parrot() {
        System.out.println("Parrot constructor created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot [name=" + name + "]";
    }
}
