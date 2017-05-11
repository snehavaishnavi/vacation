package com.main;

public class CarRentalDecorator extends PackageDecorator{
	Car car;
	BasePackage basepackage1;
	float cost;
	String description;
	
	public CarRentalDecorator(Car car,BasePackage basepackage){
		this.cost=basepackage.getCost()+car.getCost();
		basepackage.setCost(cost);
		this.description=basepackage.getDescription()+"car boocked at"+car.getCarCity();
		basepackage.setdescription(description);	
		this.basepackage1=basepackage;
		
	}
	@Override
	public float getCost(){
		return this.cost;
		
	}
	@Override
	public String getDescription(){
		return this.description;
		
	}
	public BasePackage getCarDecoratedPackage(){
		return this.basepackage1;
	}

}
