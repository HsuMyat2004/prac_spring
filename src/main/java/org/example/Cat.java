package org.example;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component //Spring obj instance automatically
public class Cat {

    /*
    1....first way by using bean
     */
    // @Value("Bo Ni") private String catName;
    // private String catName = "Bo Ni"; // initialization variable
    private String catName;

    public Cat(@Value("Bo Wah") String catName) {
        this.catName = catName;
        System.out.println(catName + " is Constructor ==> First See");
    }

    @Autowired
    public void setCatName(@Value("Bo Kyr") String catName) {
        this.catName = catName;
        System.out.println(catName + " is setter or injection ===> Second See");

    }

    @PostConstruct
    public void init() {
        this.catName = "Bo Tote";
        System.out.println(catName + " is post construct ==> Third See");
    }

    public String getCatName() {
        return catName;
    }

    /*
    public void setCatName(String catName) {
        this.catName = catName;
    } //setter is not working in @Component , it's only for bean (who has full control over object creation)
     */


}
