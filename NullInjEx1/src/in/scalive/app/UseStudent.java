package in.scalive.app;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import in.scalive.beans.Student;

import java.awt.DisplayMode;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.core.io.ClassPathResource;
public class UseStudent {
public static void main(String args[]){
	
	ApplicationContext container =
		    new ClassPathXmlApplicationContext("/in/scalive/resources/binconf.xml");

		Student s1 = container.getBean("stObj1", Student.class);
		Student s2 = container.getBean("stObj2", Student.class);
		System.out.println("detils of first student ");
		s1.display();
		System.out.println("detils of second student ");
		s2.display();
	
}
}
