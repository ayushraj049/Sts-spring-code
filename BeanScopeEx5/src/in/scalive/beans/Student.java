package in.scalive.beans;

public class Student {
private int rollno;
private String name;
private Address addr;

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
public Address getAddr() {
	return addr;
}
public void setAddr(Address addr) {
	System.out.println("setter called for student address");
	this.addr = addr;
}

}
