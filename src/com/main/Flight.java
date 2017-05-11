package com.main;
import java.util.Date;

public class Flight {
	Date departDate;
	Date destReachDate;
	Date destDepartDate;
	 Date returnDate;
	 String origin;
	 String destination;
	 int adult;
	 int child;
	 float cost;
	 
	 
	public Date getDestReachDate() {
		return destReachDate;
	}
	public void setDestReachDate(Date destReachDate) {
		this.destReachDate = destReachDate;
	}
	public Date getDestDepartDate() {
		return destDepartDate;
	}
	public void setDestDepartDate(Date destDepartDate) {
		this.destDepartDate = destDepartDate;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public Date getDepartDate() {
		return departDate;
	}
	public void setDepartDate(Date departDate) {
		this.departDate = departDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getAdult() {
		return adult;
	}
	public void setAdult(int adult) {
		this.adult = adult;
	}
	public int getChild() {
		return child;
	}
	public void setChild(int child) {
		this.child = child;
	}
	public float getCost() {
		return cost;
	}
	
	 
	public String getDescription(){
		return null;
	}
}
