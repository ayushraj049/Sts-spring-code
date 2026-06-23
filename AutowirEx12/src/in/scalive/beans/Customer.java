package in.scalive.beans;

import com.sun.org.apache.xml.internal.security.keys.keyresolver.implementations.PrivateKeyResolver;

public class Customer {
private String name;
private Account acc;
public void setName(String name) {
	this.name = name;
}
public void setAcc(Account acc) {
	this.acc = acc;
}
public void display() {
	System.out.println("customer name:"+name);
	System.out.println("Account id:"+acc.getAccid());
	System.out.println("Balance:"+acc.getBal());
	
}
}
