package chapter6.demo2;

import chapter6.demo2.Comment;
import chapter6.demo2.CommentService;
import chapter6.demo2.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var service = c.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setText("Demo Comment");
        comment.setAuthor("Natasha");

        service.publishComment(comment);
    }
}
