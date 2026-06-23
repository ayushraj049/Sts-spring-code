package in.scalive.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
private String name="Nitin";

private Car car;


@Autowired
public Person(Car car) {

	this.car = car;
	System.out.println("person bean created");
}



public void display() {

	System.out.println("person name is:"+name);
	System.out.println("persons cars is :"+car.getCarName());
}

}
