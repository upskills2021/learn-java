package com.learnjava.example.encapsulation.java8.dates;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalDate localDate1 = LocalDate.of(2018, 03, 03);
        System.out.println(localDate1);
        System.out.println("Year End date :: " + LocalDate.ofYearDay(2018, 365));

        System.out.println(localDate.getMonth());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.getYear());
        System.out.println("Day of the month :: " + localDate.get(ChronoField.DAY_OF_MONTH));

        /*
            modifying local dates
         */

        System.out.println("plus week : " + localDate.plusWeeks(1));
        System.out.println("plus days : " + localDate.plusDays(1));
        System.out.println("Substract days : " + localDate.minus(1, ChronoUnit.MONTHS));
        System.out.println("last day of the month :: " + localDate.with(TemporalAdjusters.lastDayOfMonth()));
        System.out.println("First Friday in the month :: " + localDate.with(TemporalAdjusters.dayOfWeekInMonth(5, DayOfWeek.FRIDAY)));

        LocalDate localDate2 = LocalDate.of(2020, 01, 31);
        System.out.println("Leap year :: " + localDate2.isLeapYear());

        System.out.println("Is Before :: " + localDate.isBefore(localDate1));
        System.out.println("Is After :: " + localDate.isAfter(localDate1));
        System.out.println("Is equals :: " + localDate.isEqual(localDate1));

    }
}
