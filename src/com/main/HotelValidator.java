package com.main;

import java.util.Date;

public class HotelValidator {
	public boolean validateCheckIndate(Date checkInDate,RoundTrip roundtrip ){
		int a=roundtrip.outBoundTrip.size();
		if(checkInDate.after(roundtrip.outBoundTrip.get(a-1).getDestReachDate())){
			return true;
		}
		return false;
	}
	public boolean validateCheckOutDate(Date checkOutDate,RoundTrip roundtrip){
		int b=roundtrip.inBoundTrip.size();
		if(checkOutDate.before(roundtrip.inBoundTrip.get(0).getDestDepartDate())){
			return true;
		}
		return false;
	}
	public boolean validateRooms(int rooms){
		if(rooms>=1){
			return true;
		}
		return false;
	}
	public boolean validateAdults(int adult){
		if(adult>=1){
			return true;
		}
		return false;
	}
	public boolean validateCity(String city,RoundTrip roundtrip){
		int a=roundtrip.outBoundTrip.size();
		if(city.equals(roundtrip.outBoundTrip.get(a-1).getDestination())){
			return true;
		}
		return false;
	}
}
