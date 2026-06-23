package in.scalive.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.scalive.beans.Student;
public class UseBean {
public static void main(String args[]){
	
	
	
	
	ApplicationContext container = new AnnotationConfigApplicationContext(in.scalive.config.AppConfig.class);
	
	Student s1 = (Student) container.getBean("s1");
	s1.display();

	Student s2 = (Student) container.getBean("s2");
	s2.display();
	
	
	

	
}
}
 