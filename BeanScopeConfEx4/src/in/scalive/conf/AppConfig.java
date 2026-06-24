package in.scalive.conf;


import java.awt.CardLayout;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import in.scalive.beans.Car;
import in.scalive.beans.Student;

@Configuration

public class AppConfig {
@Bean
@Scope (value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public Student student() {
	Student s=new Student();
	return s;
}



@Bean
@Scope (value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public Car car() {
	Car c=new Car();
	return c;
}
}
