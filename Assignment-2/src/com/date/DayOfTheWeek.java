package com.date;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DayOfTheWeek {

    public static void main(String[] args) {
        String dateString = "2003-05-21";

        String dayOfTheWeek = getDayOfTheWeek(dateString);
        System.out.println("Day of the week for " + dateString + " is: " + dayOfTheWeek);
    }

    public static String getDayOfTheWeek(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate date = LocalDate.parse(dateStr, formatter);

        DayOfWeek dayOfWeek = date.getDayOfWeek();

        return dayOfWeek.toString();
    }
}
