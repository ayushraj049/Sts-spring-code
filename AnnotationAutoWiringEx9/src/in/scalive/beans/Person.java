package in.scalive.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
private String name;

private Car car;


@Autowired(required = false)
public Person(Car car) {

	this.car = car;
	System.out.println("car const called bean created");
}



@Autowired(required = false)
public Person(@Value("rakesh")String name) {
	this.name=name;
System.out.println("string const called consr called ");	
}




@Autowired (required = false)
public Person( Car car,@Value("Rakesh") String name) {
	
	this.name = name;
	this.car = car;
	System.out.println("car string  cons called");
}
@Autowired (required = false)
public Person(@Value("Rakesh") String name ,Car car) {
	
	this.name = name;
	this.car = car;
	System.out.println("string car cons called");
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
