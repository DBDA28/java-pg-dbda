package com.shapeofyou;

import static java.lang.Math.*;
public class Circle extends BoundedShape {
	
	private double radius;
	
	public Circle(int sides, int vertices, double radius) {
		super(sides, vertices);
		this.radius=radius;

	}//end of constructor
	
	public double area() {
		System.out.print("The area of the circle: ");
		return PI*radius*radius;
	}
	
	public String toString() { //over riding the toString function from BoundedShape
		
		return "Circle " + super.toString()+ " Radius: "+radius + "]";
		
	}//end of toString method

}
