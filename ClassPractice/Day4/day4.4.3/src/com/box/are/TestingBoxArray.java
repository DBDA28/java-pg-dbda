package com.box.are;

import java.util.Scanner;
public class TestingBoxArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num of boxes to be created");
		Box[] box = new Box[sc.nextInt()];
		for(int i=0;i<box.length;i++) {
			System.out.println("enter the dims");
			box[i] = new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		}
		System.out.println("displaying the box dims and vol");
		for(Box i:box) {
			System.out.println(i.getDims());
			System.out.println(i.getVol());
		}
		
	}

}