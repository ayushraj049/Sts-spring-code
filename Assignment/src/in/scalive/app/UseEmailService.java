package in.scalive.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.scalive.beans.EmailService;
import in.scalive.config.AppConfig;

public class UseEmailService {

    public static void main(String args[]) {

        ApplicationContext container =
                new AnnotationConfigApplicationContext(AppConfig.class);
EmailService e =container.getBean(EmailService.class);
e.sendEmail();  
    }
}