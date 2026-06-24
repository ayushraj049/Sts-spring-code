package in.scalive.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.scalive.beans.Student;

public class App {
    public static void main(String[] args) {

        ApplicationContext container =
                new ClassPathXmlApplicationContext("in/scalive/resources/beanconfig.xml");

        Student s = container.getBean(Student.class);
        s.display();
    }
}