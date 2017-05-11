package com.main;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Driver {
public static void main(String[] args){
	FlightSelector flightselector=new FlightSelector();
	HotelSelector hs=new HotelSelector();
	CarSelector cs=new CarSelector();
	BasePackage basepackage;
	Hotel hotel=new Hotel();
	Car car=new Car();
	HotelDecorator hotelDecorator;
	CarRentalDecorator carDecorator;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Calendar c = Calendar.getInstance();
	Calendar c2 = Calendar.getInstance();
	c.setTime(new Date()); // Now use today date.
	c2.setTime(new Date()); // Now use today date.
	Date date=c.getTime();
	String currentDate = sdf.format(c.getTime());
	c.add(Calendar.DATE, 1); // Adding 1 day
	c2.add(Calendar.DATE, 5); // Adding 5 days
	Date d1=c.getTime();
	Date d2=c2.getTime();
	String output = sdf.format(c.getTime());
	if(date.before(d2)){
	System.out.println(currentDate+""+output);
	}
	
	
	//Assuming that the depart date is one day after the current date
	
	Date departDate=d1;
	Date returnDate=d2;
	String origin="Charlotte";
	String destination="Atlanta";
	int adult=1;
	int children=0;
	RoundTrip tripDetails=new RoundTrip();
	
	boolean adultValid=flightselector.validateAdult(adult);
	boolean departvalid=flightselector.validateDepart(departDate, date);
	boolean returnValid=flightselector.validateReturn(returnDate, date, departDate);
	boolean orgdestValid=flightselector.validateOriginDestination(origin, destination);
	
	if(adultValid){
		if(departvalid){
			if(returnValid){
				if(orgdestValid){
					flightselector.setDepartDate(departDate);
					flightselector.setReturnDate(returnDate);
					flightselector.setAdult(adult);
					flightselector.setChild(children);
					flightselector.setOrigin(origin);
					flightselector.setDestination(destination);
					
					tripDetails=flightselector.flightSelector();
					
					int a=tripDetails.outBoundTrip.size();
					int b=tripDetails.inBoundTrip.size();
					Calendar cal=Calendar.getInstance();
					cal.setTime(tripDetails.outBoundTrip.get(a-1).getDestReachDate());
					cal.add(Calendar.HOUR_OF_DAY, 1);
					Date dh1=cal.getTime();
					cal.setTime(tripDetails.inBoundTrip.get(0).getDestDepartDate());
					cal.add(Calendar.HOUR_OF_DAY, -1);
					Date dh2=cal.getTime();
					
					basepackage=new BasePackage(tripDetails);
					
					Date checkInDate=dh1;
					Date checkOutDate=dh2;
					int adults=2;
					int childrn=1;
					int rooms=1;
					String hotelCity="Atlanta";
					
					boolean validCheckin=hs.valid.validateCheckIndate(checkInDate, tripDetails);
					boolean validCheckOut=hs.valid.validateCheckOutDate(checkOutDate, tripDetails);
					boolean validAdult=hs.valid.validateAdults(adults);
					boolean validRooms=hs.valid.validateRooms(rooms);
					boolean validCity=hs.valid.validateCity(hotelCity, tripDetails);
					
					if(validCheckin){
						if(validCheckOut){
							if(validAdult){
								if(validRooms){
									if(validCity){
										hs.setAdults(adults);
										hs.setCheckInDate(checkInDate);
										hs.setCheckOutDate(checkOutDate);
										hs.setChildren(childrn);
										hs.setCity(hotelCity);
										hs.setRooms(rooms);
										
										hotel=hs.hotelSelector();
										hotelDecorator=new HotelDecorator(hotel, basepackage);
										basepackage=hotelDecorator.getHotelDecoratedPackage();
										
										Date pickUpDate=dh1;
										Date dropOffDate=dh2;
										String pickUpLoc="Atlanta";
										String dropOffLoc="Atlanta";
										String carCity="Atlanta";
										
										boolean validPickUpDate=cs.carValid.validatePickUpDate(pickUpDate, tripDetails);
										boolean validDropOffDate=cs.carValid.validateDropOffDate(dropOffDate, tripDetails);
										boolean validPickUpLoc=cs.carValid.validatePickUpLoc(pickUpLoc, tripDetails);
										boolean validDropOffLoc=cs.carValid.validateDropOffLoc(dropOffLoc,tripDetails);
										boolean validCarCity=cs.carValid.validateCarRentalCity(carCity, tripDetails);
										
										if(validPickUpDate){
											if(validDropOffDate){
												if(validPickUpLoc){
													if(validDropOffLoc){
														if(validCarCity){
															cs.setCarCity(carCity);
															cs.setPickUpDate(pickUpDate);
															cs.setDropOffDate(dropOffDate);
															cs.setPickUpLoc(pickUpLoc);
															cs.setDropOffLoc(dropOffLoc);
															
															car=cs.carSelector();
															carDecorator=new CarRentalDecorator(car,basepackage);
															basepackage=carDecorator.getCarDecoratedPackage();
															
															System.out.println("the final cost of the vacation package is "+ basepackage.getCost());
															System.out.println("Description of vacation package is "+basepackage.getDescription());
															
														}else{
															System.out.println("Enter valid  car city");
														}
													}else{
														System.out.println("Enter valid drop off location");
													}
												}else{
													System.out.println("Enter valid pick up location");
												}
											}else{
												System.out.println("Enter valid drop off date");
											}
										}else{
											System.out.println("Enter valid pick up date");
										}								
										
									}else{
										System.out.println("Enter valid city");
									}
								}else{
									System.out.println("Enter requires atleast 1 room");
								}
							}else{
								System.out.println("Enter requires atleast 1 adult");
							}
						}else{
							System.out.println("Enter valid checkout date");
						}
					}else{
						System.out.println("Enter valid check in date");
					}	
					
				}else{
					System.out.println("Enter another detination");
				}
			}else{
				System.out.println("enter valid return date");
			}
			
		}else{
			System.out.println("Enter valid depart date");
		}
		
	}else{
		System.out.println("There should atleast be one adult");
	}
	
	
}

}
