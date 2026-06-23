package in.scalive.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
private String name="Nitin";
@Autowired
private Car c;
public Person() {
	System.out.println("person constructor callled");;
}
public void display() {

	System.out.println("person name is:"+name);
	System.out.println("persons cars is :"+c.getCarName());
}

}
