package com.main;

import java.util.Date;

public class Car {
String carCity;
String pickUpLoc;
String dropOffLoc;
Date pickUpDate;
Date dropOfDate;
float cost;

public float getCost() {
	return cost;
}
public void setCost(float cost) {
	this.cost = cost;
}
public String getCarCity() {
	return carCity;
}
public void setCarCity(String carCity) {
	this.carCity = carCity;
}
public String getPickUpLoc() {
	return pickUpLoc;
}
public void setPickUpLoc(String pickUpLoc) {
	this.pickUpLoc = pickUpLoc;
}
public String getDropOffLoc() {
	return dropOffLoc;
}
public void setDropOffLoc(String dropOffLoc) {
	this.dropOffLoc = dropOffLoc;
}
public Date getPickUpDate() {
	return pickUpDate;
}
public void setPickUpDate(Date pickUpDate) {
	this.pickUpDate = pickUpDate;
}
public Date getDropOfDate() {
	return dropOfDate;
}
public void setDropOfDate(Date dropOfDate) {
	this.dropOfDate = dropOfDate;
}



}
