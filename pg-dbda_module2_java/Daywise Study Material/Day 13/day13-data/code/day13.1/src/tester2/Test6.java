package tester2;

import static utils.ShopUtils.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.shop.core.Category;
import com.shop.core.Product;

/*
 * 4. 
Display name of the cheapest product
 */
public class Test6 {

	public static void main(String[] args) {
		try {
			List<Product> productList = populateProductList();
			System.out.println("Shop products ");
			productList.forEach(System.out::println);// method reference
			Category cat = Category.valueOf("FRUITS");
			Optional<Product> optionalProduct = 
					productList.stream()
					.filter(p -> p.getProductCategory() == cat)
					.findFirst(); // Optional<Product>
			if (optionalProduct.isPresent())
				System.out.println("1st product from " + cat + " category : "+optionalProduct.get());
			else
				System.out.println("NO product under category "+cat);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("main over...");

	}

}
