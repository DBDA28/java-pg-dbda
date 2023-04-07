package com.acts;
public class Box{
	private double width;
	private double height;
	private double depth;
	
	public Box(double width, double height, double depth){
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	public String getBoxDims(){
		return "Box dimensions are: "+this.width+" "+this.height+" "+this.depth;
	}
	
	public double getComputedVol(){
		return this.width*this.height*this.depth;
	}
	
}