package in.scalive.samplebean;

import org.springframework.stereotype.Component;

@Component
public class Student {
	public Student() {
		System.out.println("student constructor called");
	}
	public void display() {
		System.out.println("i m student bean");
	}
}
	
	
