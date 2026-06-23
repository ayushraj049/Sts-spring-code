package in.scalive.beans;

public class Student {

private String name;
private int roll;
private Address addr;

public Student(String name, int roll, Address addr) {
	super();
	this.name = name;
	this.roll = roll;
	this.addr = addr;
	System.out.println("student bean created  using int-str-Address const");
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
	System.out.println("setter called for name...");
}
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public Address getAddr() {
	return addr;
}
public void setAddr(Address addr) {
	this.addr = addr;
}

}
