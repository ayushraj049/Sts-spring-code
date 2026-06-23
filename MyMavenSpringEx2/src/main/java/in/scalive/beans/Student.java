package in.scalive.beans;

import java.awt.peer.SystemTrayPeer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Student {
private int roll;
private String name;
public Student() {
	System.out.println("student bean crerated");
	
}
@Value("101")
public void setRoll(int roll) {
	this.roll = roll;
}
@Value("nitin")
public void setName(String name) {
	this.name = name;
}
public void display() {
	System.err.println("roll:"+roll);
	System.err.println("name:"+name);
}


}
