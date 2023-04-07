package com.shapeofyou;

public abstract class BoundedShape {
	//fields
	private int sides;
	private int vertices;
	
	public BoundedShape(int sides, int vertices) {
		this.sides=sides;
		this.vertices=vertices;
		
	}//end of constructor
	
	public abstract double area(); //A class with one or more abstract methods needs the class itself to be declared as abstract.

	
	@Override
	public String toString() {
		return "BoundedShape [sides= " +sides + ", vertices= "+ vertices;
	}//Over riding the toString method from supermost class object


}//end of class BoundedShape
