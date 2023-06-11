package com.tester;

import java.util.ArrayList;
import java.util.Scanner;

import com.core.app.Product;
import com.custom_exception.ProductHandlingException;
import com.utils.IOUtils;
import com.utils.ShopUtils;

public class Tester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			ArrayList<Product> prodList = new ArrayList<Product>();
			boolean exit = false;
			while (!exit) {
				System.out.println("1. Show the list of products");
				System.out.println("2. add content to the cart");
				System.out.println("3. show content of the cart");
				System.out.println("4. write the product list to the binary file");
				switch (sc.nextInt()) {
				case 1:// show the product from the map
					ShopUtils.displayProductList(ShopUtils.productMap);
					break;
				case 2:// add content to product cart
					System.out.println("enter product id");
					int id = sc.nextInt();
					Product productToAdd = ShopUtils.productMap.get(id);
					if (productToAdd == null) {
						try {
							throw new ProductHandlingException("Empty");
						} // end of try
						catch (ProductHandlingException e) {
							System.out.println(e.getMessage());
						} // end of catch
					} // end of if
					else {
						prodList.add(productToAdd);
						System.out.println("prod added to the cart");
					} // end of else
					break;
				case 3:
					System.out.println("product list content");
					if (prodList.isEmpty()) {
						System.out.println("the cart is empty");
					} // end of if
					for (Product prod : prodList) {
						System.out.println(prod);
					} // end of for
					break;

				case 4: // write the list to binary file
					System.out.println("enter file name");
					String fileName = sc.next();
					IOUtils.writeData(prodList, fileName);
					System.out.println("save succesfully");
					exit = true;
					break;

				}// end of switch
			} // end of while
		} // end of try with
		catch (Exception e) {
			e.printStackTrace();
		} // end of catch
		System.out.println("main over");
	}// end of main
}// end of tester class
