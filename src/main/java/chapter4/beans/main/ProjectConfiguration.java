package chapter4.beans.main;

import chapter4.beans.proxies.CommentNotificationProxy;
import chapter4.beans.proxies.EmailCommentNotificationProxy;
import chapter4.beans.respositories.CommentRepository;
import chapter4.beans.respositories.DBCommentRepository;
import chapter4.beans.services.CommentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfiguration {
    @Bean
    public CommentRepository commentRepository() {
        return new DBCommentRepository();
    }
    @Bean
    public CommentNotificationProxy commentNotificationProxy() {
        return new EmailCommentNotificationProxy();
    }
    @Bean
    public CommentService commentService(
            CommentRepository commentRepository,
            CommentNotificationProxy commentNotificationProxy) {
        return new CommentService(commentRepository,
                commentNotificationProxy);
    }
}
