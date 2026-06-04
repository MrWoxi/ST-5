package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SqrtTest {

    private static final double EPS = 1e-6;

    @Test
    public void averageBasic() {
        Sqrt s = new Sqrt(0);
        assertEquals(5.0, s.average(4.0, 6.0), EPS);
    }

    @Test
    public void averageEqual() {
        Sqrt s = new Sqrt(0);
        assertEquals(3.0, s.average(3.0, 3.0), EPS);
    }

    @Test
    public void averageNegative() {
        Sqrt s = new Sqrt(0);
        assertEquals(0.0, s.average(-3.0, 3.0), EPS);
    }

    @Test
    public void averageZero() {
        Sqrt s = new Sqrt(0);
        assertEquals(5.0, s.average(0.0, 10.0), EPS);
    }

    @Test
    public void goodTrue() {
        Sqrt s = new Sqrt(0);
        assertTrue(s.good(3.0, 9.0));
    }

    @Test
    public void goodFalse() {
        Sqrt s = new Sqrt(0);
        assertFalse(s.good(2.0, 9.0));
    }

    @Test
    public void goodNearDelta() {
        Sqrt s = new Sqrt(0);
        assertTrue(s.good(2.000000001, 4.0));
    }

    @Test
    public void goodFarFromDelta() {
        Sqrt s = new Sqrt(0);
        assertFalse(s.good(1.5, 4.0));
    }

    @Test
    public void improveBasic() {
        Sqrt s = new Sqrt(0);
        assertEquals(1.5, s.improve(1.0, 2.0), EPS);
    }

    @Test
    public void improveExact() {
        Sqrt s = new Sqrt(0);
        assertEquals(3.0, s.improve(3.0, 9.0), EPS);
    }

    @Test
    public void iterExactGuess() {
        Sqrt s = new Sqrt(0);
        assertEquals(2.0, s.iter(2.0, 4.0), EPS);
    }

    @Test
    public void iterConverges() {
        Sqrt s = new Sqrt(0);
        assertEquals(3.0, s.iter(1.0, 9.0), EPS);
    }

    @Test
    public void calcOne() {
        assertEquals(1.0, new Sqrt(1.0).calc(), EPS);
    }

    @Test
    public void calcFour() {
        assertEquals(2.0, new Sqrt(4.0).calc(), EPS);
    }

    @Test
    public void calcNine() {
        assertEquals(3.0, new Sqrt(9.0).calc(), EPS);
    }

    @Test
    public void calcSixteen() {
        assertEquals(4.0, new Sqrt(16.0).calc(), EPS);
    }

    @Test
    public void calcHundred() {
        assertEquals(10.0, new Sqrt(100.0).calc(), EPS);
    }

    @Test
    public void calcTwo() {
        assertEquals(Math.sqrt(2.0), new Sqrt(2.0).calc(), EPS);
    }

    @Test
    public void calcSeven() {
        assertEquals(Math.sqrt(7.0), new Sqrt(7.0).calc(), EPS);
    }

    @Test
    public void calcLarge() {
        assertEquals(100.0, new Sqrt(10000.0).calc(), EPS);
    }
}
