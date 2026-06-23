package in.scalive.beans;

import java.util.Date;

public class Student {
private int rollno;
private String name;
private Date dobDate;


public Student(int rollno, String name, Date dobDate) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.dobDate = dobDate;
}
public void display() {
	System.out.println("roll="+rollno);
	System.out.println("name="+name);
	System.out.println("dob="+dobDate);
	
}
}
