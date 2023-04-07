package com.sports.keeda;

public class Cricketer extends Player {
	
	//fields
	private int runs;
	private double average;

	public Cricketer(String name, int age, String country, int runs, double average) {
		super(name,age,country);//invoking super ctor Player() from class Player
		this.runs=runs;
		this.average=average;
		
	}//end of Cricketer ctor
	
	public String play() {
		//return play()+" "+runs+" "+average;//this will cause StackOverflowError exception since calling only play() will cause it run recursively.
		return super.play()+" "+runs+" "+average;//overloaded play() method
	}//end of overloaded play method

}
