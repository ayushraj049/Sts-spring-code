package in.scalive.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
private String name="ashish";

private Car car;














public Person(@Qualifier("car2") Car car ) {
	
	this.car = car;
	System.out.println("person craeted ....");
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
