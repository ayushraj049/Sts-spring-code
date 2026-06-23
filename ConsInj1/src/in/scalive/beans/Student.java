package in.scalive.beans;

public class Student {

private String name;
public Student(String name) {
	this.name=name;
	System.out.println("student bean initilized using str constructor");	
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
	System.out.println("setter called for name...");
}
}
