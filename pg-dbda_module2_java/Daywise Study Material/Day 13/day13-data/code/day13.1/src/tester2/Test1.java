package tester2;
import static utils.ShopUtils.*;

import java.util.Map;

import com.shop.core.Product;

public class Test1 {

	public static void main(String[] args) {
		Map<Integer, Product> productMap = populateProductMap(populateProductList());
		//use forEach to display map entries
		//public void forEach(BiConsumer<? super K,? super V> action)
		//specified action is applied to each entry in the map
		//BiConsumer : func i/f
		System.out.println("original map");
		productMap.forEach((k,v) ->System.out.println(k+" : "+v));
		double discount=20;
		//apply discount on all the products
		productMap.forEach((k,v) -> v.setPrice(v.getPrice()-discount));
		
		System.out.println("map after discount");
		productMap.forEach((k,v) ->System.out.println(k+" : "+v));
	

	}

}
