package arrays;

import java.util.Arrays;

public class TestMultiDimensionalArray {

	public static void main(String[] args) {
		//create 2D array to store the integers with the value: from 10 onwards
		//row: 4, col: 3
		int value=0;
		int[][] arr=new int[4][3];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=value++;
			}//end of inner for
		}//end of outer for
		for(int[] i:arr) {
			for(int j: i) {
				System.out.print(j+" ");
			}
			//System.out.println(i);
			System.out.println();
		}
		//print complete data of nested array using method of java.util.Arrays
		System.out.println("Printing array contents using Arrays.deepToString");
		System.out.println(Arrays.deepToString(arr));
		 double[][] double1 = {{1.2 ,2.5},{1.2,2.5},{1.2,2.5}};
		 System.out.println(Arrays.deepToString(double1));
		 double[][] double2 = {{1.2 ,2.5},{1.2,2.5,3.5},{1.2,2.5,6,7}};
		 System.out.println(Arrays.deepToString(double2));
	}//end of main

}//end of class
