package chapter3.paremeter_injection_more_than_one_bean;

public class Person {
    private String name;

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
