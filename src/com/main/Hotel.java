package com.main;

import java.util.Date;

public class Hotel {
Date checkInDate;
Date checkOutDate;
String city;
int noOfRooms;
int noOfAdults;
int noOfChildren;
float cost;

public float getCost() {
	return cost;
}
public void setCost(float cost) {
	this.cost = cost;
}
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
public int getNoOfRooms() {
	return noOfRooms;
}
public void setNoOfRooms(int noOfRooms) {
	this.noOfRooms = noOfRooms;
}
public int getNoOfAdults() {
	return noOfAdults;
}
public void setNoOfAdults(int noOfAdults) {
	this.noOfAdults = noOfAdults;
}
public int getNoOfChildren() {
	return noOfChildren;
}
public void setNoOfChildren(int noOfChildren) {
	this.noOfChildren = noOfChildren;
}


}
