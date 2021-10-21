package com.thbs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	private String pname;
	private int pquality;
	private int uprice;
	public Product() {
		
	}
	public Product(int pid, String pname, int pquality, int uprice) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pquality = pquality;
		this.uprice = uprice;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPquality() {
		return pquality;
	}
	public void setPquality(int pquality) {
		this.pquality = pquality;
	}
	public int getUprice() {
		return uprice;
	}
	public void setUprice(int uprice) {
		this.uprice = uprice;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pquality=" + pquality + ", uprice=" + uprice + "]";
	}
	
	

}
