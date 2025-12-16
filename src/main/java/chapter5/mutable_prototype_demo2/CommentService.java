package chapter5.mutable_prototype_demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    @Autowired
    private ApplicationContext context;

    public void sendComment(Comment c){
        CommentProcessor processor = context.getBean(CommentProcessor.class);
        /*
        A new CommentProcessor instance is always provided here.
         */
        processor.setComment(c);
        processor.processComment(c);
        processor.validateComment(c);

        c = processor.getComment();
    }
}
