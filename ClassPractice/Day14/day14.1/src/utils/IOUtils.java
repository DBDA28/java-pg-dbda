package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import com.shop.core.Product;
import static utils.ShopUtils.*;

public interface IOUtils {
	// add a static method to store product details in the binary file
	static void writeData(Map<Integer, Product> map, String fileName) throws IOException {
		// 1.create chain of i/o streams
		// Java App ---> OOS(bin) --> FOS ---> binary file
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
			// write the data
			out.writeObject(map);// serialization

		} // end of try catch method. //out.close --> fos.close ---> closes the file

	}// end of writeData method
		// add a static method to re store the products from the bin file

	@SuppressWarnings("unchecked")
	static Map<Integer, Product> restroredData(String fileName) throws IOException, ClassNotFoundException {
		// chain of streams for de-serial
		// Java App <--- OIS <---FIS <--- binary file
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
			return (Map<Integer, Product>) in.readObject();
		} // end of try-with
		catch (Exception e) {
			// file does not exist or some other run time error
			// return populate map to the caller
			System.out.println("in catch" + e);
			return ShopUtils.populateProductMap(populateProductList());

		}

	}

}// end of interface
