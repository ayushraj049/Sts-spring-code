package in.scalive;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.scalive.model.Student;
import in.scalive.services.StudentService;

@SpringBootApplication
public class SpringJdbcEx5Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container =SpringApplication.run(SpringJdbcEx5Application.class, args);
		StudentService serv = container.getBean(StudentService.class);
		Scanner kb=new Scanner(System.in);
		String choice="";
//		do {
//		System.out.println("enter roll");
//		int r=kb.nextInt();
//		System.out.println("Enter name");
//		String  str=kb.next();
//		System.out.println("enter perr");
//		double p=kb.nextDouble();
//		Student s =new Student();
//		
//
//		s.setRoll(r);
//		s.setName(str);
//		s.setPer(p);
//		serv.addStudent(s);
//		System.out.println("any more");
//		choice=kb.next();
//		}while(choice.equalsIgnoreCase("yes")) ;
//			
		System.out.println("total record presented:"+serv.getCount());
List <Student>studentList=serv.getAllStudents();
		System.out.println("here are the details");
		for(Student s:studentList) {
			System.out.println(s);
		}
	}

}
