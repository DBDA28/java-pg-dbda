package tester;

import java.util.List;
import java.util.Scanner;

import com.shop.core.Category;
import com.shop.core.Product;

import utils.ShopUtils;

public class test7 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			List<Product> producList = ShopUtils.populateProductList();
			System.out.println("enter category and discount");
			Category cat = Category.valueOf(sc.next().toUpperCase());
			double discount = sc.nextDouble();
			producList.stream()
			.filter(p -> p.getProductCategory()==cat)
			.forEach(p -> {
				p.setPrice(p.getPrice()-discount);
				System.out.println(p);
			});
			
		}
	}// end of main

}// end of test5 class
