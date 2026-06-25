package in.scalive;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.scalive.model.Student;
import in.scalive.services.StudentService;

@SpringBootApplication
public class SpringJdbcEx1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container =SpringApplication.run(SpringJdbcEx1Application.class, args);
		
		Scanner kb=new Scanner(System.in);
		System.out.println("enter roll");
		int r=kb.nextInt();
		System.out.println("Enter name");
		String  str=kb.next();
		System.out.println("enter perr");
		double p=kb.nextDouble();
		Student s = container.getBean(Student.class);
		StudentService serv = container.getBean(StudentService.class);

		s.setRoll(r);
		s.setName(str);
		s.setPer(p);

		serv.addStudent(s);
	}

}
