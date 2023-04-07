package date;

import java.time.*;
import java.util.Scanner;
public class AgeCalc {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter your DoB yyyy-mm-dd");
			LocalDate dob = LocalDate.parse(sc.next());
			int age = Period.between(dob, LocalDate.now()).getYears();
			System.out.println(age);
			
			System.out.println();
	}

}
}