package com.testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import com.main.Hotel;
import com.main.HotelSelector;
import com.main.HotelValidator;

public class testHotelSelector {

	@InjectMocks
	HotelSelector hotelSelector;
	
	Hotel hotel;
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(HotelSelector.class);
		
	}
	@Test
	public void testhotelSelector() {
		hotel=new Hotel();
		hotelSelector=new HotelSelector();
		hotel=hotelSelector.hotelSelector();
		assertTrue(hotel!=null);
		
	}

}
