package com.sports.keeda.test;

import com.sports.keeda.*;

public class TestingPlayers {
	public static void main(String[] args) {
		Player[] ath= {new Cricketer("vk",34,"India",500,2500), 
				new FootballPlayer("Ronaldo", 34, "Portugal",100, 200),
				new TennisPlayer("joko", 34, "usa", 500, 1000)};
		for(Player p : ath ) {
			System.out.println(p);
			System.out.println(p.performance());
			
		}


	}

}
