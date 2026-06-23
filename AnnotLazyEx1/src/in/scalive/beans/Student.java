package in.scalive.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Student {
	@Value("39")

	private int roll;
	@Value("sumit")	
	private String name;
	public Student() {
		System.out.println("student constructor called");
	}
	public void display() {
		System.out.println("name is:"+name);
		System.out.println("roll is"+roll);
	}
}
	
	
