package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SqrtTest {

    private static final double EPS = 1e-6;

    @Test
    public void testAverage() {
        Sqrt s = new Sqrt(0);
        assertEquals(5.0, s.average(4.0, 6.0), EPS);
        assertEquals(0.0, s.average(-3.0, 3.0), EPS);
    }

    @Test
    public void testGood() {
        Sqrt s = new Sqrt(0);
        assertTrue(s.good(3.0, 9.0));
        assertFalse(s.good(2.0, 9.0));
        assertTrue(s.good(2.000000001, 4.0));
    }

    @Test
    public void testImprove() {
        Sqrt s = new Sqrt(0);
        assertEquals(1.5, s.improve(1.0, 2.0), EPS);
        assertEquals(3.0, s.improve(3.0, 9.0), EPS);
    }

    @Test
    public void testIter() {
        Sqrt s = new Sqrt(0);
        assertEquals(2.0, s.iter(2.0, 4.0), EPS);
        assertEquals(3.0, s.iter(1.0, 9.0), EPS);
    }

    @Test
    public void testCalcPerfectSquares() {
        assertEquals(2.0, new Sqrt(4.0).calc(), EPS);
        assertEquals(4.0, new Sqrt(16.0).calc(), EPS);
        assertEquals(10.0, new Sqrt(100.0).calc(), EPS);
    }

    @Test
    public void testCalcIrrational() {
        assertEquals(Math.sqrt(2.0), new Sqrt(2.0).calc(), EPS);
        assertEquals(Math.sqrt(7.0), new Sqrt(7.0).calc(), EPS);
    }

    @Test
    public void testCalcOne() {
        assertEquals(1.0, new Sqrt(1.0).calc(), EPS);
    }
}
