package in.scalive.beans;



public class Programmer {

private String name;
private Computer comp;

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

public Computer getComp() {
	return comp;
}

public void setComp(Computer comp) {
	this.comp = comp;
}
public void writeCode() {
	boolean res=comp.start();
	if(res) {
		System.out.println("started coding...");
	}
	else {
		System.out.println("could not started coding");
	}
}








}


