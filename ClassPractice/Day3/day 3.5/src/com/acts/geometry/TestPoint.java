package com.acts.geometry;

import java.util.Scanner;

public class TestPoint {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the coordinates:");
	Point2D p1 = new Point2D(sc.nextDouble(),sc.nextDouble());
	System.out.println(p1.show());
	System.out.println("Enter the coordinates:");
	Point2D p2 = new Point2D(sc.nextDouble(),sc.nextDouble());
	System.out.println(p2.show());
	boolean status=p1.equals(p2);
	System.out.println(status);
}
}