package chapter3.paremeter_injection_more_than_one_bean;


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
