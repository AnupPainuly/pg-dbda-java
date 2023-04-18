package tester;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.shop.core.Product;
import static utils.ShopUtils.populateProductList;

import utils.ShopUtils;

public class Test4 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// get product list from the utils
			List<Product> productList = populateProductList();
			productList.forEach(product -> System.out.println(product));
			// sort the product list as per date
			// Collections.sort(List<T> list,Comparator<? super T> comp)
			// Since Comparator is a func i/f , can it be replace by a lambda expr ? YES
			// SAM : public int compare(T o1,T o2)
			Comparator<Product> productComp=(p1, p2) -> p1.getManufactureDate().compareTo(p2.getManufactureDate());
			Collections.sort(productList,productComp);
			System.out.println("Sorted list");
			productList.forEach(product -> System.out.println(product));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
