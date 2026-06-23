package in.scalive.beans;

public class Student {
private int rollno;
private String name;
private String gender;

public Student() {
	System.out.println("student bean created");	
}


public Student(int rollno, String name, String gender) {
	
	this.rollno = rollno;
	this.name = name;
	this.gender = gender;
	System.out.println("parametrized constructor of student called");
}


public int getRollno() {
	return rollno;
}

public String getName() {
	return name;
}

public String getGender() {
	return gender;
}



}
