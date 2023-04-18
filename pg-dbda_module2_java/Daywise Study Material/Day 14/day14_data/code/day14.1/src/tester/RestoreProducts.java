package tester;

import static utils.ShopUtils.populateProductList;
import static utils.ShopUtils.populateProductMap;

import java.util.Map;
import java.util.Scanner;

import com.shop.core.Product;

import utils.IOUtils;

public class RestoreProducts {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 1 : get file name from user
			System.out.println("Enter file name to restore products");
			String fileName = sc.next();
			// 2. restore map of products in bin file : using de-serialization : I/O
			// IOUtils : i/f --add a static method
			Map<Integer, Product> data = IOUtils.restoreData(fileName);
			// display data
			data.forEach((k,v) -> System.out.println(v));
			System.out.println("data restored successfully!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over...");

	}

}
