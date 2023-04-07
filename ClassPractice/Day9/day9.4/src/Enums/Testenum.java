package Enums;

import java.util.Scanner;

public class Testenum {

	public static void main(String[] args) {
		// Display all colors
		for (Color c : Color.values())
			System.out.println(c);
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Choose a color");
			Color chooseclr = Color.valueOf(sc.next().toUpperCase());
			System.out.println("You choose " + chooseclr.name() + " pos " + chooseclr.ordinal());
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("main over..");
	}

}
