package com.acts.geometry;

public class Point2D {
 private double x;
private double y;

public Point2D(double x, double y) {
	 this.x=x;
	 this.y=y;
	 
}
 public String show() {
	return "X="+ x +" "+"Y="+ y;
	 
 }
 public boolean equals(Point2D p) {
	return this.x==p.x && this.y==p.y;
	 
 }
}
