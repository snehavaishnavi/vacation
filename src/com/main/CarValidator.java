package com.main;

import java.util.Date;

public class CarValidator {
	public boolean validatePickUpDate(Date pickUpDate,RoundTrip roundtrip ){
		int a=roundtrip.outBoundTrip.size();
		if(pickUpDate.after(roundtrip.outBoundTrip.get(a-1).getDestReachDate())){
			return true;
		}
		return false;
	}
	public boolean validateDropOffDate(Date dropOffDate,RoundTrip roundtrip){
		int b=roundtrip.inBoundTrip.size();
		if(dropOffDate.before(roundtrip.inBoundTrip.get(0).getDestDepartDate())){
			return true;
		}
		return false;
	}
	public boolean validatePickUpLoc(String pickUpLoc, RoundTrip roundtrip){
		int a=roundtrip.outBoundTrip.size();
		if(pickUpLoc.equals(roundtrip.outBoundTrip.get(a-1).getDestination())){
			return true;
		}
		return false;
	}
	public boolean validateDropOffLoc(String dropOffLoc, RoundTrip roundtrip){
		int a=roundtrip.inBoundTrip.size();
		if(dropOffLoc.equals(roundtrip.inBoundTrip.get(0).getOrigin())){
			return true;
		}
		return false;
	}
	public boolean validateCarRentalCity(String carCity,RoundTrip roundtrip){
		int a=roundtrip.outBoundTrip.size();
		if(carCity.equals(roundtrip.outBoundTrip.get(a-1).getDestination())){
			return true;
		}
		return false;
	}
}
