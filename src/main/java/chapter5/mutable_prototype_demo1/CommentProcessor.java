package chapter5.mutable_prototype_demo1;

public class CommentProcessor {
    private Comment comment;
    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public Comment getComment() {
        return this.comment;
    }

    public void processComment(Comment comment) {
        // changing the comment attribute
    }

    public void validateComment(Comment comment) {
        // validating and changing the comment attribute
    }
}

