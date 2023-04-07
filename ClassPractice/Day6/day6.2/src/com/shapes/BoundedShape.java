package com.shapes;

//Any time you add abstract method/s you have to declare the class as abstract. otherwise javac error
public abstract class BoundedShape {
	private int x,y;
	
	public BoundedShape(int x, int y) {
		this.x=x;
		this.y=y;
	}//end of ctor

	public String toString() {
		return "x="+x+"y="+y;
	}//end of toString
	
	//add a method to return computed area of a bounded shape
	
	public abstract double area();

}
