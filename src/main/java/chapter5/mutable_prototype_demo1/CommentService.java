package chapter5.mutable_prototype_demo1;

import org.springframework.stereotype.Service;

@Service
public class CommentService {
    public void sendComment(Comment c) {
        CommentProcessor processor = new CommentProcessor();

        processor.setComment(c);
        processor.processComment(c);
        processor.validateComment(c);

        c = processor.getComment();
    }
}
