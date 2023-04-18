package tester;

import java.util.Map;
import java.util.Scanner;

import com.shop.core.Product;

import custom_exceptions.ProductNotFoundException;

import static utils.IOUtils.*;

public class TestProducts {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter file name");
			String fileName = sc.next();
			boolean exit = false;
			// restore the products (either from hard coded data OR file)
			Map<Integer, Product> productMap = restoreData(fileName);
			while (!exit) {
				System.out.println("Options 1. Display 2.Remove 3.Exit");
				System.out.println("Enter option");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("All products");
						productMap.forEach((k, v) -> System.out.println(v));
						break;
					case 2:
						System.out.println("Enter product id , to remove");
						int productId = sc.nextInt();
						Product product = productMap.remove(productId);
						if (product == null)
							throw new ProductNotFoundException("Invalid product ID!!!!!!");
						// => product removed
						System.out.println("Removed " + product);
						break;

					case 3:
						exit = true;
						// store the products in bin file
						writeData(productMap, fileName);
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over....");
	}

}
