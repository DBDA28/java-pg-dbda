package com.ek.kadouble;

public class Box {
	private double width;
	private double depth;
	private double height;
	
	public Box(double width,double depth,double height) {
		this.width=width;
		this.depth=depth;
		this.height=height;
	}//end of ctor
	
	public double getWidth() {
		return this.width;
	}
	
	public void setWidth(double width) {
		this.width=width;
	}
	public String getDims() {
		return "Box dims are:"+this.width+" "+this.depth+" "+this.height;
	}
	
	public double getVol() {
		return this.width*this.depth+this.height;
	}

	

}//end of Box class
