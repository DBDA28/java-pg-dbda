package tester;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.shop.core.Product;

import utils.IOUtils;
import utils.ShopUtils;

public class SaveFilteredProductDetails {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 0.get sample details
			List<Product> productList = ShopUtils.populateProductList();
			System.out.println("All product list");
			productList.forEach(System.out::println);

			//3. accept inputs
			System.out.println("Enter min price and max price");
			double min = sc.nextDouble();
			double max = sc.nextDouble();
			System.out.println("enter file name");
			String fileName = sc.next();
			
			//2.Filter data and collect in a list
			List<Product> filteredProducts = productList.stream()
			.filter(p->p.getPrice()>min && p.getPrice()<max)//stream of filtered products
			.collect(Collectors.toList());
			//Invoke a static method of IOutils i/f, to store filter products in the text file
			IOUtils.storeProducts(filteredProducts, fileName);
			System.out.println("products stored");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
