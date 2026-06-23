package in.scalive.beans;

import org.springframework.stereotype.Component;


public class Car {
private String carName="Audi";

public Car(String name) {
	carName=name;
	System.out.println("car constructor called");
}

public String getCarName() {
	return carName;
}



}
