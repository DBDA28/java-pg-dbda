package com.char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class CopyTextFileFunc {
	public static void main(String[] args) {
		System.out.println(
				"Enter src file name and destination file name on separate lines");
		try (Scanner sc = new Scanner(System.in);
				// java App<--- BR <-- FR <--- src file
				BufferedReader br = new BufferedReader(
						new FileReader(sc.nextLine()));
				// java App---> PW --> FW ---> dest file
				PrintWriter pw = new PrintWriter(
						new FileWriter(sc.nextLine(), true));) {
			br.lines()// stream<String>
					.forEach(pw::println);
			System.out.println("reading over");

		} // end of try-with. JVM invokes auto: br.close(), sc.close()
		catch (Exception e) {
			e.printStackTrace();
		} // end of catch

	}// end of main

}// end of ReadTextFile class
