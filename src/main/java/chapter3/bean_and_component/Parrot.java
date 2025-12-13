package chapter3.bean_and_component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Parrot {
    //private String name = "Ella";
    private String name;

    public Parrot() {
        System.out.println("Parrot constructor created");
    }

    public String getName() {
        return name;
    }

    @Autowired
    public void setName(@Value("Ella") String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot [name=" + name + "]";
    }
}
