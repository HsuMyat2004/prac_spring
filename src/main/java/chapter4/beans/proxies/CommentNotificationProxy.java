package chapter4.beans.proxies;

import chapter4.beans.main.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
