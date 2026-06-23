package in.scalive.beans;



public class Programmer {

private String name;
private Laptop lp;

public Programmer() {
	
	System.out.println("programmer bean created");
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
	System.out.println("programmer bean initialized");
}

public Laptop getLp() {
	return lp;
}

public void setLp(Laptop lp) {
	this.lp = lp;
}
public void writeCode() {
	boolean res=lp.start();
	if(res==false) {
		System.out.println("could not write code laptop not started");
	}
	else {
		System.out.println("laptop started plz write code");
	}
}




}


