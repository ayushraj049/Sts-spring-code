package in.scalive.app;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import in.scalive.beans.Student;



public class UseStudent {
public static void main(String args[]){
	ApplicationContext container =new ClassPathXmlApplicationContext("/in/scalive/resources/binconf.xml");
	
	
	
	
	Student s=container.getBean(Student.class);
	System.out.println("Name:"+s.getName());
	System.out.println("roll no is:"+s.getRollno());
	System.out.println("performence:"+s.getPerformance());
	
	
	
	
	
}
}
