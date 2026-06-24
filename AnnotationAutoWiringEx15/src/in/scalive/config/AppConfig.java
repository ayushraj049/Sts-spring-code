package in.scalive.config;

import java.awt.CardLayout;
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import in.scalive.beans.Car;
import in.scalive.beans.Person;

@Configuration
@ComponentScan(basePackages = "in.scalive.beans")
public class AppConfig {
@Bean

public Car car() {
	Car c=new Car("Audi");
	return c;
	
}
@Bean
public Person person() {
Person p=new Person(car());
	return p;
	
}

}
