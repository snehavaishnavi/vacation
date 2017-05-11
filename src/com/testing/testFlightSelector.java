package com.testing;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.main.Flight;
import com.main.FlightSelector;
import com.main.RoundTrip;
@RunWith(MockitoJUnitRunner.class)
public class testFlightSelector {

	@InjectMocks
	FlightSelector flightSelector;
	@Mock
	RoundTrip roundtrip;
	@Mock
	Flight flight,flightIn;
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(FlightSelector.class);
		
	}
	
	@Test
	public void testValidateDepartDate() {
		Calendar c = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		c.setTime(new Date()); // Now use today date.
		c2.setTime(new Date()); // Now use today date.
		Date date=c.getTime();
		c.add(Calendar.DATE, 1); // Adding 1 day
		c2.add(Calendar.DATE, 5); // Adding 5 days
		Date d1=c.getTime();
		Date d2=c2.getTime();
		
		boolean validDepart=flightSelector.validateDepart(d1, date);
		assertTrue(validDepart);
		
	}
	@Test
	public void testValidateReturnDate(){
		Calendar c = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		c.setTime(new Date()); // Now use today date.
		c2.setTime(new Date()); // Now use today date.
		Date date=c.getTime();
		c.add(Calendar.DATE, 1); // Adding 1 day
		c2.add(Calendar.DATE, 5); // Adding 5 days
		Date d1=c.getTime();
		Date d2=c2.getTime();
		
		boolean validReturn=flightSelector.validateReturn(d2, date, d1);
		assertTrue(validReturn);
	}
	
	@Test
	public void testValidateOrgDest(){
		String origin="charlotte";
		String destination="chicago";
		boolean validOrgDest=flightSelector.validateOriginDestination(origin, destination);
		assertTrue(validOrgDest);
		
		destination="charlotte";
		boolean validorg=flightSelector.validateOriginDestination(origin, destination);
		assertFalse(validorg);
	}
	
	@Test
	public void testAdult(){
		int adults=1;
		boolean validadult=flightSelector.validateAdult(adults);
		assertTrue(validadult);
		
		int adult=0;
		boolean validadultfalse=flightSelector.validateAdult(adult);
		assertFalse(validadultfalse);
	}

	@Test
	public void testflightSelector(){	
		
		roundtrip=new RoundTrip();
	
		roundtrip=flightSelector.flightSelector();
		assertTrue(roundtrip!=null);
		
	}
}
