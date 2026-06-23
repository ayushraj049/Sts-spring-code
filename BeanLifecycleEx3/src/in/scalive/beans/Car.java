package in.scalive.beans;

public class Car {
	private String model;
	public Car() {
		System.out.println("car constructor called.....");
	}
	public void setModel(String model) {
		this.model=model;
		System.out.println("setter called for model....");
		
	}
	
	public void startCar() {
		System.out.println("car started...");
	}
	public void stopCar() {
		System.out.println("car stopped..");
	}
	public void drive() {
		System.out.println("car is getting driven...");
	}
}
	
	
