package in.scalive.beans;

import org.springframework.stereotype.Component;

@Component("mathobj")
public class MyMath {
	public MyMath() {
		System.out.println("MyMath constuctor called");
	}
public int add(int a,int b){
	return a+b;
}
}
