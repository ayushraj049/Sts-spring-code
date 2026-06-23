package in.scalive.app;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.scalive.beans.Car;
import in.scalive.beans.Student;
public class UseBean {
public static void main(String args[]){
	
	
	
	
	ApplicationContext container = new AnnotationConfigApplicationContext(in.scalive.conf.AppConfig.class);
	Student s1=(Student) container.getBean("student");
	Car c1=(Car) container.getBean("car");
	Student s2=(Student) container.getBean("student");
	Car c2=(Car) container.getBean("car");
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println(c1.hashCode());
	System.out.println(c2.hashCode());
	
	

	
}
}
