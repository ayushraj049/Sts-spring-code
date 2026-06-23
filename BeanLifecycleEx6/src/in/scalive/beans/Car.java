package in.scalive.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Car  {
	private String model;
	public Car() {
		System.out.println("car constructor called.....");
	}
	public void setModel(String model) {
		this.model=model;
		System.out.println("setter called for model....");
		
	}
	

	public void drive() {
		System.out.println("car is getting driven...");
	}
@PostConstruct
	public void startCar() {
		System.out.println("car started.....");
	}
	@PreDestroy
	public void stopCar() {
		System.out.println("car stopped.....");
	}
	
}
	
	
