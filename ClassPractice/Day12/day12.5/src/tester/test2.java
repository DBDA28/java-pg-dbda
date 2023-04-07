package tester;

import java.util.List;
import com.shop.core.*;
import java.util.Scanner;
import utils.ShopUtils;
import java.time.LocalDate;

public class test2 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// get product list from the utils
			List<Product> productList = ShopUtils.populateProductList();
			System.out.println("original product list");
			// accept date from user
			// remove all products manufactured before specified date
			System.out.println("enter the date");
			LocalDate date=LocalDate.parse(sc.next());
			productList.removeIf(p -> p.getManufactureDate().isBefore(date));
			productList.forEach(p -> System.out.println(p));
		}
	}

}
