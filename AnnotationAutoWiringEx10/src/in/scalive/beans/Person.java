package in.scalive.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
private String name="ashish";

private Car car;


@Autowired
public Person(Car car2) {

	this.car = car2;
	System.out.println("car const called bean created");
}









public void display() {

	System.out.println("person name is:"+name);
	if(car==null) {
		System.out.println("person has no car");
	}
	else {
	System.out.println("persons cars is :"+car.getCarName());
}
}

}
