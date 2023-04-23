package com.tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.app.core.Book;

import cust_exc.BookHandlingException;

public class Tester {
	private static int shippingCost = 100;
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			ArrayList<Book> cart = new ArrayList<Book>();
			//creating HashMap to store the hard coded values of Books in the shop
			HashMap<String, Book> bookMap = new HashMap<String, Book>();
			bookMap.put("thewayofkings", new Book("Thewayofkings", "Brandon Sanderson", 500.13,LocalDate.parse("2020-01-01")));
			bookMap.put("wordsofradiance", new Book("Wordsofradiance", "Brandon Sanderson", 700.97, LocalDate.parse("2020-01-02")));
			bookMap.put("oathbringer", new Book("Oathbringer", "Brandon Sanderson", 600.04, LocalDate.parse("2020-01-03")));
			bookMap.put("rhythmofwar", new Book("Rhythmofwar", "Brandon Sanderson", 800.41, LocalDate.parse("2020-01-04")));

			//creating cart of ArrayList to store the books

			boolean flag = false;
			while (!flag) {
				System.out.println();
				System.out.println("**************************************");
				System.out.println("* Welcome to the Book Shop!          *");
				System.out.println("* Please select an option:           *");
				System.out.println("* 1. Display all books from the shop *");
				System.out.println("* 2. Add book to the cart            *");
				System.out.println("* 3. Show user cart contents         *");
				System.out.println("* 4. Remove book from the cart       *");
				System.out.println("* 5. Check out and exit              *");
				System.out.println("**************************************");

				try {
					//					int choice = sc.nextInt();
					/*nextLine() method of Scanner skips the console input, when we use it after next(), nextInt() and all nextXXX() methods.*/
					//					sc.nextLine(); //why the hell are you needed? arggh
					switch (sc.nextInt()) {
					case 1://print available books in the shop
						System.out.println("Available books:");
						for (Book book : bookMap.values()) {
							System.out.println(book);
						}
						break;
					case 2://add book to the cart
						System.out.println("Enter book title:");
						String title = sc.next().toLowerCase();
						Book bookToAdd = bookMap.get(title);
						if (bookToAdd == null) {
							try {
								throw new BookHandlingException("Book not available in the shop.");
							} catch (BookHandlingException e) {
								System.out.println(e.getMessage());
							}
						} else {
							cart.add(bookToAdd);
							System.out.println("Book added to the cart.");
						}
						break;
					case 3://show the cart content
						System.out.println("User cart contents:");
						if(cart.isEmpty()) {
							System.out.println("The cart is empty! what are you trying pull here? mmmh");
						}
						for (Book book : cart) {
							System.out.println(book);
						}
						break;
					case 4://remove book from the cart
						System.out.println("Enter book title");
						title =sc.next().toLowerCase();
						Book bookToRemove = null;
						for(Book book : cart) {
							System.out.println("debug1");
							if(book.getTitle().equals(title)) {
								bookToRemove = book;
								cart.remove(bookToRemove);
								System.out.println("debug");
								break;
							}
						}
						if(bookToRemove == null) {
							try {
								throw new BookHandlingException("unavailable");
							}
							catch (Exception e) {
								e.printStackTrace();
							}
						}
						break;
					case 5://exit
						if(cart.isEmpty()) {
							System.out.println("Buy something first for god sake.");
							flag=true;
						}//exit if the cart is empty
						else {
							System.out.println("check out details");
							double checkoutprice=0;
							for (Book book : cart) {
								if(book !=null) {
									System.out.println("Book Name- "+book.getTitle()+" "+book.getPrice()+" rs");
									checkoutprice+=book.getPrice()+shippingCost;
								}
							}
							System.out.println("Shipping Cost- "+shippingCost+" rs");
							System.out.println("The check out price for the selected books:"+checkoutprice);
							System.out.println("Thank you for shopping with Amajohn!\nDo not expect a delivery though");
							System.out.println();
						}//if cart is not empty show the check details
						flag=true;
						break;
					}//end of switch
				}//end of try
				catch(Exception e) {
					e.printStackTrace();
					sc.nextLine();//fix for reading pending scanner waiting for tokens. Causes the while to run indefinitely.
				}//end of catch block
			}//end of while
		}//end of try-with resources
	}//end of main
}//end of Tester class
