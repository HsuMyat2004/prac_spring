package chapter5.prototype_demo2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    // singleton beans are immutable

    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var s1 = c.getBean(CommentService.class);
        var s2 = c.getBean(UserService.class);

        boolean b = s1.getCommentRepository() == s2.getCommentRepository();
        System.out.println(b);


    }
}
