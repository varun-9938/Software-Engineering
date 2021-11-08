package com.tbhs.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Train 
{
	@Id
	private int trainno;
	private String trainname;
	private String source;
	private String destination;
	private double ticketprice;
	
	public Train() 
	{
		// TODO Auto-generated constructor stub
	}

	public Train(int trainno, String trainname, String source, String destination, double ticketprice) 
	{
		super();
		this.trainno = trainno;
		this.trainname = trainname;
		this.source = source;
		this.destination = destination;
		this.ticketprice = ticketprice;
	}

	public int getTrainno() {
		return trainno;
	}

	public void setTrainno(int trainno) {
		this.trainno = trainno;
	}

	public String getTrainname() {
		return trainname;
	}

	public void setTrainname(String trainname) {
		this.trainname = trainname;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public double getTicketprice() {
		return ticketprice;
	}

	public void setTicketprice(double ticketprice) {
		this.ticketprice = ticketprice;
	}
}
