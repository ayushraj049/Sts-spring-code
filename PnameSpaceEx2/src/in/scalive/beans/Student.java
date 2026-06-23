package in.scalive.beans;

public class Student {
private int rollno;
private String name;
private String gender;
private Address addr;

public Student() {
	System.out.println("student bean created");	
}

public void setRollno(int rollno) {
	this.rollno = rollno;
	System.out.println("setter called for roll no...");
}

public void setName(String name) {
	this.name = name;
	System.out.println("setter called for name...");
}

public void setGender(String gender) {
	this.gender = gender;
}




public void setAddr(Address addr) {
	this.addr = addr;
}

@Override
public String toString() {
	return "roll="+rollno+"\nName="+name+"\ngender="+gender+"\naddress="+addr;
}


}
