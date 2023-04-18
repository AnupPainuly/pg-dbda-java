package tester;

import java.util.List;
import java.util.Scanner;

import com.shop.core.Category;
import com.shop.core.Product;
import static utils.ShopUtils.populateProductList;

import utils.ShopUtils;

public class Test2 {

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
			// API : Collection i/f has a higher order function removeIf
			// public boolean removeIf(Predicate<? super T> filter)
			// It will iterate over the collection n remove the elems if it matches the
			// prdicate/filter
			// java.util.function.Predicate : func i/f
			// SAM : public boolean test(T o)
			productList.removeIf(p -> p.getProductCategory()==chosenCategory);
			System.out.println("product list after removal");
			productList.forEach(p -> System.out.println(p));
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
