package tester;

import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

import com.shop.core.Category;
import com.shop.core.Product;

import utils.ShopUtils;

public class test8 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			//print sum of squares all odd numbers in the range 1-100
			//rangeClosed filter square and sum
			int sum = IntStream.rangeClosed(1,100)//Intstream 1-100
			.filter(i -> i%2 !=0)//int stream of odd nums
			.map(i -> i*i).sum();
			System.out.println("sum: "+sum);
		}
	}// end of main

}// end of test5 class
