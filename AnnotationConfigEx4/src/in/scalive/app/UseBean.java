package in.scalive.app;
import in.scalive.demobean.Car;

import org.springframework.beans.factory.xml.XmlBeanFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import in.scalive.samplebean.Car;
import in.scalive.samplebean.Student;

import java.awt.CardLayout;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.core.io.ClassPathResource;
public class UseBean {
public static void main(String args[]){
	
	
	
	
	ApplicationContext container = new ClassPathXmlApplicationContext("/in/scalive/resources/binconf.xml");
	Student s=(Student) container.getBean("student");
	Car c=(Car) container.getBean("car");
	s.display();
	c.show();
	

	
}
}
