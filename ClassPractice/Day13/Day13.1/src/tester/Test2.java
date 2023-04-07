package tester;

import static utils.ShopUtils.populateProductList;
import static utils.ShopUtils.populateProductMap;

import java.util.Map;

import com.shop.core.Product;

public class Test2 {

	public static void main(String[] args) {
		Map<Integer, Product> productMap = populateProductMap(populateProductList());
		System.out.println("Original map");
		productMap.forEach((k, v) -> System.out.println(k + ": " + v));
		double discount =20;
		//apply discount 
		productMap.values()//collection of product
		.stream()
		.peek(p -> p.setPrice(p.getPrice()-discount))//discounted Stream<Product>
		.forEach(p -> System.out.println(p));
		
	}

}
