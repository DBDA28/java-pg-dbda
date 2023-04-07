package com.sports.keeda;

//assignment 4.1 and 4.2
public abstract class  Player {
	private String name;
	private int age;
	private String nationality;
	
	public Player(String name, int age, String nationality ) {
		this.name=name;
		this.age=age;
		this.nationality=nationality;
		
	}//end of constructor
	
	public abstract double performance();
	
	public String toString() {
		return name+" "+age+" "+nationality;

	}//end of toString method

}//end of class Player
