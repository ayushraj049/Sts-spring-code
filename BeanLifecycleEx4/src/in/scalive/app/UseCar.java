package in.scalive.app;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import in.scalive.beans.Car;

import java.awt.CardLayout;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.core.io.ClassPathResource;
public class UseCar {
public static void main(String args[]){
	
	
	
	


	        ClassPathXmlApplicationContext container =
	                new ClassPathXmlApplicationContext("/in/scalive/resources/binconf.xml");

	        container.registerShutdownHook();

	        System.out.println("container started");

	        Car car = container.getBean(Car.class);

	        car.drive();
	    }
	
	
	
	

	
}

