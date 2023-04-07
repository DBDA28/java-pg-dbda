package tester;

import static utils.ShopUtils.populateProductList;

import java.util.List;

import com.shop.core.Category;
import com.shop.core.Product;

public class test5 {

	public static void main(String[] args) {
		// get product list from the utils
		List<Product> productList = populateProductList();
		productList.stream()// Stream<Product> //source operation
				.forEach(p -> System.out.println(p)); // terminal operation
		
		System.out.println("white space");

		// filter all products with category=fruits and display them
		productList.stream().filter(p -> p.getProductCategory() == Category.BREAD).forEach(p -> System.out.println(p));
	}// end of main

}// end of test5 class
