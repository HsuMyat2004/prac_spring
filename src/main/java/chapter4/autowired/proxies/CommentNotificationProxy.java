package chapter4.autowired.proxies;

import chapter4.autowired.main.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
