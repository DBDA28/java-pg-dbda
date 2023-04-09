package tester;

import java.util.Map;
import java.util.Scanner;

import com.shop.core.Product;

import utils.IOUtils;

import static utils.ShopUtils.*;

public class RestoreProducts {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 1. get file name from user
			System.out.println("Enter file name to restore products");
			String fileName = sc.next();

			// 2.restore map of products in bin file
			// IOUtils: i/f --add a static method
			Map<Integer, Product> data = IOUtils.restroredData(fileName);
			System.out.println("data saved successful!");
			// data displaying
			data.forEach((K, V) -> System.out.println(K + ";" + V));
		} // end of try-with
		catch (Exception e) {
			e.printStackTrace();
		} // end of catch

	}// end of main

}
