package in.scalive.app;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;

import in.scalive.beans.Emp;
import in.scalive.beans.Student;

import java.util.EmptyStackException;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.core.io.ClassPathResource;
public class UseEmp {
public static void main(String args[]){
	
	Resource res=new ClassPathResource("/in/scalive/resources/binconf.xml");
	BeanFactory container=new XmlBeanFactory(res);
	Emp emp=container.getBean(Emp.class);
	emp.show();
	
}
}
