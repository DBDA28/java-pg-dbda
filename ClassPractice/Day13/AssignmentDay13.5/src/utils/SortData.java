package utils;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.shop.core.Product;

public class SortData {
	public static void sort(List<Product> productlist, String fileName) {
//		Comparator<Product> productComp = (p1, p2) -> p1.getPrice()
//				.compareTo(p2.getPrice());
//		Collections.sort(productlist, productComp);
//		System.out.println("Sorted list");
//		productlist.forEach(product -> System.out.println(product));
		List<Product> filteredProducList = productlist.stream()
				.filter(p -> p.getPrice()>0).sorted()
				.collect(Collectors.toList());
		System.out.println(filteredProducList);
	}// end of sort method

}// end of SortData class
