package ch.csbe.modul404;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @AfterEach
    public void takedown() {
        System.out.println("Runs after each Teste Method");
    }

    @BeforeEach
    void init() {
         calculator = new Calculator();
    }

    @Test
    public void  testAdd(){
        var calculator = new Calculator();
        assertEquals(4, calculator.add(2,2));
    }

    @Test
    public void testMultiply(){
      assertEquals(6, calculator.multiply(2,3));
    }
}
