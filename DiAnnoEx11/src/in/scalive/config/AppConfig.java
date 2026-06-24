package in.scalive.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import in.scalive.beans.Student;

@Configuration
@ComponentScan(basePackages = "in.scalive.beans")
//ye ha propery ko connect krne ke tarika config me 
@PropertySource("classpath:/in/scalive/resources/student.properties")
public class AppConfig {
	@Bean(name="s1")
	public Student student1() {
	    Student s1 = new Student(25, "Ravi");
	    return s1;
	}

	@Bean(name="s2")
	public Student student2() {
	    Student s2 = new Student(28, "Sumit");
	    return s2;
	}
}