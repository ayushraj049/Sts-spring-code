package in.scalive.app;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import in.scalive.beans.Address;
import in.scalive.beans.Student;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.core.io.ClassPathResource;
public class UseStudent {
public static void main(String args[]){
	

	ApplicationContext container= new ClassPathXmlApplicationContext("in/scalive/resources/binconf.xml");
	
	Student s=container.getBean(Student.class);
	System.out.println("Name:"+s.getName());
	System.out.println("roll :"+s.getRoll());
	Address addr=s.getAddr();
	System.out.println("adddrss:"+addr);
	System.out.println("house no:"+addr.getHouseNo());
	System.out.println("locality:"+addr.getLocality());
	System.out.println("city:"+addr.getCity());
	
	
	
	

	
}
}
