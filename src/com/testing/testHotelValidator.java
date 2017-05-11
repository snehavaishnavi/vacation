package com.testing;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.main.Flight;
import com.main.FlightSelector;
import com.main.HotelValidator;
import com.main.RoundTrip;
@RunWith(MockitoJUnitRunner.class)
public class testHotelValidator {

	@InjectMocks
	HotelValidator hotelValidator;
	
	RoundTrip roundtrip;
	
	Flight flight,flightIn;
	ArrayList<Flight> inBound,outBound;

	
	
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(HotelValidator.class);
		
		flight = new Flight();
		flightIn = new Flight();
		
		roundtrip=new RoundTrip();
		Calendar c = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		c.setTime(new Date()); // Now use today date.
		c2.setTime(new Date()); // Now use today date.
		Date date=c.getTime();
		c.add(Calendar.DATE, 1); // Adding 1 day
		c2.add(Calendar.DATE, 5); // Adding 5 days
		Date d1=c.getTime();
		Date d2=c2.getTime();
		
		flight.setAdult(1);
		flight.setChild(0);
		flight.setDepartDate(d1);
		flight.setDestReachDate(d1);
		flight.setOrigin("charlotte");
		flight.setDestination("atlanta");
		flight.setCost(250);
		inBound=new ArrayList<>();
		inBound.add(flight);
		
		flightIn.setAdult(1);
		flightIn.setChild(0);
		flightIn.setDestDepartDate(d2);
		flightIn.setReturnDate(d2);
		flightIn.setOrigin("atlanta");
		flightIn.setDestination("charlotte");
		flightIn.setCost(260);
		outBound=new ArrayList<>();
		outBound.add(flightIn);
		
		roundtrip.setInBoundTrip(inBound);
		roundtrip.setOutBoundTrip(outBound);
		roundtrip.setCost(500);
		roundtrip.setDescription("roundtrip created");
		
	}
	
	
	@Test 
	public void testAdutls(){
		int adults=1;
		boolean validAdults=hotelValidator.validateAdults(adults);
		assertTrue(validAdults);
		
	}
	@Test
	public void testCity(){
		String city="atlanta";
		boolean validCity=hotelValidator.validateCity(city, roundtrip);
		assertTrue(validCity);
		
	}

}
