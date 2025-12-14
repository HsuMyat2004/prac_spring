package chapter4.multiple_implementations.proxies;

import chapter4.multiple_implementations.main.Comment;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CommentPushNotificationProxy
        implements CommentNotificationProxy {


    @Override
    public void sendComment(Comment comment) {
        System.out.println(
                "Sending push notification for comment: "
                        + comment.getText());
    }
}