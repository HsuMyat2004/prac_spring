package chapter6_AOP.demo4.with_interface;

public interface MyTestServiceInterface {
    public void test1(String s);
    // protected void test2(); //The protected modifier is not permitted for interface methods. It will result in a compile-time error
    void test3(String s);
    private void test4(String s){};
}

/*
Recommendation: For 2025 development, it remains standard practice to omit public in interfaces to keep code clean, but you must remember it is still effectively public

in a Java interface, omitting the access modifier (writing just void test3();) is the same as explicitly writing public.
However, this is a special rule that only applies to interfaces. In regular Java classes, omitting the modifier results in "package-private" access (visible only to classes in the same package), which is more restrictive than public.
 */