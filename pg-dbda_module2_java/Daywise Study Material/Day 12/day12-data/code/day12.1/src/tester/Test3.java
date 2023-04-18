package tester;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.shop.core.Product;
import static utils.ShopUtils.populateProductList;

import utils.ShopUtils;

public class Test3 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// get product list from the utils
			List<Product> productList = populateProductList();
			productList.forEach(product -> System.out.println(product));
			// accept date from user
			// remove all products , manufactured before specified date
			System.out.println("Enter date(yr-mon-day)");
			LocalDate date = LocalDate.parse(sc.next());
			productList.removeIf(p -> p.getManufactureDate().isBefore(date));
			System.out.println("list after remove");
			productList.forEach(product -> System.out.println(product));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
