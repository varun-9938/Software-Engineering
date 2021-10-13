package pack1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("customer")
public class Customer {
	
	private String custid;
	private String custname;
	private Address address;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public Customer(Address address) {
		super();
		this.address = address;
	}

	public String getCustid() {
		return custid;
	}

	public void setCustid(String custid) {
		this.custid = custid;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", custname=" + custname + ", address=" + address + "]";
	}
	
	
	
	

}
