package chapter4.POJO.respositories;

import chapter4.POJO.main.Comment;

public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}
