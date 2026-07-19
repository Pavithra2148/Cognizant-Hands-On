package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CountryService {

    public Country getCountry() {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        return context.getBean("country", Country.class);

    }

}