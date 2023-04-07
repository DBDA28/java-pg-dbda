package com.tester;

import com.shapes.*;
public class TestingShapes {
	public static void main(String[] args) {
		//using direct init of array: to hold circle and rectangle refs.
		BoundedShape[] shapes = {new Circle(10, 20, 10.5), new Rectangle(40,50,10,24)};
		for(BoundedShape s: shapes) {
			System.out.println(s);
			System.out.println("Area:"+s.area());
			
		}
		
	}//end of main

}//end of class TestingShapes
