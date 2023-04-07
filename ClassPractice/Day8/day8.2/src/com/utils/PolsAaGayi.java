package com.utils;

import com.needforspeed.DurghatnaSeDerBhali;

public class PolsAaGayi {
	// declaring final fields
	public static final int MIN_SPEED;
	public static final int MAX_SPEED;

	static {
		MIN_SPEED = 30;
		MAX_SPEED = 100;
	}// end of static initializer block

	// add a static method for validating speed of the vehicle
	public static void validateSpeed(int speed) throws DurghatnaSeDerBhali {
			if (speed < MIN_SPEED) {
				throw new DurghatnaSeDerBhali("jaldi chala kal subeh panvel nikalna hai");
			}
			if(speed > MAX_SPEED) {
				throw new DurghatnaSeDerBhali("Bikharne ka tujhko shauk hai bada?");
			}
			System.out.println("Sanskari");
			

	}// end of validateSpeed method

}// end of PolaAaGayi class
