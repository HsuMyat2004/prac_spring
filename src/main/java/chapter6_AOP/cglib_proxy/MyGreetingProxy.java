package chapter6_AOP.cglib_proxy;

public class MyGreetingProxy extends MyGreeting {
    public String sayHello(String name) {
        return super.sayHello(name)+ "Hello World Java Programmer";
    }
}
