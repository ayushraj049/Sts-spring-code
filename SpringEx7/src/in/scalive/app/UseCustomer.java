package in.scalive.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.scalive.beans.Customer;

public class UseCustomer {
public static void main(String[] args) {
	ApplicationContext container =new ClassPathXmlApplicationContext("/in/scalive/resources/binconf.xml");
	Customer c1=container.getBean("cst1",Customer.class);
	System.out.println("customers name:"+c1.getName());
	System.out.println("customers account id:"+c1.getAcc().getAccId());
	System.out.println("customers balance :"+c1.getAcc().getBalance());
	
	
	
	
	Customer c2=container.getBean("cst2",Customer.class);
	System.out.println("customers name:"+c2.getName());
	System.out.println("customers account id:"+c2.getAcc().getAccId());
	System.out.println("customers balance :"+c2.getAcc().getBalance());
	
	
}
}
