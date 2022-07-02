package com.learnjava.example.encapsulation.java8.dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateExample {
    public static void main(String[] args) {
        String date = "2018-03-03";
        LocalDate localDate = LocalDate.parse(date);
        System.out.println(localDate);
        LocalDate localDate1 = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(localDate1);
        String isoDate = "20180428";
        System.out.println("Basic ISO Date :: " + LocalDate.parse(isoDate, DateTimeFormatter.BASIC_ISO_DATE));

        String date1 = "2018|01|01";
        DateTimeFormatter dft = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate localeDate2 = LocalDate.parse(date1, dft);
        System.out.println(localeDate2);


        System.out.println(LocalDate.now().format(dft));
    }
}
