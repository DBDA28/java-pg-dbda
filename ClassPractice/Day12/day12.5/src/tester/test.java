package tester;

import java.util.List;
import com.shop.core.Product;
import static utils.ShopUtils.*;

public class test {

	public static void main(String[] args) {
		// get product list from the utils
		List<Product> productList = populateProductList();
		// display the product list: using forEach
		//is List iterable? YES
		//Iterable i/f: public void forEach(Consumer<? Super T> consumer)
		//Consumer: Functional i/f -- java.util.function
		//SAM: public void accept(T o)
		//Meaning => performs given  action on each element
		productList.forEach(product -> System.out.println(product));
	}

}
