package tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.app.core.Vehicle;

import custom_exception.InvalidVehicleDetailsException;
import custom_ordering.VehicleDatePriceComparator;
import custom_ordering.VehiclePriceComparator;
import utils.ValidationRules;
import static utils.CollectionUtils.populateShowroom;
import static utils.ValidationRules.*;

public class ShowroomManagement {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// get populated AL , to store Vehicle type refs.
			ArrayList<Vehicle> showroom = populateShowroom();
			boolean exit = false;

			while (!exit) {
				System.out.println("1. Add Vehicle 2.Display all vehicles 3.Get Vehicle Details "
						+ "4.Update Price  5.Delete Vehicle details 6. Apply Disocunt  7. Sort vehicles as per ch no"
						+ "8. Sort Vehicles as per asc order of price 9. Sort as per date n price  0.Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println(
								"Enter vehicle details : chasisNo,  vehicleColor,  basePrice,  manufactureDate,  company");
						Vehicle validVehicle = ValidationRules.validateAllInputs(sc.next(), sc.next(), sc.nextDouble(),
								sc.next(), sc.next(), showroom);
						showroom.add(validVehicle);
						System.out.println("Vehicle added .....");
						break;
					case 2:
						System.out.println("Showroom details");
						for (Vehicle v : showroom)
							System.out.println(v);
						break;
					case 3:
						/*
						 * Fetch Vehicle details from AL i/p : PK (chasis no) o/p : in case of success :
						 * display vehicle details o.w throw custom exception
						 */
						System.out.println("Enter chasis no");
						int index = showroom.indexOf(new Vehicle(sc.next()));
						if (index == -1)
							throw new InvalidVehicleDetailsException("Invalid chasis no , Vehicle not found!!!!!!!");
						// =>
						System.out.println(showroom.get(index));
						break;
					case 4:
						/*
						 * 5. Update Vehicle price i/p : chasis no & new price o/p : in case of success
						 * : update vehicle details o.w throw custom exception
						 * 
						 * 
						 */
						System.out.println("Enter chasis no n new price");
						index = showroom.indexOf(new Vehicle(sc.next()));
						double price = sc.nextDouble();
						if (index == -1)
							throw new InvalidVehicleDetailsException(
									"Invalid chasis no , Vehicle not found, can't update the price!!!!");
						// vehicle found , update the price
						Vehicle v = showroom.get(index);
						v.setBasePrice(price + v.getVehicleColor().getColorCost());
						System.out.println("Price updated for the vehicle with chasis no" + v.getChasisNo());
						break;
					case 5:
						System.out.println("Enter chasis no for a vehicle to be removed");
						index = showroom.indexOf(new Vehicle(sc.next()));
						if (index == -1)
							throw new InvalidVehicleDetailsException(
									"Invalid chasis no , Vehicle not found, can't delete vehicle details!!!!");
						// => vehicle found
						System.out.println("Deleted vehicle " + showroom.remove(index));
						break;
					/*
					 * 7. Apply discount to all vehicles manufactured before a specific date i/p :
					 * date n discount
					 */
					case 6:
						System.out.println("Enter date (yr-mon-day) n discount amount");
						LocalDate date = validateManufacturingDate(sc.next());
						double discount = sc.nextDouble();
						for (Vehicle vehicle : showroom)
							if (vehicle.getManufactureDate().isBefore(date)) {
								vehicle.setBasePrice(vehicle.getBasePrice() - discount);
								System.out.println("Updated base price of vehicle with ch no " + vehicle.getChasisNo());
							}
						break;
					case 7:
						System.out.println("Sorted vehicles as per chasis no");
						Collections.sort(showroom);
						break;
					case 8 :
						System.out.println("Sorted vehicles as per desc price ");
						//API of Collections class
						//public static void sort(List<T> list,Comparator<T> comp)
						Collections.sort(showroom, new VehiclePriceComparator());
						break;
					case 9 : System.out.println("Sorted vehicles as per date n price ");
					Collections.sort(showroom, new VehicleDatePriceComparator());
						break;
					case 0:
						exit = true;
						break;

					}
				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();// to read off all pending tokens from the scanner
				}
			}
		}
//		} catch (Exception e) {
//			// TODO: handle exception
//		}

	}

}
