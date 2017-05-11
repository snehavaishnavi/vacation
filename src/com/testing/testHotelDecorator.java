package com.testing;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.main.BasePackage;
import com.main.Flight;
import com.main.Hotel;
import com.main.HotelDecorator;
import com.main.HotelSelector;
import com.main.RoundTrip;

public class testHotelDecorator {

	@InjectMocks
	HotelDecorator hotelDecorator;
	
	Flight flight,flightIn;
	ArrayList<Flight> inBound,outBound;
	
	RoundTrip roundtrip;
	BasePackage basepakage;
	Hotel hotel;
	@Mock
	HotelSelector hotelSelector;
	
	
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(HotelDecorator.class);
		
	}
	
	@Test 
	public void testDecorator(){
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
		
		flight=new Flight();
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
		
		hotelSelector=new HotelSelector();
		hotel=hotelSelector.hotelSelector();
		basepakage=new BasePackage(roundtrip);
		hotelDecorator=new HotelDecorator(hotel, basepakage);
		
		
	}
}
