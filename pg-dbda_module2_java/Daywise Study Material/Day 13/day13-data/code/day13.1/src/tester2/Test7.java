package tester2;

import static utils.ShopUtils.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.shop.core.Category;
import com.shop.core.Product;

import custom_exceptions.ProductNotFoundException;


public class Test7 {

	public static void main(String[] args) {
		try {
			List<Product> productList = populateProductList();
			System.out.println("Shop products ");
			productList.forEach(System.out::println);// method reference
			Category cat = Category.valueOf("SPICES");
			 Product product=
					productList.stream()
					.filter(p -> p.getProductCategory() == cat)
					.findFirst() // Optional<Product>
					.orElseThrow(() -> new ProductNotFoundException("No product under category "+cat));
				System.out.println("1st product from " + cat + " category : "+product);

		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("main over...");

	}

}
