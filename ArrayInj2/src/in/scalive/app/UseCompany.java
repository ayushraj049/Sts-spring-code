package in.scalive.app;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.scalive.beans.Company;
import in.scalive.beans.Employee;
import in.scalive.beans.Student;



public class UseCompany {
public static void main(String args[]){
	ApplicationContext container =new ClassPathXmlApplicationContext("/in/scalive/resources/binconf.xml");
	Company c=container.getBean(Company.class);
	System.out.println("name of the company:"+c.getCompName());
	Employee [] emp=c.getWorkers();
	System.out.println("total emp working:"+emp.length);
	for(Employee e:emp) {
		System.out.println("emp name:"+e.getEmpName());
		System.out.println("emp :"+e.getEmpId());
	}
	
	
	
	
	

	
	
	
}
}
