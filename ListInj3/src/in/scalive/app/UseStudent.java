package in.scalive.app;


import java.util.ArrayList;
import java.util.LinkedList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import in.scalive.beans.Student;



public class UseStudent {
public static void main(String args[]){
	ApplicationContext container =new ClassPathXmlApplicationContext("/in/scalive/resources/binconf.xml");
	
	
	
	
	Student s=container.getBean(Student.class);
	System.out.println("Name:"+s.getName());
	System.out.println("roll no is:"+s.getRollno());
	ArrayList<String>subjList= s.getSubjects();
	LinkedList<Integer>markList= s.getMarks();
	System.out.println("subjects:"+s.getSubjects());
	System.out.println("marks:"+s.getMarks());
	
	
	
	
}
}
