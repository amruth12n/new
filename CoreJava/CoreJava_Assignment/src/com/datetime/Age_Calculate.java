package com.datetime;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Age_Calculate {
	
	private static void calculateAge(int year, int day, int month, LocalDate ld) {
		
		LocalDate birthDay = LocalDate.of(year, month, day);
		int y = Period.between(birthDay, ld).getYears();
		int d = Period.between(birthDay, ld).getDays();
		int m = Period.between(birthDay, ld).getMonths();
		
		System.out.println("Current Age: "+y+" years "+m+" months "+d+" days");
	}

	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Year: "); int year = sc.nextInt();
		System.out.print("Enter day: "); int day = sc.nextInt();
		System.out.print("Enter month: "); int month = sc.nextInt();
		
		try {
			if(year>ld.getYear())
				System.out.println("Invalid!!");
			else
				calculateAge(year,day,month,ld);
		}
		catch(Exception e) {
			System.out.println("Error: "+ e.getMessage());
		}
		//System.out.println(ld);
		sc.close();

	}

	

}
