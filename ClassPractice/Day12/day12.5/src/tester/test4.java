package tester;

import java.util.Arrays;
import java.util.stream.IntStream;

public class test4 {

	public static void main(String[] args) {
		// attach stram to in[] (src) --filter even nos: intermediate operation --
		// display even nos: terminal operation.
		int [] arr = {10,11,23,35,65,76,32,865,30};
		//Arrays.stream(int[] date) ---> IntStream
		IntStream mystream = Arrays.stream(arr)//return IntStream. Attaching the source.
		.filter(i -> i%2 == 0);//Intermediate operation. filter
		mystream.forEach(even -> System.out.print(even+" "));//terminal operation
		//mystream.forEach(even -> System.out.print(even+" "));//once stream is closed terminal operation cant be performed

	}//end of main

}//end of test4 class
