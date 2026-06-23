package in.scalive.app;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import in.scalive.beans.Student;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.core.io.ClassPathResource;
public class UseStudent {
public static void main(String args[]){
	
ApplicationContext  container=new ClassPathXmlApplicationContext("/in/scalive/resources/binconf.xml");
System.out.println("container started..");
	Student s1=(Student)container.getBean("stObj");
	Student s2=(Student)container.getBean("stObj");
	System.out.println("s1 value");
	System.out.println("=========================");
	System.out.println("name:"+s1.getName());
	System.out.println("rollno:"+s1.getRollno());
	
	System.out.println("s2 value");
	System.out.println("=========================");
	System.out.println("name:"+s2.getName());
	System.out.println("rollno:"+s2.getRollno());
	s1.setRollno(45);
	s2.setName("ayush@mishra");
	
	
	System.out.println("after changing.......");
	System.out.println("s1 value");
	System.out.println("=========================");
	System.out.println("name:"+s1.getName());
	System.out.println("rollno:"+s1.getRollno());
	
	System.out.println("s2 value");
	System.out.println("=========================");
	System.out.println("name:"+s2.getName());
	System.out.println("rollno:"+s2.getRollno());
	
	
	
	
	
	
}
}
