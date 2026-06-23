package in.scalive.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.scalive.beans.Laptop;
import in.scalive.beans.Programmer;

public class UseProgrammer {
public static void main(String[] args) {
	ApplicationContext container =new ClassPathXmlApplicationContext("/in/scalive/resources/allconf.xml");
	Programmer p1=container.getBean(Programmer.class);
	Laptop lp=p1.getLp();
	System.out.println("==============");
	System.out.println("programmers name="+p1.getName());
	System.out.println("laptop brand="+lp.getBrand());
	p1.writeCode();
}
}
