package com.sports.keeda;

public class Player {
	private String name;
	private int age;
	private String country;
	
	public Player(String name, int age, String country) {
		this.name=name;
		this.age=age;
		this.country=country;
	}//end of ctor

	public String play() {
		return "Statistics: "+name+" "+age+" "+country;
	}//end of play method

}//end of class Player
