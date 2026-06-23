package in.scalive.beans;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Student {
	public Student() {
		System.out.println("student constructor called");
	}
	public void display() {
		System.out.println("i m student bean");
	}
}
	
	
