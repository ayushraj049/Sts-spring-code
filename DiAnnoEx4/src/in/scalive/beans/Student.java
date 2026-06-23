package in.scalive.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	

	private int roll;

	private String name;

		public Student(@Value("25") int roll,@Value("deepak") String name){
			this.roll=roll;
			this.name=name;
	
		System.out.println("constructor called");
		
	}
		
	
	

	


	public void display() {
		System.out.println("name is:"+name);
		System.out.println("roll is:"+roll);
	}
}
	
	
