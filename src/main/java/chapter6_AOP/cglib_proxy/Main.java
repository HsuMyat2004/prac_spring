package chapter6_AOP.cglib_proxy;

public class Main {
    public static void main(String[] args) {
        MyGreeting greeting = new MyGreetingProxy();
        String s = greeting.sayHello("JDC class :: ");
        System.out.println(s);
    }
}
