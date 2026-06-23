package in.scalive.app;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.scalive.beans.Car;
import in.scalive.beans.Student;
public class UseBean {
public static void main(String args[]){
	
	
	
	
	ApplicationContext container = new AnnotationConfigApplicationContext(in.scalive.conf.AppConfig.class);
	Student s=(Student) container.getBean("scholar");
	Car c=(Car) container.getBean("vehicle");
	s.display();
	c.show();
	

	
}
}
