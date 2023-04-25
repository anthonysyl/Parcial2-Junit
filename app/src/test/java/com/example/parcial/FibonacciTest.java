package com.example.parcial;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibonacciTest {
    @Test
    public void testcalcularFibonacci()
    {
        MainActivity mainActivity = new MainActivity();
        assertEquals(0, mainActivity.fibonacci(0));
        assertEquals(1, mainActivity.fibonacci(1));
        assertEquals(1, mainActivity.fibonacci(2));

    }

}
