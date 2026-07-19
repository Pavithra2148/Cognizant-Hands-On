package org.example.service;

import org.example.model.Country;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CountryService {

    private static final Map<String, Country> countries = new HashMap<>();

    static {
        countries.put("IN", new Country("IN", "India"));
        countries.put("US", new Country("US", "United States"));
        countries.put("JP", new Country("JP", "Japan"));
        countries.put("UK", new Country("UK", "United Kingdom"));
    }

    public Country getCountry(String code) {
        return countries.get(code.toUpperCase());
    }
}