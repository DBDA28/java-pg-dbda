package com.ek.kadouble;

import java.util.Scanner;

public class TestingDoubledBoxes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number boxes to be created");
		Box[] boxes = new Box[sc.nextInt()];
		for(int i=0;i<boxes.length;i++) {
			System.out.println("enter the dims for the box");
			boxes[i]=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		}
		System.out.println("displaying the dims and vol of boxes");
		for(Box i:boxes) {
			System.out.println(i.getDims());
			System.out.println(i.getVol());
		}
		for(Box i:boxes) {
			if(i.getVol()>100) {
				i.setWidth(i.getWidth()*2);
			}
		}
		System.out.println("displaying the doubled width boxes");
		for(Box i: boxes) {
			System.out.println(i.getDims());
			System.out.println(i.getVol());

		}


	}
}
