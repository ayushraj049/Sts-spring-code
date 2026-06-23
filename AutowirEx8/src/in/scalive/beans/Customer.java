package in.scalive.beans;



public class Customer {
private String name;
private int age;
private Account acc;
private Address addr;



public Customer( String name,int age, Account acc,Address addr)  {
	System.out.println("4 param constructor called");
	this.name=name;
	this.age=age;
	this.acc=acc;
	this.addr=addr;
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
	System.out.println("houseno:"+addr.getHouseNo());
	System.out.println("city:"+addr.getCity());
	
}
}
