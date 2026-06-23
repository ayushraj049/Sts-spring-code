package in.scalive.beans;

import org.springframework.stereotype.Component;

@Component
public class EmailService {
private DataSource ds;

public EmailService(DataSource ds) {
	
	this.ds = ds;
}
public void sendEmail() {
	System.out.println("sending email using "+ds.getClass().getName());
	String []emails=ds.getEmails();
	for(String email:emails) {
		System.out.println("sending mail to:"+email);
	}
}

}

