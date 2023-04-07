package tester;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/*Obj: Solve 
1.2 Suppose you have product details in a list/map. 
Can you store these details sorted as per price in a text file , 
in a buffered manner ?
DO not mix up collection code along with I/O
Create separate classes.
*/
import java.util.Scanner;

import com.shop.core.Product;

import utils.IOUtils;
import utils.ShopUtils;
import utils.SortData;

public class SaveSortedProductDetails {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			// get sample details
			List<Product> productlist = ShopUtils.populateProductList();
			System.out.println("Raw product list");
			productlist.forEach(System.out::println);

			// accept
			System.out.println(
					"enter the file name in which sorted data is to be stored");
			String fileName = sc.next();

			// Sorting
			SortData.sort(productlist, fileName);

			// Invoking IOUtils for writing to file
			IOUtils.storeProducts(productlist, fileName);
			System.out.println("products stored");

		} // end of try
		catch (Exception e) {
			e.printStackTrace();

		} // end of catch

	}// end of main

}// end of SaveSortedProductDetails
