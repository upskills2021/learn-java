package com.learnjava.example.encapsulation.java8.dates;

import java.time.*;

public class ZoneTimeExample {
    public static void main(String[] args) {
        System.out.println(ZonedDateTime.now());
        ZoneOffset zoneOffset = ZonedDateTime.now().getOffset();
        //System.out.println("ZoneOffsets :: " + zoneOffset);
        ZoneId zoneId =  ZonedDateTime.now().getZone();
        //System.out.println("Zone id :: " + zoneId);
        // ZoneId.getAvailableZoneIds().forEach(System.out::println);

        // ZoneId -> America/Chicago

        ZonedDateTime currentTime = ZonedDateTime.now(ZoneId.of("America/Chicago"));
        System.out.println("Current Time :: " + currentTime);

        ZonedDateTime currentTimeNewYork = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Current Time :: " + currentTimeNewYork);
        ZonedDateTime currentTimeCalcutta = ZonedDateTime.now(ZoneId.of("Asia/Calcutta"));
        System.out.println("Current Time :: " + currentTimeCalcutta);
        Instant instant = Instant.now();

        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.UTC);
        System.out.println(offsetDateTime);
    }
}
