package com.sports.keeda;

public class Cricketer extends Player {
	//fields
	private int runs;
	private double avg;
	
	public Cricketer(String name, int age, String country, int runs, double avg){
		super(name,age,country);
		this.runs=runs;
		this.avg=avg;
	}//end of ctor
	
	public String play() {//over riding method
		return super.getName()+" scored "+runs+" runs at an avg of "+avg;
	}//end of play method

}// end of Cricketer class
