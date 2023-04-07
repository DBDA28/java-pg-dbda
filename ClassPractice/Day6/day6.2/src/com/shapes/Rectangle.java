package com.shapes;

public class Rectangle extends BoundedShape {
	private int w;
	private int h;
	
	public Rectangle(int x, int y, int w, int h) {
		super(x,y);
		this.w=w;
		this.h=h;
	}//end of ctor
	
	public double area() {
		return w*h;
	}

	@Override
	public String toString() {
		return "Rectangle"+super.toString()+" "+"[w=" + w + ", h=" + h + "]";
	}
	
	
}
