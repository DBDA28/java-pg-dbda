package com.acts.tester;
import java.util.Scanner;
import com.acts.Box;
public class TestBoxArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of boxes to make");
		//create Box[] to hold Box type of reference.
		Box[] boxes= new Box[sc.nextInt()];//Only one object created.
		//display array data: for each
		for(Box b: boxes)//b=boxes 
			System.out.println(b);
		System.out.println("Class name: "+boxes.getClass());//[Lcom.acts.Box... L denotes loaded class
		//accept box dims and create box objs -- store the ref in the array
		for(int i=0;i<boxes.length;i++) {
			System.out.println("enter the dimensions");
			boxes[i] = new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		}
		for(Box b: boxes) {
			System.out.println("Dimensions of the boxes:"+b.getBoxDims());
			System.out.println("Volume of the boxes:"+b.getComputedVolume());

		}
		for(Box b:boxes) {
			if(b.getComputedVolume()>100) {
				b.setWidth(b.getWidth()*2);
				System.out.println("Dimensions of the doubled boxes:"+b.getBoxDims());
			}
		}
		sc.close();
		
	}

}
	
