  package in.scalive.beans;

public class Address {
	private int houseNo;
	private String city;
	public  Address() {
		System.out.println("address object  created");
	}
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		System.out.println("setter called for  Address houseno");
		this.houseNo = houseNo;
	}
	public String getCity() {
		return city;
		
	}
	public void setCity(String city) {
		System.out.println("setter called for Addres city...");
		this.city = city;
	}
	

}
