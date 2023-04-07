package date;
import java.time.*;
import java.util.Scanner;
public class Adddays {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter offset days");
		
		System.out.println(LocalDate.now().plusDays(sc.nextLong()));
		System.out.println(LocalDate.now().minusDays(sc.nextLong()));
	}
	}

}
