package com.boxing.day;

public class Box {
	private double width;
	private double depth;
	private double height;
	
	public Box(double w,double d,double h) {
		this.width=w;
		this.depth=d;
		this.height=h;
	}
	
	public String getBoxDims() {
		return "Box dims are: "+this.width+" "+this.depth+" "+this.height;
	}
	
	public double getBoxVol() {
		System.out.print("Box vol is: ");
		return this.width*this.depth*this.height;

	}

}
