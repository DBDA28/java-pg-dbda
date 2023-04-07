package tester;

import java.time.LocalDate;
import static utils.ShopUtils.populateProductList;
import static utils.ShopUtils.populateProductMap;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.shop.core.Product;

//filer all the products manufactured after specific date and add it in another list by the name
public class Test4 {

	public static void main(String[] args) {
		Map<Integer, Product> productMap = populateProductMap(populateProductList());
		System.out.println("Original map");
		productMap.forEach((k, v) -> System.out.println(k + ": " + v));
		LocalDate date = LocalDate.parse("2022-04-20");
		List<Product> freshstock = productMap.values().stream().filter(p -> p.getManufactureDate().isAfter(date))
				.collect(Collectors.toList());// collecting in list of filtered products
		System.out.println("freshstock");
//		freshstock.forEach(p -> System.out.println(p));
		freshstock.forEach(System.out::println);// method referencing --further optimized
	}
}
