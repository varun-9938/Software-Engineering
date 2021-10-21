package com.thbs.model;
import java.util.*;
public class CRepository {
	List<Customer> clist;
	public CRepository() {
		clist = new ArrayList<Customer>();
		Customer b1 = new Customer();
		b1.setCname("varun");
		b1.setCid(100);
		b1.setCage(21);
		b1.setCcity("Bengaluru");
		
		Customer b2 = new Customer();
		b2.setCname("sos");
		b2.setCid(101);
		b2.setCage(21);
		b2.setCcity("AP");
		
		clist.add(b1);
		clist.add(b2);
		
		
		
	}
	public List<Customer> getAllCustomers(){
		return clist;
	}
	

}
