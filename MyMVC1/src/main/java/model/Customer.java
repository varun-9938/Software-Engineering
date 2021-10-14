package model;

public class Customer {
private String custName;
private String gender;

private Address address;



public Customer() {
	super();
}


public Customer(String custName, String gender, Address address) {
	super();
	this.custName = custName;
	this.gender = gender;
	this.address = address;
}







public String getCustName() {
	return custName;
}



public void setCustName(String custName) {
	this.custName = custName;
}



public String getGender() {
	return gender;
}



public void setGender(String gender) {
	this.gender = gender;
}



public Address getAddress() {
	return address;
}



public void setAddress(Address address) {
	this.address = address;
}

	
	

}
