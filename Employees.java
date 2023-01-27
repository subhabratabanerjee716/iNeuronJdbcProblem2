package empsrc;

public class Employees {

	String name;
	String address;
	String gender;
	String DOB;
	String DOJ;
	String DOM;
	public Employees(String name, String address, String gender, String dOB, String dOJ, String dOM) {
		
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.DOB = dOB;
		this.DOJ = dOJ;
		this.DOM = dOM;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getDOJ() {
		return DOJ;
	}
	public void setDOJ(String dOJ) {
		DOJ = dOJ;
	}
	public String getDOM() {
		return DOM;
	}
	public void setDOM(String dOM) {
		DOM = dOM;
	}
	
	
	
}
