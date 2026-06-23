package in.scalive.app;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import in.scalive.beans.Student;

import java.awt.CardLayout;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.core.io.ClassPathResource;
public class UseBean {
public static void main(String args[]){
	
	
	
	
	AnnotationConfigApplicationContext container=new AnnotationConfigApplicationContext();
	container.register(in.scalive.beans.Student.class);
	container.register(in.scalive.beans.Car.class);
	container.refresh();
	Student s=(Student)container.getBean("student");
	s.display();
	System.out.println("hello");
	
	
	

	
}
}
