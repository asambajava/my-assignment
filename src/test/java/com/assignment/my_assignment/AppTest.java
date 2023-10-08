package com.assignment.my_assignment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void testSum() {
    	Calculator calc = new Calculator();
    	assertEquals(100, calc.sum(50,50));
    }
    @Test
    public void testSub() {
    	Calculator calc = new Calculator();
    	assertEquals(0, calc.subtract(50,50));
    }
    @Test
    public void testMultiply() {
    	Calculator calc = new Calculator();
    	assertEquals(1500, calc.multiply(30,50));
    }
}
