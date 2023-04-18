package tester2;

import static utils.ShopUtils.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.shop.core.Product;

/*
 * 4. 
Display name of the cheapest product
 */
public class Test5 {

	public static void main(String[] args) {
		Map<Integer, Product> productMap = populateProductMap(populateProductList());
		System.out.println("Shop products ");
		productMap.forEach((k,v) -> System.out.println(v));
		String name=productMap.values()
		.stream() //Stream <Product>
		.min((p1,p2) -> ((Double)p1.getPrice()).compareTo(p2.getPrice())) //Optional<Product>
		.get() //Product
		.getName(); //product name
		System.out.println("Name of the cheapest product "+name);
				

		

	
	}

}
