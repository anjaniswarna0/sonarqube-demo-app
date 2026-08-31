package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    @Test
    void shouldAddTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void shouldSubtractTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    void shouldMultiplyTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    void shouldDivideTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(6, 3));
    }

    @Test
    void shouldThrowExceptionWhenDividingByZero() {
        Calculator calculator = new Calculator();

        assertThrows(
            IllegalArgumentException.class,
            () -> calculator.divide(6, 0)
        );
    }

    @Test
    void shouldSquareNumber() {
        Calculator calculator = new Calculator();
        assertEquals(25, calculator.square(5));
    }
}