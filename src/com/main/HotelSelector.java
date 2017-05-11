package com.main;

import java.util.Date;

public class HotelSelector {
Date checkInDate;
Date checkOutDate;
String city;
int rooms;
int adults;
int children;
Hotel hotel=new Hotel();
HotelValidator valid=new HotelValidator();


public Date getCheckInDate() {
	return checkInDate;
}


public void setCheckInDate(Date checkInDate) {
	this.checkInDate = checkInDate;
}


public Date getCheckOutDate() {
	return checkOutDate;
}


public void setCheckOutDate(Date checkOutDate) {
	this.checkOutDate = checkOutDate;
}


public String getCity() {
	return city;
}


public void setCity(String city) {
	this.city = city;
}


public int getRooms() {
	return rooms;
}


public void setRooms(int rooms) {
	this.rooms = rooms;
}


public int getAdults() {
	return adults;
}


public void setAdults(int adults) {
	this.adults = adults;
}


public int getChildren() {
	return children;
}


public void setChildren(int children) {
	this.children = children;
}


public Hotel hotelSelector(){
	hotel.setCheckInDate(checkInDate);
	hotel.setCheckOutDate(checkOutDate);
	hotel.setCity(city);
	hotel.setNoOfAdults(adults);
	hotel.setNoOfChildren(children);
	hotel.setNoOfRooms(rooms);
	hotel.setCost(150);
	return hotel;
}

}
