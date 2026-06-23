package in.scalive.beans;

public class Student {

private int rollno;
private String name;

public Student(int rollno,String name) {
System.out.println("bean initilized using int-str constructor");
	this.rollno = rollno;
	this.name=name;
}

public Student(String fname,String lname) {
System.out.println("bean initilized using str-str constructor");
	this.rollno = 0;
	this.name=fname+" "+lname;
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
