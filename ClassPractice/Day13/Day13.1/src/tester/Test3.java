package tester;

import static utils.ShopUtils.populateProductList;
import static utils.ShopUtils.populateProductMap;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;

import com.shop.core.Product;

//accept date from user. Display no of products manufactured after specified date.
public class Test3 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			Map<Integer, Product> productMap = populateProductMap(populateProductList());
			System.out.println("Original map");
			productMap.forEach((k, v) -> System.out.println(k + ": " + v));
			LocalDate date = LocalDate.parse(sc.next());
			long count = productMap.values().stream().filter(p -> p.getManufactureDate().isAfter(date)).count();

			System.out.print("Count: " + count);

		}
	}

}
