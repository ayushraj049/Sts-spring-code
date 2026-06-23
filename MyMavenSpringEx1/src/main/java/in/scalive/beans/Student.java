package in.scalive.beans;

import java.awt.peer.SystemTrayPeer;

public class Student {
private int roll;
private String name;
public Student() {
	System.out.println("student bean crerated");
	
}
public void setRoll(int roll) {
	this.roll = roll;
}
public void setName(String name) {
	this.name = name;
}
public void display() {
	System.err.println("roll:"+roll);
	System.err.println("name:"+name);
}


}
