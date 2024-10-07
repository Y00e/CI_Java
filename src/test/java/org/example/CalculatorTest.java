package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {

        // given
        Calculator calc = new Calculator();

        //when
        int result = calc.add(3, 5);

        //then
        assertEquals(8, result);
    }

    @Test
    void subtract() {

        Calculator calc = new Calculator();

        //when
        int result = calc.subtract(3, 5);

        //then
        assertEquals(8, result);
    }
}