package in.scalive.beans;

public class Student {
private int rollno;
private String name;
private String gender;

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
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}

}
