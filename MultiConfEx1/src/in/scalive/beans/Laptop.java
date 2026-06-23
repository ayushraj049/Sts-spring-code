package in.scalive.beans;

public class Laptop {
private String brand;

public Laptop() {
	
	System.out.println("laptop bean created");
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
	System.out.println("laptop bean beand intilized");
}
public boolean start() {
	System.out.println("laptop started.....");
	return true;  
}


}
