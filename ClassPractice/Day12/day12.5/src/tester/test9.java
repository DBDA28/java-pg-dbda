package tester;

import java.util.List;
import java.util.OptionalDouble;

import com.shop.core.*;
import java.util.Scanner;
import utils.ShopUtils;

//Display sum of process of all the products under specified category

public class test9 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// get product list from the utils
			List<Product> productList = ShopUtils.populateProductList();
			System.out.println("original product list");
			productList.forEach(p -> System.out.println(p));
			// accept product category from the user.
			// remove all the products from the specified category
			// display the list again
			System.out.println("enter category");
			Category chosenCategory = Category.valueOf(sc.next().toUpperCase());
			double sum = productList.stream().filter(p -> p.getProductCategory() == chosenCategory)
					.mapToDouble(p -> p.getPrice()).sum();
			System.out.println(sum);

		}
	}

}
