package in.scalive.beans;



public class Programmer {

private String name;

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




}


