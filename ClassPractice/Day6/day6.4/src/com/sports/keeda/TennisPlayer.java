package com.sports.keeda;

public class TennisPlayer extends Player {
	private int matches;
	private int aces;
	
	public TennisPlayer(String name, int age, String nationality, int matches, int aces) {
		super(name, age, nationality);
		this.matches=matches;
		this.aces=aces;
		
	}// end of constructor
	
	public double performance() {
		System.out.print("aces served: ");
		return aces/matches;
	}
	
	public String tostring() {
		return super.toString()+" "+matches+" "+aces;
		
	}//end of toString

}//end of Class FootballPlayer
