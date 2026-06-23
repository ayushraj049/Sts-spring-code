package in.scalive.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("39")

	private int roll;

	private String name;
	public Student() {
		System.out.println("student constructor called");
	}
	
	@Value("39")
	public void setRoll(int roll) {
		this.roll = roll;
		System.out.println("setter called for roll no");
	}

	@Value("sumit")	
	public void setName(String name) {
		this.name = name;
		System.out.println("setter called for roll name");
	}


	public void display() {
		System.out.println("name is:"+name);
		System.out.println("roll is"+roll);
	}
}
	
	
