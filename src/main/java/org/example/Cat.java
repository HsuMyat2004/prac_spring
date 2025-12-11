package org.example;

import org.springframework.stereotype.Component;

@Component
public class Cat {

    private String name = "mi phyu";
    private int age;

//    public Cat(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
