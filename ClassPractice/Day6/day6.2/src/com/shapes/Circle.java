package com.shapes;

import static java.lang.Math.*;
public class Circle extends BoundedShape {
	
	private double radius;

	public Circle (int x ,int y, double radius) {
		super(x,y);
		this.radius=radius;
	}//end of ctor
	
	//Implementing the abstract behavior inherited from abstract super class:
	//BoundedShape
	@Override
	public double area() {

		return PI*radius*radius;
		
	}//end of area method
	
	public String toString() {
		return super.toString()+" "+radius;
	}//end of toString

}//end of Circle
