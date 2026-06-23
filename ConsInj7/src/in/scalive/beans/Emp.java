package in.scalive.beans;

public class Emp {
private String name;
private String desigation;
private float salary;
public Emp(String name, String desigation) {
	
	this.name = name;
	this.desigation = desigation;
	System.out.println("bean initialized using str-str constructor");
}


public Emp( float salary,String name) {
	
	
	
	this.salary=salary;
	this.name = name;
	
	System.out.println("bean initialized using float-str constructor");
}


public Emp(String desigation, float salary) {
	
	
	this.desigation = desigation;
	this.salary=salary;
	System.out.println("bean initialized using str-float constructor");
}


public void show() {
	System.out.println("name:"+name);
	System.out.println("desgi:"+desigation);
	System.out.println("salary:"+salary);
}


}
