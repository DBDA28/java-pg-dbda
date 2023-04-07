package com.char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class ReadTextFile {
	public static void main(String[] args) {
		// reads data from the text file, using buffer, till EOF and prints the
		// same
		System.out.println("Enter the file name");
		try (Scanner sc = new Scanner(System.in);
				// Java App <--- BufferReader <--- FileReader <---Text File
				BufferedReader br = new BufferedReader(
						new FileReader(sc.nextLine()))) {
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			} // end of while
			System.out.println("File readeing over");

		} // end of try-with. JVM invokes auto: br.close(), sc.close()
		catch (Exception e) {
			e.printStackTrace();
		} // end of catch

	}// end of main

}// end of ReadTextFile class
