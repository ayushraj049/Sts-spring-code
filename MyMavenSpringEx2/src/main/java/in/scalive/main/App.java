package in.scalive.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.scalive.beans.Student;
import in.scalive.config.AppConfig;

public class App {
    public static void main(String[] args) {

        ApplicationContext container =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Student s = container.getBean(Student.class);
        s.display();
    }
}