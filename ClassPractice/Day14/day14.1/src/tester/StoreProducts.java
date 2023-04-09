package tester;

import java.util.Map;
import java.util.Scanner;

import com.shop.core.Product;

import utils.IOUtils;

import static utils.ShopUtils.*;

public class StoreProducts {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 1.get products map from shop utils
			Map<Integer, Product> productMap = populateProductMap(populateProductList());

			// 2. get file name from user
			System.out.println("Enter file name to store products");
			String fileName = sc.next();

			// 3. save map of products in bin file: using serialization: I/O
			// IOUtils: i/f --add a static method
			IOUtils.writeData(productMap, fileName);
			System.out.println("data saved successful!");
		}//end of try-with
		catch (Exception e) {
			e.printStackTrace();
		}//end of catch

	}//end of main

}
