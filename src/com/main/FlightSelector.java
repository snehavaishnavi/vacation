package com.main;
import java.util.Calendar;
import java.util.Date;

public class FlightSelector {
	Date departDate;
	Date returnDate;
	String origin;
	String destination;
	int adult;
	int child;
	Flight flight=new Flight();
	Flight flightIn=new Flight();
	RoundTrip tripDetails;
 
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

	public boolean validateDepart(Date departDate, Date currentDate){
		if(departDate.after(currentDate)){
			return true;
		}
		return false;
	}
	public boolean validateReturn(Date returnDate, Date currentDate, Date departDate){
		if(departDate.after(currentDate) && returnDate.after(departDate) && returnDate.after(currentDate)){
			return true;
		}
		return false;
	}
	public boolean validateOriginDestination(String origin, String destination){
		if(!origin.equals(destination)){
			return true;
		}
		return false;
	}

	public boolean validateAdult(int adult){
		if(adult>=1){
			return true;
		}
		return false;
	}


	public RoundTrip flightSelector(){
		Calendar c = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		c.setTime(new Date()); // Now use today date.
		c2.setTime(new Date()); // Now use today date.
		c.add(Calendar.DATE, 2); // Adding 1 day
		c2.add(Calendar.DATE, 3); // Adding 5 days
		Date d1=c.getTime();
		Date d2=c2.getTime();
		
		flight.setAdult(adult);
		flight.setChild(child);
		flight.setDepartDate(departDate);
		flight.setDestReachDate(d1);
		flight.setOrigin(origin);
		flight.setDestination(destination);
		flight.setCost(250);
		tripDetails=new RoundTrip();
		tripDetails.outBoundTrip.add(flight);
		
		flightIn.setAdult(adult);
		flightIn.setChild(child);
		flightIn.setDestDepartDate(d2);
		flightIn.setReturnDate(returnDate);
		flightIn.setOrigin(destination);
		flightIn.setDestination(origin);
		flightIn.setCost(260);
		
		tripDetails.inBoundTrip.add(flightIn);
		
		
		
		return tripDetails;
	}

}
