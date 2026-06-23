package in.scalive.beans;
import java.util.List;

public class Company {
	private String compName;
	private List<Employee>  workers;
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	public List<Employee> getWorkers() {
		return workers;
	}
	public void setWorkers(List<Employee> workers) {
		this.workers = workers;
	}
	
	

}
