package in.scalive.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
@Value("${student.roll}")
	private int roll;
@Value("${student.name}")
	private String name;

		public Student(){
		
	
		System.out.println("constructor called");
		
	}
		
	
	

	


	public void display() {
		System.out.println("name is:"+name);
		System.out.println("roll is:"+roll);
	}
}
	
	
