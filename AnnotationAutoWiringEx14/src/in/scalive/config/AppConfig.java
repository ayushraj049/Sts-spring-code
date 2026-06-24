package in.scalive.config;

import java.awt.CardLayout;
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import in.scalive.beans.Car;

@Configuration
@ComponentScan(basePackages = "in.scalive.beans")
public class AppConfig {
@Bean
@Primary
public Car car1() {
	Car c=new Car("Audi");
	return c;
	
}
@Bean
public Car car2() {
	Car c=new Car("mercdes");
	return c;
	
}

}
