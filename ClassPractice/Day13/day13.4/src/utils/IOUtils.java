package utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.shop.core.Product;

public interface IOUtils {
	// add a static method to store filtered products in the text file
	static void storeProducts(List<Product> products, String file)
			throws IOException {
		// create chain of out streams
		// java App --> PW --> FW --> File
		try (PrintWriter pw = new PrintWriter(new FileWriter(file))) {
			products.forEach(pw::println);// p -> pw.println()
		} // end of try-with resources
	}// end of storeProducts method
}// end of IOUtils interface
