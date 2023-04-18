package tester;

import java.util.List;

import com.shop.core.Product;
import static utils.ShopUtils.populateProductList;

import utils.ShopUtils;

public class Test7 {

	public static void main(String[] args) {
		// get product list from the utils
		List<Product> productList = populateProductList();
		//display the product list : using forEach 
		//Is List Iterable ? YES
		//Iterable i/f : public void forEach(Consumer<? super T> consumer)
		//Consumer : Func i/f --java.util.function
		//SAM : public void accept(T o)
		//Meaning => performs given action on each element
		productList.forEach(product -> System.out.println(product));
		

	}

}
