package arrays;
import java.util.Scanner;
//Accept size of a double[] form user. accept array data. display array data.
public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array: ");
		double[] arr = new double[sc.nextInt()];
		//populate the array
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the ele for the array");
			arr[i]=sc.nextDouble();
		}
		//display array data by for-each
		for(double d: arr) {
			System.out.print(d+" ");
		}
		
		sc.close();

	}

}
