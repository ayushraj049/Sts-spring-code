package in.scalive.app;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import in.scalive.beans.Person;
import in.scalive.beans.Student;
import in.scalive.config.AppConfig;

import java.awt.CardLayout;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.core.io.ClassPathResource;
public class UsePerson {
public static void main(String args[]){
	
	
	
	
	AnnotationConfigApplicationContext container=new AnnotationConfigApplicationContext(AppConfig.class);

	Person p=container.getBean(Person.class);
	p.display();
	
	
	

	
}
}
