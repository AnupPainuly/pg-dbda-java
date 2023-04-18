package tester2;
import static utils.ShopUtils.*;

import java.time.LocalDate;
import java.util.Map;

import com.shop.core.Product;

public class Test3 {

	public static void main(String[] args) {
		Map<Integer, Product> productMap = populateProductMap(populateProductList());
		//use forEach to display map entries
		//public void forEach(BiConsumer<? super K,? super V> action)
		//specified action is applied to each entry in the map
		//BiConsumer : func i/f
		System.out.println("original map");
		productMap.forEach((k,v) ->System.out.println(k+" : "+v));
		LocalDate date=LocalDate.parse("2022-05-20");
		System.out.println("No of products produced after "+date+" :  "
		+productMap.values()
		.stream()
		.filter(p -> p.getManufactureDate().isAfter(date))
		.count());
		
	
	

	}

}
