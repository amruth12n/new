package com.time;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AgeCalculator {
    public static void main(String[] args) {
        String birthdate = "2000-07-22";
        calculateAge(birthdate);
    }

    public static void calculateAge(String birthdate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); 
        LocalDate birthDate = LocalDate.parse(birthdate, formatter);
        
        LocalDate currentDate = LocalDate.now();
        
        Period period = Period.between(birthDate, currentDate);
        
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();
        
        System.out.println("Age: " + years + " years, " + months + " months, and " + days + " days.");
    }
}
