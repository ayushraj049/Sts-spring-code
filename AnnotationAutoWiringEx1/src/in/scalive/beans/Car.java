package in.scalive.beans;

import org.springframework.stereotype.Component;

@Component
public class Car {
private String carName="Audi";

public Car() {
	System.out.println("car constructor called");
}

public String getCarName() {
	return carName;
}



}
