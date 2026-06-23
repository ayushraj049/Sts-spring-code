 package in.scalive.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.scalive.beans.Customer;
import in.scalive.beans.Student;

public class UseCustomer {

    public static void main(String args[]) {

        ApplicationContext container =new ClassPathXmlApplicationContext("/in/scalive/resources/binconf.xml");
                

        Customer c = container.getBean(Customer .class);
c.display(); 
 
    }
}