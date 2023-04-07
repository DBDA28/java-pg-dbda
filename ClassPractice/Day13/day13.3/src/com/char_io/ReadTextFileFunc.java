package com.char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class ReadTextFileFunc {
	public static void main(String[] args) {
		// reads data from the text file, using buffer, till EOF and prints the
		// same
		System.out.println("Enter the file name");
		try (Scanner sc = new Scanner(System.in);
				// Java App <--- BufferReader <--- FileReader <---Text File
				BufferedReader br = new BufferedReader(
						new FileReader(sc.nextLine()))) {
			br.lines().filter(line -> line.length() < 10)// Stream<String>
					.map(String::toUpperCase)
					.forEach(System.out::println);
			System.out.println("File reading over");

		} // end of try-with. JVM invokes auto: br.close(), sc.close()
		catch (Exception e) {
			e.printStackTrace();
		} // end of catch

	}// end of main

}// end of ReadTextFile class
