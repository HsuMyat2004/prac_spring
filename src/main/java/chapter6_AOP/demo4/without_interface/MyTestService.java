package chapter6_AOP.demo4.without_interface;
import org.springframework.stereotype.Service;

@Service("myCurrencyTest") //spring bean can't call directly the private method
public class MyTestService {
    public void test1(String s){
        System.out.println("Test 1 " + s);
    }

    protected void test2(String s){
        System.out.println("Test 2 " + s);
        test3(s); //self-invocation
    }

    void test3(String s){
        System.out.println("Test 3 " + s);
    }

    private void test4(String s){
        System.out.println("Private test4 method");
    }
}

