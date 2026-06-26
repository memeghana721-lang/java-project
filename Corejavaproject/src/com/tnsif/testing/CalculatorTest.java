package com.tnsif.testing;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void additionTest() {

        Calculator c = new Calculator();

        int result = c.add(2, 5);

        System.out.println("Addition result: " + result);

        assertEquals(7, result);
    }
}
