package com.shapeofyou;

public class Rectangle extends BoundedShape {
	
	private int length;
	private int width;
	
	public Rectangle( int sides, int vertices, int l, int w) {
		super(sides, vertices);
		this.width=w;
		this.length=l;
	}//end of constructor
	
	public double area() {
		return width*length;
	}//end of double method
	
	public String toString() {
		return "Rectangle= ["+super.toString()+" Length"+length+", Width"+width+" ]";
	}//end of toString method


}
