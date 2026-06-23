package in.scalive.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
private String name="Nitin";

private Car car;



public Person(Car car) {

	this.car = car;
	System.out.println("person bean created");
}




public Person() {
System.out.println("non parametrized consr called ");	
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
