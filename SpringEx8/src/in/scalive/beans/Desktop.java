package in.scalive.beans;

public class Desktop implements Computer{

	public Desktop() {
System.out.println("Desktop object created");

	}

	@Override
	public boolean start() {
		// TODO Auto-generated method stub
		System.out.println("desktop started");
		return true;
	}
	
	

}
