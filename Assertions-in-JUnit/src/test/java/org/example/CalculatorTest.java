package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAssertions() {

        assertEquals(10, calculator.add(5, 5));

        assertNotEquals(15, calculator.add(5, 5));

        assertTrue(calculator.add(2, 3) == 5);

        assertFalse(calculator.subtract(5, 2) == 5);

        assertNotNull(calculator);

        Calculator c2 = calculator;

        assertSame(calculator, c2);

        Calculator c3 = new Calculator();

        assertNotSame(calculator, c3);

        int[] expected = {1,2,3};

        int[] actual = {1,2,3};

        assertArrayEquals(expected, actual);

        assertThrows(ArithmeticException.class, () -> {

            int x = 10 / 0;

        });

    }

}
