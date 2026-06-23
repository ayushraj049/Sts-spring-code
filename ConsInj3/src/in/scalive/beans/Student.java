package in.scalive.beans;

public class Student {

private int rollno;
private String name;

public Student(int rollno) {
System.out.println("bean initilized using int constructor");
	this.rollno = rollno;
}


public Student(String name) {
	System.out.println("bean initilized using   str sonstructor");
	this.name = name;
}


public int getRollno() {
	return rollno;
}

public void setRollno(int rollno) {
	this.rollno = rollno;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}



}
