package com.sports.keeda;

public class FootballPlayer extends Player{
	//fields
	private int goals_scored;
	private int assists;
	private String positions;
	
	public FootballPlayer(String name, int age, String country, int goals_scored, int assists, String positions) {
		super(name,age,country);
		this.goals_scored=goals_scored;
		this.assists=assists;
		this.positions=positions;
		
	}//end of ctor
	
	public String play() {
		return super.play()+" "+goals_scored+" "+assists+" "+positions;
		
	}//over ridden method play()

}
