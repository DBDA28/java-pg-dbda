package com.acts.tester;
import com.acts.Box;
//A separate class for UI
import java.util.Scanner;

public class TestBox {

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
		Box b3 = b1;
		// display box dims
		System.out.println(b3.getBoxDims());
		// display box volume
		System.out.println("Volume=" + b3.getComputedVolume());
		b1=null;
	//	System.out.println(b1.getBoxDims());
		System.out.println(b3.getBoxDims());
		b3=null;//1st box object is marked for GC
		b2=new Box(1,2,3);//2nd box obj is marked for GC
		System.out.println("cntd....");
		//prompt for side of a cube n then create a cube 
		System.out.println("Enter side of a cube");
		Box cube=new Box(sc.nextDouble());
		System.out.println(cube.getBoxDims());
		Box dummyBox=new Box();//This should create a new box with dims : -1.0,-1.0,-1.0
		System.out.println(dummyBox.getBoxDims());
		//chk equality of 2 boxes : b1 n b2
	
		sc.close();

	}

}
