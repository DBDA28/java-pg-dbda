package tester;

import java.util.List;
import com.shop.core.*;
import java.util.Scanner;
import utils.ShopUtils;

public class test1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// get product list from the utils
			List<Product> productList = ShopUtils.populateProductList();
			System.out.println("original product list");
			productList.forEach(p -> System.out.println(p));
			// accept product category from the user.
			// remove all the products from the specified category
			// display the list again
			System.out.println("enter category");
			Category chosenCategory = Category.valueOf(sc.next().toUpperCase());
			// public boolean removeIf(Predicate<?super T> filter)
			// it will iterrate over the collection and remove the elements if it matches the
			// predicate/filter
			// java.util.function.Predicate: functional i/f
			// SAM: public boolean test(T o)
			productList.removeIf(p -> p.getProductCategory() == chosenCategory);
			productList.forEach(p -> System.out.println(p));

		}
	}

}
