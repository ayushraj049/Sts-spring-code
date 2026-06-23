package in.scalive.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component 
@Scope ("singleton")
public class Car {
	public Car() {
		System.out.println("car constructor called");
	}
	public void show() {
		System.out.println("I m a car bean");
	}

}
