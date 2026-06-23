package in.scalive.app;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import in.scalive.beans.Student;



public class UseStudent {
public static void main(String args[]){
	ApplicationContext container =new ClassPathXmlApplicationContext("/in/scalive/resources/binconf.xml");
	System.out.println("container started");
	System.out.println("First Bean");
	System.out.println("============================");
	Student s1=(Student)container.getBean("stObj1");
	System.out.println("Name:"+s1.getName());
	System.out.println("roll no is:"+s1.getRollno());
	  
	System.out.println();
	
	
	
	System.out.println("Second  Bean");
	System.out.println("============================");
	Student s2=(Student)container.getBean("stObj2");
	System.out.println("Name:"+s2.getName());
	System.out.println("roll no is:"+s2.getRollno());
	
}
}
