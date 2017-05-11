package com.main;

public class HotelDecorator extends PackageDecorator{
	BasePackage basepackage1=new BasePackage();
	Hotel hotel;
	float cost;
	String description;

	public HotelDecorator(Hotel hotel, BasePackage basepackage){
	this.cost=basepackage.getCost()+hotel.getCost();
	basepackage.setCost(cost);
	this.description=basepackage.getDescription()+"hotel boocked at"+hotel.getCity();
	basepackage.setdescription(description);	
	this.basepackage1=basepackage;
	
	}

	@Override
	public float getCost() {	
		return this.cost;
	}


	@Override
	public String getDescription() {
		return this.description;
	}

	public BasePackage getHotelDecoratedPackage(){
		return this.basepackage1;
	}

}
