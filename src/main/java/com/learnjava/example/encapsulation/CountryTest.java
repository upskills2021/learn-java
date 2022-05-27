package com.learnjava.example.encapsulation;

public class CountryTest {
    public static void main(String[] args) {
        Country country = new Country();
        country.setName("India");
        country.setCurrency("INR");
        String countryInformation = country.toString();
        System.out.println("Country Information :: " + countryInformation);
    }
}
