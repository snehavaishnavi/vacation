package com.main;

import java.util.Date;

public class CarSelector {
String pickUpLoc;
String dropOffLoc;
Date pickUpDate;
Date dropOffDate;
String carCity;
CarValidator carValid=new CarValidator();
Car car=new Car();



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



public Date getDropOffDate() {
	return dropOffDate;
}



public void setDropOffDate(Date dropOffDate) {
	this.dropOffDate = dropOffDate;
}



public String getCarCity() {
	return carCity;
}



public void setCarCity(String carCity) {
	this.carCity = carCity;
}


public Car carSelector(){
	car.setCarCity(carCity);
	car.setPickUpDate(pickUpDate);
	car.setDropOfDate(dropOffDate);
	car.setPickUpLoc(pickUpLoc);
	car.setDropOffLoc(dropOffLoc);
	car.setCost(120);
	
	return car;
}


}
