package com.sports.keeda;

public class Cricketer extends Player {
	private int matches;
	private int runs;
	
	public Cricketer(String name, int age, String nationality, int matches, int runs) {
		super(name, age, nationality);
		this.matches=matches;
		this.runs=runs;
		
		
	}
	
	public double performance() {
		System.out.print("Batting Average: ");
		return runs/matches;
	}
	
	public String tostring() {
		return super.toString()+" "+matches+" "+runs;
		
	}//end of toString

}
