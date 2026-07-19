package org.example.controller;

import org.example.model.Country;
import org.example.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService service;

    @GetMapping("/{code}")
    public Country getCountry(@PathVariable String code) {
        return service.getCountry(code);
    }
}