package in.scalive.beans;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;
import java.util.Arrays;

@Component
public class Student {
	

	private int roll;

	private String name;
	private String[] subjects;

		public Student(@Value("${student.roll}")int roll,@Value("${student.name}")String name,@Value("${student.subjects}")String[]subjects){
		this.roll=roll;
		this.name=name;
		this.subjects=subjects;
	
		System.out.println("constructor called");
		
	}
		
	
	

	


	public void display() {
		System.out.println("name is:"+name);
		System.out.println("roll is:"+roll);
		System.out.println("subjects:"+Arrays.toString(this.subjects));
	}
}
	
	
