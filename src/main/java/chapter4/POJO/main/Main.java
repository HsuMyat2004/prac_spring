package chapter4.POJO.main;

import chapter4.POJO.proxies.EmailCommentNotificationProxy;
import chapter4.POJO.respositories.DBCommentRepository;
import chapter4.POJO.services.CommentService;

public class Main {
    public static void main (String[] args) {

        // firstly, create the instance for the dependencies
        var commentRepository = new DBCommentRepository();
        var commentNotificationProxy = new EmailCommentNotificationProxy();

        // second, create the instance of the service clas and providing the dependencies
        var commentService = new CommentService(commentRepository, commentNotificationProxy);

        // create an instance of comment send as a parameter to the publish comment use case
        var comment = new Comment();

        comment.setText("Hello, Hsu Myat");
        comment.setAuthor("Hsu Myat Htike");

        //Calls the publish comment use case
        commentService.publishComment(comment);

    }
}
