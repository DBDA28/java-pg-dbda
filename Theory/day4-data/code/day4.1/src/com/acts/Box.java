package com.acts;

public class Box {
//properties(non static data members=instance variables)
	private double width;
	private double depth;
	private double height;

	// add a parameterized constructor to init COMPLETE state of the Box
	public Box(double w, double d, double height) {
		width = w;
		depth = d;
		this.height = height;// RHS : local var , LHS : instance var.
	}

	// add overloaded constructor for creating a cube
	public Box(double side) {
		// width=depth=height=side;
		this(side, side, side);// ctor chaining : to avaoid dup of code
	}

	// add overloaded constructor for creating a box with dims = -1
	public Box() {
		this(-1);// invokes 2nd ctor
	}

	// Behavior : functionality (methods)
	// Add a method : To return Box details in string form (dims of Box)
	public String getBoxDims() {
		return "Box Dims are " + this.width + " " + this.depth + " " + height;
		// NOTE : this keyword here is optional
	}

	// Add a method to return computed volume of the box.
	public double getComputedVolume() {
		return width * depth * this.height;
		// NOTE : this keyword here is optional (All instance method : non static
		// methods can access instance vars directly
	}

	// add a method to chk equality of 2 boxes
	//this=b1 , anotherBox=b2
	public boolean isEqual(Box anotherBox) {
		System.out.println(this);
		System.out.println(anotherBox);
		return this.width == anotherBox.width 
				&& this.depth == anotherBox.depth 
				&& this.height == anotherBox.height;
	}
	//add getter n setter methods --width
	public double getWidth()
	{
		return this.width;
	}
	public void setWidth(double width)
	{
		this.width=width;
	}
}
