package tester;

import static utils.ShopUtils.populateProductList;
import static utils.ShopUtils.populateProductMap;

import java.util.Map;

import com.shop.core.Product;

public class Test {

	public static void main(String[] args) {
		Map<Integer, Product> productMap = populateProductMap(populateProductList());
		System.out.println("Original map");
		productMap.forEach((k, v) -> System.out.println(k + ": " + v));
		double discount =20;
		//apply discount 
		productMap.forEach((k,v) -> v.setPrice((v.getPrice()-discount)));
		System.out.println("after discount");
		productMap.forEach((k, v) -> System.out.println(k + ": " + v));

	}

}
