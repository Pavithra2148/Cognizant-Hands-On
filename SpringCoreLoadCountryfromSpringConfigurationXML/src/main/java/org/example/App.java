package org.example;

public class App {

    public static void main(String[] args) {

        CountryService service = new CountryService();

        Country country = service.getCountry();

        System.out.println(country);

    }

}