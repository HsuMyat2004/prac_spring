package chapter6.demo4;

import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {
    private Logger logger = Logger.getLogger(CommentService.class.getName());
    /*
    When declaring a logger object, you need to give it a name as a
parameter.
     */

    public String publishComment(Comment comment) {

        logger.info("Publishing comment " + comment.getText());
        return "SUCCESS";
    }
}
