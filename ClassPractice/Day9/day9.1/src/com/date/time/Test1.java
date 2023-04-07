package com.date.time;

import java.time.*;
import java.util.Scanner;
public class Test1 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("current date "+LocalDate.now());
			System.out.println("current time "+LocalTime.now());
			System.out.println("current date & time "+LocalDateTime.now());
			System.out.println("insert  date ");
			LocalDate joinDate=LocalDate.of(sc.nextInt(),sc.nextInt() , sc.nextInt());
			System.out.println(joinDate);
			System.out.println("Enter Date in String format yyyy-mm-dd");
			LocalDate dt=LocalDate.parse(sc.next());
			System.out.println(dt);
			System.out.println(joinDate.isBefore(dt));
			System.out.println(joinDate.compareTo(dt));
			}

	}

}
