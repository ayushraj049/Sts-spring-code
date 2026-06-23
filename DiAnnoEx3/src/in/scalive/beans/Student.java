package in.scalive.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	

	private int roll;

	private String name;
	public Student() {
		System.out.println("student constructor called");
	}
		public void setData(@Value("39") int roll,@Value("deepak") String name){
		this.name=name;
		this.roll=roll;
		
	}
		
	
	

	


	public void display() {
		System.out.println("name is:"+name);
		System.out.println("roll is"+roll);
	}
}
	
	
