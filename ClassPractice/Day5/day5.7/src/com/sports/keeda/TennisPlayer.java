package com.sports.keeda;

public class TennisPlayer extends Player {
	private int rank;
	private int matches;
	private int aces;
	
	public TennisPlayer(String name, int age, String country, int rank, int matches, int aces) {
		super(name,age,country);
		this.rank=rank;
		this.matches=matches;
		this.aces=aces;
	}//end of ctor
	
	public String play() {
		return super.play()+rank+" "+matches+" "+aces;
	}//end of overridden play method
	

}//end of class TennisPlayer
