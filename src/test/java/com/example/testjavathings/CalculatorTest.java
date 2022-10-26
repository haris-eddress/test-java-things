package com.example.testjavathings;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void twoPlusTwoShouldEqualsFour() {
        int result = calculator.add(2, 2);
        assertEquals(4, result);
    }

    @Test
    void adding3Plus7shouldResult10() {
        int result = calculator.add(3, 7);
        assertEquals(10, result);
    }

    @BeforeEach
    void setUp() {
        System.out.println("Setup method");
    }

    @AfterEach
    void tearDown() {
        System.out.println("tear down method");
    }
}













