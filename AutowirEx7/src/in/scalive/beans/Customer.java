package in.scalive.beans;



public class Customer {
private String name;
private Account acc;


public Customer(Account myacc) {
	System.out.println("single param constructor called");
	this.acc=myacc;
}
public void setName(String name) {
	System.out.println("setter of customer for name is called");
	this.name = name;
}
public void setAcc(Account acc) {
	System.out.println("setter of customer for account is called");
	this.acc = acc;
}
public void display() {
	System.out.println("customer name:"+name);
	System.out.println("Account id:"+acc.getAccid());
	System.out.println("Balance:"+acc.getBal());
	
}
}
