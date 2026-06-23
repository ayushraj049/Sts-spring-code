package in.scalive.beans;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Calculator {
	@Value("#{mathobj.add(10,20)}")
public int result;
	@Value("#{new java.util.Date()}")
	private Date CurrDate;
	@Value("#{new java.util.Random().nextInt(100)}")
	private int randomNum;
	public Calculator() {
		System.out.println("calaulator constructor is called");
	}

public void showResult() {
	System.out.println("result:"+result);
	System.out.println("currDate is:"+CurrDate);
	System.out.println("randomnum:"+randomNum);
	
}
}


