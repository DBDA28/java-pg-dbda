package com.acts.tester;
import com.acts.Box;
//A separate class for UI
import java.util.Scanner;

public class TestBox2 {

	public static void main(String[] args) {
		// create scanner instance wrapping std in
		Scanner sc = new Scanner(System.in);
		Box b1;// b1 : class type of reference which can point to BOx type of the object , mem
				// allocated in the stack
		// prompt user for the box dims
		System.out.println("Enter box dims w d h");
		b1 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		// display box dims
		System.out.println(b1.getBoxDims());
		// display box volume
		System.out.println("Volume=" + b1.getComputedVolume());
		// prompt user for the box dims
		System.out.println("Enter 2nd box dims w d h");
		Box b2 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		// display box dims
		System.out.println(b2.getBoxDims());
		// display box volume
		System.out.println("Volume=" + b2.getComputedVolume());
		//chk equality of 2 boxes : b1 n b2
	//	boolean status=b1.isEqual(b2);
//		if(status)
//			System.out.println("Boxes are same");
//		else
//			System.out.println("Different Boxes");
		System.out.println(b1);//com.app.acts.Box@12345
		System.out.println(b2);//com.app.acts.Box@456789
		System.out.println(b1.isEqual(b2)?"Boxes are same":"Different Boxes");
		sc.close();

	}

}
