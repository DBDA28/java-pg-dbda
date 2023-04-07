package com.boxing.day;
import java.util.Scanner;
public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the box dimensions");
		Box b1 = new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		System.out.println(b1.getBoxDims());
		System.out.println(b1.getBoxVol());
		
		sc.close();
		
	}

}
