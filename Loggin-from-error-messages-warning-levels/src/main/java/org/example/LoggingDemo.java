package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingDemo {

    // Create Logger
    private static final Logger logger =
            LoggerFactory.getLogger(LoggingDemo.class);

    public static void main(String[] args) {

        logger.info("Application Started");

        int age = 15;

        if (age < 18) {
            logger.warn("User is under 18 years old.");
        }

        try {

            int result = 10 / 0;

        } catch (ArithmeticException e) {

            logger.error("Arithmetic Exception Occurred!", e);

        }

        logger.info("Application Finished");
    }
}