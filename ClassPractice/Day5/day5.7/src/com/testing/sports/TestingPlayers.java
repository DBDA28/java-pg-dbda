package com.testing.sports;

import com.sports.keeda.*;

//Lab Assignment day5
public class TestingPlayers {
	public static void main(String[] args) {
		Cricketer c1 = new Cricketer("veeriot cueli",34,"India",25000,55.58);
		System.out.println(c1.play());
		FootballPlayer f1 = new FootballPlayer("krishna Ronaldo",35,"Portugal",6465,423,"forward");
		System.out.println(f1.play());
		TennisPlayer t1 = new TennisPlayer("Rojarr Faderer",40,"America",31,455,646);
		System.out.println(t1.play());
		
	}//end of main

}//end of class TestingPlayers
