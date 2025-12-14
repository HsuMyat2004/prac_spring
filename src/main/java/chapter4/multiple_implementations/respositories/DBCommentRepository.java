package chapter4.multiple_implementations.respositories;

import chapter4.multiple_implementations.main.Comment;
import org.springframework.stereotype.Component;

@Component
public class DBCommentRepository implements CommentRepository
{

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}
