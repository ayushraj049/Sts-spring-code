package in.scalive.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Car implements InitializingBean,DisposableBean {
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
	@Override
	public void destroy() throws Exception {
		System.out.println("car stopped..");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("car started...");
		
	}
}
	
	
