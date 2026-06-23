package in.scalive.app;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;

import in.scalive.beans.Student;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.core.io.ClassPathResource;
public class UseStudent {
public static void main(String args[]){
	
	Resource res=new ClassPathResource("/in/scalive/resources/binconf.xml");
	BeanFactory container=new XmlBeanFactory(res);
	Student s=(Student)container.getBean("stObj");
	System.out.println("Name:"+s.getName());
	System.out.println("roll no is:"+s.getRollno());
	
}
}
