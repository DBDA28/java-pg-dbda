package tester;

import java.util.ArrayList;
import java.util.Scanner;

import com.app.core.Vehicle;

import custom_exception.InvalidVehicleDetailsException;
import utils.ValidationRules;

public class ShowroomManagement {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// create empty AL to store Vehicle type refs
			ArrayList<Vehicle> showroom = new ArrayList<Vehicle>(100);// size=0, init capa=100
			boolean exit = false;

			while (!exit) {
				System.out.println(
						"1. Add Vehicle 2.Display all vehicles 3.Fetch vehcile details from array list 0.Exit");
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
						System.out.println("enter the chasis no: ");
						String cn = sc.next();
						int index = showroom.indexOf(new Vehicle(cn));
						if (index == -1)// vehicle not found
							throw new InvalidVehicleDetailsException("Invalid chasis no vehicle no found");
						System.out.println(showroom.get(index));

						break;

					case 4:
						System.out.println("enter the chasis no: ");
						String cn1 = sc.next();
						int index2 = showroom.indexOf(new Vehicle(cn1));
						if (index2 == -1)// vehicle not found
							throw new InvalidVehicleDetailsException("Invalid chasis no vehicle no found, can ot update the price");
						System.out.println("enter the offset price");
						double price = sc.nextDouble();
						Vehicle v = showroom.get(index2);
						v.setBasePrice((price+v.getVehicleColor().getColorCost()));

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
