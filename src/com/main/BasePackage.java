package com.main;

public class BasePackage implements VacationPackage{
	
	float cost;
	String description;
	RoundTrip tripDetails=new RoundTrip();
	public BasePackage(){
		
	}
	
	public BasePackage(RoundTrip tripDetails){
		this.tripDetails=tripDetails;
		description=tripDetails.getDescription();
		cost=tripDetails.getCost();
		
	}
	
	public void setCost(float cost){
		this.cost=cost;
	}
	public void setdescription(String des){
		this.description=des;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.description;
	}

	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		return this.cost;
	}
	
}
