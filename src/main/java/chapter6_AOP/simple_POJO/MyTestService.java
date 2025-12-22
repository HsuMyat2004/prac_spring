package chapter6_AOP.simple_POJO;

public class MyTestService {
    public void test1(String s){
        System.out.println("Test 1 " + s);
    }

    protected void test2(String s){
        System.out.println("Test 2 " + s);
        test3(s); //self-invocation is not allowed in AOP
    }

    void test3(String s){
        System.out.println("Test 3 " + s);
    }

    private void test4(String s){
        System.out.println("Private test4 method :: " + s);
    }
}

