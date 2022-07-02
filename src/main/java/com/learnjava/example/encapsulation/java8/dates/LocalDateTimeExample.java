package com.learnjava.example.encapsulation.java8.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Current System Date :: " + localDateTime);
        LocalDateTime localDateTime1 = LocalDateTime.of(2018, 01, 01, 12, 10, 10);
        System.out.println("LocalDateTime1 :: " + localDateTime1);

        /*
         * Getting Value from local date time
         */
        System.out.println("GetMinute :: " + localDateTime.getMinute());
        System.out.println("GetHour :: " + localDateTime.getHour());
        System.out.println("Day of Month :: " + localDateTime.get(ChronoField.DAY_OF_MONTH));

        /*
         * Modifying LocalDateTime
         */
        System.out.println("Plus Days :: " + localDateTime.plus(1, ChronoUnit.DAYS));
        System.out.println("Plus Week :: " + localDateTime.plus(1, ChronoUnit.WEEKS));
        System.out.println(" with month :: " + localDateTime.withMonth(2));
        System.out.println("First Day of next month :: " + localDateTime.with(TemporalAdjusters.firstDayOfNextMonth()));

        /*
         * Convert LocalDate,LocalTime to LocalDateTime
         */
        LocalDate localDate = LocalDate.now();
        System.out.println("atTime : " + localDate.atTime(23, 30));

        LocalTime localTime = LocalTime.now();
        System.out.println("atDate :: " + localTime.atDate(localDate));
        System.out.println("startOfDay :: " + localDate.atStartOfDay());

        System.out.println("toLocalDate :: " + localDateTime.toLocalDate());
        System.out.println("toLocalTime :: " + localDateTime.toLocalTime());
    }
}
