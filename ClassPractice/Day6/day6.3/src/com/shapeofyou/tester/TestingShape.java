package com.shapeofyou.tester;

import java.util.Scanner;

import com.shapeofyou.BoundedShape;
import com.shapeofyou.Circle;
import com.shapeofyou.Rectangle;

public class TestingShape {
	public static void main(String[] args) {
//		BoundedShape[] shapes = { new Circle(0, 0, 10), new Rectangle(4,4,15,20) };
//		for (BoundedShape s : shapes) {
//			System.out.println(s);
//			System.out.println(s.area());
//		}

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of shapes to be updated");
		BoundedShape[] shapes = new BoundedShape[sc.nextInt()];
		boolean exit = false;
		int counter = 0;
		while (!exit) {
			System.out.println("1. enter circle details | 2. enter Rectange detail | 3. exit | 4. display details");
			switch (sc.nextInt()) {

			case 1:
				System.out.println("enter the parameters for circle");
				shapes[counter++] = new Circle(sc.nextInt(), sc.nextInt(), sc.nextInt());
				System.out.println("circle detail updated");

				break;
			case 2:
				System.out.println("enter the parameters for rectangle");
				shapes[counter++] = new Rectangle(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
				System.out.println("Rect updated");
				break;

			case 3:
				System.out.println("Program terminated");
				exit = true;
				break;
			case 4:
				for (BoundedShape s : shapes) {
					System.out.println(s.area());
				}
				break;
			default:
				System.out.println("Invalid Input");
			}
		}

	}
}
