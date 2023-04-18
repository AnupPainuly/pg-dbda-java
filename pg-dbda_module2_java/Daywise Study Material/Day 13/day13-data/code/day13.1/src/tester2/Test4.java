package tester2;

import static utils.ShopUtils.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.shop.core.Product;

/*
 * 4. 
Filter all the products manufactured after specific date n add it in another  list by the name freshStock
i/p : date
LocalDate dt=LocalDate.parse(sc.next());
 */
public class Test4 {

	public static void main(String[] args) {
		Map<Integer, Product> productMap = populateProductMap(populateProductList());
		LocalDate date = LocalDate.parse("2022-04-20");

		List<Product> freshStock = productMap.values() // Collection<Product>
				.stream() // Stream<Product>
				.filter(p -> p.getManufactureDate().isAfter(date)) // filtered Stream<Product>
				.collect(Collectors.toList());// collecting in List of filtered products : terminal op
		// stream --> collection

		System.out.println("Fresh stock");
		freshStock.forEach(System.out::println);// method reference --further optimization to lambda expr : p ->
												// System.out.println(p)

	}

}
