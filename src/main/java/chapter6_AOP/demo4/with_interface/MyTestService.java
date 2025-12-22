package chapter6_AOP.demo4.with_interface;
import org.springframework.stereotype.Service;

@Service("myCurrencyTest") //spring bean can't call directly the private method
public class MyTestService implements MyTestServiceInterface{
//    protected void test2(String s){
//        System.out.println("Test 2 " + s);
//        test3(s); //self-invocation
//    }

    @Override
    public void test1(String s) {
        System.out.println("Test 1 " + s);
    }

    @Override
    public void test3(String s) {
        System.out.println("Test 3 " + s);
    }

    /*
    it's not inherited
     private modifier restricts visibility exclusively to the
     block of code where the method is defined. In an interface,
    this means the method is hidden from everything outside that interface, including implementing
    classes and sub-interfaces
     */
//    private void test4(String s){
//        System.out.println("Private test4 method");
//    }
}

