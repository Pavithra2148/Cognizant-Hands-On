package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator;

    // Setup Method (Test Fixture)
    @BeforeEach
    void setUp() {
        System.out.println("Setting up Calculator object...");
        calculator = new Calculator();
    }

    // Arrange - Act - Assert Pattern
    @Test
    void testAddition() {

        // Arrange
        int a = 10;
        int b = 20;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(30, result);
    }

    @Test
    void testSubtraction() {

        // Arrange
        int a = 20;
        int b = 10;

        // Act
        int result = calculator.subtract(a, b);

        // Assert
        assertEquals(10, result);
    }

    @Test
    void testMultiplication() {

        // Arrange
        int a = 5;
        int b = 4;

        // Act
        int result = calculator.multiply(a, b);

        // Assert
        assertEquals(20, result);
    }

    @Test
    void testDivision() {

        // Arrange
        int a = 20;
        int b = 5;

        // Act
        int result = calculator.divide(a, b);

        // Assert
        assertEquals(4, result);
    }

    // Teardown Method
    @AfterEach
    void tearDown() {
        System.out.println("Cleaning up resources...");
        calculator = null;
    }
}