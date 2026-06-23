package in.scalive.app;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import in.scalive.beans.Student;



public class UseStudent {
public static void main(String args[]){
	ApplicationContext container =new ClassPathXmlApplicationContext("/in/scalive/resources/binconf.xml");
	
	
	
	
	Student s1=(Student)container.getBean("stObj2");
	System.out.println(s1);
	
}
}
