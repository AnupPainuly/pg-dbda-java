package tester2;
import static utils.ShopUtils.*;

import java.util.Map;

import com.shop.core.Product;

public class Test2 {

	public static void main(String[] args) {
		Map<Integer, Product> productMap = populateProductMap(populateProductList());
		//use forEach to display map entries
		//public void forEach(BiConsumer<? super K,? super V> action)
		//specified action is applied to each entry in the map
		//BiConsumer : func i/f
		System.out.println("original map");
		productMap.forEach((k,v) ->System.out.println(k+" : "+v));
		double discount=20;
		System.out.println("map after discount");
		//apply discount on all the products
		productMap.values() //Collection<Product>
		.stream() //Stream<Product>
		.peek(p -> p.setPrice(p.getPrice()-discount)) //discounted Stream<Product>
		.forEach(p -> System.out.println(p));//terminal op
		
		
	
	

	}

}
