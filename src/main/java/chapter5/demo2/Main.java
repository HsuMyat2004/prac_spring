package chapter5.demo2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    // singleton beans are immutable

    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var s1 = c.getBean(CommentService.class);
        var s2 = c.getBean(UserService.class);

        boolean b = s1.getCommentRepository() == s2.getCommentRepository();
        System.out.println(b);

        /*
        When multiple threads access a singleton bean, they access the same instance. If these
threads try to change the instance simultaneously, they run into a race condition. The race condition
causes unexpected results or execution exceptions if the bean is not designed for concurrency.

         */
    }
}
