package chapter4.qualifier_usage.main;

import chapter4.qualifier_usage.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main (String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var comment = new Comment();

        comment.setText("Hello, Hsu Myat");
        comment.setAuthor("Hsu Myat Htike");

        var commentService = context.getBean(CommentService.class);

        //Calls the publish comment use case
        commentService.publishComment(comment);

    }
}
