package in.scalive.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
private String name="Nitin";

private Car car;
public Person() {
	System.out.println("person constructor callled");;
}
@Autowired
public void setCar(Car car) {
	this.car = car;
	System.out.println("setter called for car in personm class");
}

public void display() {

	System.out.println("person name is:"+name);
	System.out.println("persons cars is :"+car.getCarName());
}

}
