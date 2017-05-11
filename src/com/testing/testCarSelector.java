package com.testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import com.main.Car;
import com.main.CarSelector;
import com.main.Hotel;


public class testCarSelector {

	@InjectMocks
	CarSelector carSelector;
	Car car;
	
	Hotel hotel;
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(CarSelector.class);
		
	}
	@Test
	public void testhotelSelector() {
		car=new Car();
		carSelector=new CarSelector();
		car=carSelector.carSelector();
		assertTrue(car!=null);
		
	}

}
