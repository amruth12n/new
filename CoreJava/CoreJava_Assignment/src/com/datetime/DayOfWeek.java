package com.datetime;

import java.time.LocalDate;
import java.util.Scanner;

public class DayOfWeek {
	
	private static String day_Of_Week(int year, int day, int month) {
			
		return String.valueOf(LocalDate.of(year, month, day).getDayOfWeek());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Year: "); int year = sc.nextInt();
		System.out.print("Enter day: "); int day = sc.nextInt();
		System.out.print("Enter month: "); int month = sc.nextInt();
		try {
			System.out.println("Day of the Week "+day_Of_Week(year,day,month));
		}
		catch(Exception e) {
			System.out.println("Error: "+ e.getMessage());
		}
		sc.close();

	}

}
