package com.sports.keeda;

public class Player {
	private String name;
	private int age;
	private String country;
	
	public Player(String name, int age, String country){
		this.name=name;
		this.age=age;
		this.country=country;
		
	}//end of ctor

	public String play() {//overidden method
		return "plays a sport: "+name+" "+age+" "+country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
