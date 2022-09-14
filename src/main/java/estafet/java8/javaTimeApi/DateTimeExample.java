package org.estafet.java8.javaTimeApi;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        //current date
        System.out.println("current date: " + dateTime);
        //current year
        System.out.println("current year: " + dateTime.getYear());
        //current month
        System.out.println("current month: "+ dateTime.getMonth());
        //current day
        System.out.println("current day: " + dateTime.getDayOfMonth());
        //current hour
        System.out.println("current hour: " + dateTime.toLocalTime().getHour());
        //Change the date format to: e.g. "Dec 8, 2020 13:07:52"
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("MMM dd, uuuu HH:MM:SS")));

    }
}
