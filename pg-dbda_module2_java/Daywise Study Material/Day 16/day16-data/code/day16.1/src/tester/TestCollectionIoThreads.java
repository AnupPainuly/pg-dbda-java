package tester;

import java.util.Map;
import java.util.Scanner;

import com.shop.core.Product;

import runnable_tasks.DateBasedSorter;
import runnable_tasks.PriceBasedSorter;

import static utils.ShopUtils.*;

public class TestCollectionIoThreads {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// get sample data
			Map<Integer, Product> productMap = populateProductMap(populateProductList());
			// prompt for file names
			System.out.println("Enter file name to store the products sorted as per price");
			String fileName1 = sc.next();
			System.out.println("Enter file name to store the products sorted as per date");
			String fileName2 = sc.next();
			// create child threads
			// Thread(Runnable instance,String nm)
			Thread t1 = new Thread(new PriceBasedSorter(productMap, fileName1), "price_sorter");
			Thread t2=new Thread(new DateBasedSorter(productMap, fileName2), "date_sorter");
			t1.start();
			t2.start();
			System.out.println("waiting for child thrds....");
			t1.join();
			t2.join();
			System.out.println("main over....");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
