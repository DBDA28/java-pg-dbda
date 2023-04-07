package tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.app.core.Vehicle;
import com.custom_ordering.VehicleDatePriceComparator;
import com.custom_ordering.VehiclePriceComparator;

import custom_exception.InvalidVehicleDetailsException;
import utils.ValidationRules;
import static utils.CollectionUtils.populateShowroom;

public class ShowroomManagement {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// get populated AL , to store Vehicle type refs.
			ArrayList<Vehicle> showroom = populateShowroom();
			boolean exit = false;

			while (!exit) {
				System.out.println(
						"1. Add Vehicle 2.Display all vehicles 3.Get Vehicle Details 4. update price 5. remove vehicle 6.Discount 7. sort the vehicles 8.custom order  0.Exit");
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
						System.out.println("Enter chasis no of vehicle to be removed");
						index = showroom.indexOf(new Vehicle(sc.next()));
						if (index == -1)
							throw new InvalidVehicleDetailsException(
									"Invalid chasis no , Vehicle not found, can't cannot delete the vehicle!!!!");
						System.out.println("Deleted vehicle" + showroom.remove(index));
						break;

//					case 6:
//						System.out.println("Enter date and Discount Amount");
//						LocalDate date = validateManufacturingDate(sc.next());
//						double discount = sc.nextDouble();
//						for (Vehicle.vehicle : showroom)
//							if() {
//								
//							}
//						break;
					case 7:
						System.out.println("sorterd vehicles");
						Collections.sort(showroom);
						break;

					case 8:
						System.out.println("custom sort");
						//API of Collections class
						//public static void sort(List<T> list, Comparator<T> comp)
						Collections.sort(showroom, new VehiclePriceComparator());;
					case 10:
						System.out.println("Sort with Date and price");
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
