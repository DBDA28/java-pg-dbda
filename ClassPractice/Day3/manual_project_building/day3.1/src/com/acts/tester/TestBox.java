package com.acts.tester;
import com.acts.Box;
import java.util.Scanner;
public class TestBox {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the box dimensions");
		Box b1 = new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		System.out.println("The details of the box:"+b1.getBoxDims());
		System.out.println("The volume of the box: "+b1.getComputedVol());
		sc.close();
		
	}
}