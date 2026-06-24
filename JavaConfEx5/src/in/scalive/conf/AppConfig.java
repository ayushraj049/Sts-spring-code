package in.scalive.conf;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.scalive.beans.Car;
import in.scalive.beans.Student;

@Configuration

public class AppConfig {
@Bean (name="scholar")
public Student student() {
	Student s=new Student();
	return s;
}

@Bean (name="vehicle")
public  Car car() {
	Car c=new Car();
	return c;
}
}
