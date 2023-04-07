package com.sports.keeda;

public class FootballPlayer extends Player {
	private int matches;
	private int goals;
	
	public FootballPlayer(String name, int age, String nationality, int matches, int goals) {
		super(name, age, nationality);
		this.matches=matches;
		this.goals=goals;
		
		
	}
	
	public double performance() {
		System.out.print("defended goals: ");
		return goals/matches;
	}
	
	public String tostring() {
		return super.toString()+" "+matches+" "+goals;
		
	}//end of toString

}//end of Class FootballPlayer
