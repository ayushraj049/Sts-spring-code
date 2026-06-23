package in.scalive.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MySQLDataSource implements DataSource {

	
	@Override
	public String[] getEmails() {
		String []emails= {"sachin@gmail.com","afroj@yahoo.co.in","ankit@gmail.com"};
			
		return emails;
	}

}
