package tester;

import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

import com.shop.core.Category;
import com.shop.core.Product;
import static utils.ShopUtils.populateProductList;

import utils.ShopUtils;

/*
 * Display average of prices of all the products under specified category
 */
public class Test12 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// get product list from the utils
			List<Product> productList = populateProductList();
			System.out.println("original product list");
			productList.forEach(p -> System.out.println(p));
			// accept product category from user.
			// remove all the products from the specified category
			// display the list again
			System.out.println("Enter category");
			Category chosenCategory = Category.valueOf(sc.next().toUpperCase());
			// stream, filter,mapToDouble,sum
			OptionalDouble optional= productList.stream().
					filter(p -> p.getProductCategory() == chosenCategory)
					.mapToDouble(p -> p.getPrice()).
					average();
			if(optional.isPresent())
				System.out.println("Avg of prices of all products with Category " + chosenCategory + "=" +optional.getAsDouble());
			else
				System.out.println("No products under the category "+chosenCategory);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
