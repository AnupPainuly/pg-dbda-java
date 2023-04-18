package tester;

import java.sql.Date;
import java.util.Scanner;

import dao.UserDaoImpl;
import pojos.User;

public class TestUserCRUD {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// create dao instance
			UserDaoImpl dao = new UserDaoImpl();
			boolean exit = false;
			while (!exit) {
				System.out.println("Options 1. Get user details by ID 2. Get customers by date range "
						+ "3. Add user details 0.Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter user id ");
						User user = dao.getUserDetailsById(sc.nextInt());
						if (user != null)
							System.out.println("Details " + user);
						else
							System.out.println("Invalid user ID!!!!!!!!!!!!!");
						break;

					case 2:
						System.out.println("Enter begin reg date n end reg date");
						Date d1 = Date.valueOf(sc.next());
						Date d2 = Date.valueOf(sc.next());
						dao.getCustomersByRegDate(d1, d2).forEach(System.out::println);
						break;
					case 3:
						System.out.println("Enter user details : name,  email,  password,  regAmount,  regDate,  role");
						System.out.println("Reg status :"+dao.insertUserDetails(new User(sc.next(), sc.next(), sc.next(), sc.nextDouble(),
								Date.valueOf(sc.next()), sc.next())));
						break;

					case 0:
						exit = true;
						// clean up dao instance
						dao.cleanUp();
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

	}

}
