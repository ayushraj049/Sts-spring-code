package in.scalive.demobeans;

import org.springframework.stereotype.Component;

@Component 
public class Car {
	public Car() {
		System.out.println("car constructor called");
	}
	public void show() {
		System.out.println("I m a car bean");
	}

}
