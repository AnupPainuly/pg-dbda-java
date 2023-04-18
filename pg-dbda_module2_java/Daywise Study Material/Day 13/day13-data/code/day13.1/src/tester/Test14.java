package tester;

import java.util.List;
import java.util.Scanner;

import com.shop.core.Category;
import com.shop.core.Product;
import static utils.ShopUtils.populateProductList;

import utils.ShopUtils;

public class Test14 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// get product list from the utils
			List<Product> productList = populateProductList();
			productList.stream()// Stream<Product> : src
					.forEach(p -> System.out.println(p));// terminal op.
			/*
			 * Prompt user for category n discount. Apply that discount on all products of
			 * specified category n print it.
			 */
			System.out.println("Enter category n discount");
			Category cat = Category.valueOf(sc.next().toUpperCase());
			double discount = sc.nextDouble();
			productList.stream().filter(p -> p.getProductCategory() == cat) // filtered strm of products
					.peek(p->p.setPrice(p.getPrice() - discount)).forEach(p -> {
						System.out.println(p);
					});

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
