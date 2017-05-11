package com.main;

import java.util.ArrayList;

public class RoundTrip {

	ArrayList<Flight> outBoundTrip=new ArrayList<>();
	ArrayList<Flight> inBoundTrip=new ArrayList<>();
	float cost=0;
	String description=null;

	public String getDescription(){
		int a=outBoundTrip.size();
		int b= inBoundTrip.size();
		description=outBoundTrip.get(0).getOrigin();
		description="Strts at"+description+" and destination at "+outBoundTrip.get(a-1).getDestination()+" and the return journey is from"+ inBoundTrip.get(0).getOrigin()+" and ends at  "+inBoundTrip.get(b-1).getDestination();

		return description;
	}
	public float getCost(){
		for(Flight o:outBoundTrip){
			float c=o.getCost();
			cost=cost+c;
		}
		for(Flight i:inBoundTrip){
			float c=i.getCost();
			cost=cost+c;
		}
		return cost;
	}
	public ArrayList<Flight> getOutBoundTrip() {
		return outBoundTrip;
	}
	public void setOutBoundTrip(ArrayList<Flight> outBoundTrip) {
		this.outBoundTrip = outBoundTrip;
	}
	public ArrayList<Flight> getInBoundTrip() {
		return inBoundTrip;
	}
	public void setInBoundTrip(ArrayList<Flight> inBoundTrip) {
		this.inBoundTrip = inBoundTrip;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
