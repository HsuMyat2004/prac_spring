package chapter4.multiple_implementations.services;


import chapter4.multiple_implementations.main.Comment;
import chapter4.multiple_implementations.proxies.CommentNotificationProxy;
import chapter4.multiple_implementations.respositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private CommentNotificationProxy commentNotificationProxy;


    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }

}
