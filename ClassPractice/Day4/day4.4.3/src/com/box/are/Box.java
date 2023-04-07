package com.box.are;

public class Box {
	private double width;
	private double depth;
	private double height;
	
	public Box(double w, double d, double h) {
		width=w;
		depth=d;
		height=h;
	}
	
	public void setWidth(double width) {
		this.width=width;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public String getDims() {
		return "Dims of the boxes are:"+this.width+" "+this.depth+" "+this.height;
	}
	
	public double getVol() {
		System.out.print("the vol of the box:");
		return this.width*this.depth*this.height;
	}
	

}
