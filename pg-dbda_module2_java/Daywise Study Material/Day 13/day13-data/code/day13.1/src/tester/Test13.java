package tester;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.shop.core.Product;
import static utils.ShopUtils.populateProductList;

import utils.ShopUtils;

public class Test13 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// get product list from the utils
			List<Product> productList = populateProductList();
			productList.forEach(product -> System.out.println(product));
			// sort the product list as per date ndisplay sorted products
			Comparator<Product> productComp = (p1, p2) -> p1.getManufactureDate().compareTo(p2.getManufactureDate());
			System.out.println("sorted list as per date");
			productList.stream()
			.sorted(productComp)
			.forEach(p ->System.out.println(p));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
