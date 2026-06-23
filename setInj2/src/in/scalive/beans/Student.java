package in.scalive.beans;

import java.util.List;
import java.util.Set;



public class Student {
private int rollno;
private String name;
private Set<String>emails;

public Student() {
	System.out.println("student bean created");	
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
	System.out.println("setter called for roll no...");
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
	System.out.println("setter called for name...");
	
}
public Set<String> getEmails() {
	return emails;
}
public void setEmails(Set<String> emails) {
    System.out.println("injecting :"+emails.getClass());
    this.emails = emails;
}



}
