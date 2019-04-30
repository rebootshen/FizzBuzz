package com.cg;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;

/**
 * Unit test for simple App.
 */
public class FizzBuzzTest {
    public static FizzBuzz fizzBuzz;

    @BeforeClass
    public static void setup() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void testIsDivisableBy3() {
        assertEquals(true, fizzBuzz.isDivisableBy3(3));
        assertEquals(false, fizzBuzz.isDivisableBy3(5));
        assertEquals(true, fizzBuzz.isDivisableBy3(15));
        assertEquals(false, fizzBuzz.isDivisableBy3(31));
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                assertEquals("i=" + i, true, fizzBuzz.isDivisableBy3(i));
            } else {
                assertEquals(false, fizzBuzz.isDivisableBy3(i));
            }
        }
    }

    @Test
    public void testIsDivisableBy5() {
        assertEquals(false, fizzBuzz.isDivisableBy5(3));
        assertEquals(true, fizzBuzz.isDivisableBy5(5));
        assertEquals(true, fizzBuzz.isDivisableBy5(15));
        assertEquals(false, fizzBuzz.isDivisableBy5(51));
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                assertEquals("i=" + i, true, fizzBuzz.isDivisableBy5(i));
            } else {
                assertEquals(false, fizzBuzz.isDivisableBy5(i));
            }
        }
    }

    @Test
    public void testHas3In() {
        assertEquals(true, fizzBuzz.has3In(3));
        assertEquals(true, fizzBuzz.has3In(13));
        assertEquals(true, fizzBuzz.has3In(31));
        assertEquals(false, fizzBuzz.has3In(50));
        for (int i = 1; i <= 100; i++) {
            if (i - i / 10 * 10 == 3) {
                assertEquals("i=" + i, true, fizzBuzz.has3In(i));
            } else if (i / 10 == 3) {
                assertEquals(true, fizzBuzz.has3In(i));
            } else {
                assertEquals(false, fizzBuzz.has3In(i));
            }
        }
    }

    @Test
    public void testHas5In() {

        assertEquals(false, fizzBuzz.has5In(3));
        assertEquals(true, fizzBuzz.has5In(5));
        assertEquals(true, fizzBuzz.has5In(25));
        assertEquals(true, fizzBuzz.has5In(52));
        for (int i = 1; i <= 100; i++) {
            if (i - i / 10 * 10 == 5) {
                assertEquals("i=" + i, true, fizzBuzz.has5In(i));
            } else if (i / 10 == 5) {
                assertEquals(true, fizzBuzz.has5In(i));
            } else {
                assertEquals(false, fizzBuzz.has5In(i));
            }
        }
    }

    @Test
    public void printFizzBuzz() {
        fizzBuzz.printFizzBuzz(100);
    }

}
