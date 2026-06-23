package in.scalive.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.scalive.beans.Laptop;
import in.scalive.beans.Programmer;

public class UseProgrammer {
public static void main(String[] args) {
	ApplicationContext container =new ClassPathXmlApplicationContext("/in/scalive/resources/binconf.xml");
	Programmer p1=(Programmer)container.getBean("prObj1");
	Programmer p2=(Programmer)container.getBean("prObj2");
	System.out.println("==============");
	System.out.println("first programmers name="+p1.getName());
	p1.writeCode();
	System.out.println("==============");
	System.out.println("second programmers name="+p2.getName());
	p1.writeCode();
	
}
}
