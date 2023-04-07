package tester;

import java.util.Collections;
import java.util.List;
import com.shop.core.*;
import java.util.Scanner;
import utils.ShopUtils;
import java.time.LocalDate;

public class test3 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// get product list from the utils
			List<Product> productList = ShopUtils.populateProductList();
			System.out.println("original product list");
			//sort the product list as per date
			productList.forEach(p -> System.out.println(p));
			Collections.sort(productList, (p1, p2) -> p1.getManufactureDate().compareTo(p2.getManufactureDate()));
			System.out.println(" sorted -");
			productList.forEach(p -> System.out.println(p));
			

		}
	}

}
