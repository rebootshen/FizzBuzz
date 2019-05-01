package com.cg;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class FizzBuzzTest {
    /**
     * .
     */
    private static FizzBuzz fizzBuzz;

    @BeforeClass
    public static void setup() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void testIsDivisableBy3() {
        assertEquals(true, fizzBuzz.isDivisableBy3(FizzBuzz.THREE));
        assertEquals(false, fizzBuzz.isDivisableBy3(FizzBuzz.FIVE));
        for (int i = 1; i <= FizzBuzz.MAX; i++) {
            if (i % FizzBuzz.THREE == 0) {
                assertEquals("i=" + i, true, fizzBuzz.isDivisableBy3(i));
            } else {
                assertEquals(false, fizzBuzz.isDivisableBy3(i));
            }
        }
    }

    @Test
    public void testIsDivisableBy5() {
        assertEquals(false, fizzBuzz.isDivisableBy5(FizzBuzz.THREE));
        assertEquals(true, fizzBuzz.isDivisableBy5(FizzBuzz.FIVE));
        for (int i = 1; i <= FizzBuzz.MAX; i++) {
            if (i % FizzBuzz.FIVE == 0) {
                assertEquals("i=" + i, true, fizzBuzz.isDivisableBy5(i));
            } else {
                assertEquals(false, fizzBuzz.isDivisableBy5(i));
            }
        }
    }

    @Test
    public void testHas3In() {
        assertEquals(true, fizzBuzz.has3In(FizzBuzz.THREE));
        for (int i = 1; i <= FizzBuzz.MAX; i++) {
            if (i - i / FizzBuzz.BASE * FizzBuzz.BASE == FizzBuzz.THREE) {
                assertEquals("i=" + i, true, fizzBuzz.has3In(i));
            } else if (i / FizzBuzz.BASE == FizzBuzz.THREE) {
                assertEquals(true, fizzBuzz.has3In(i));
            } else {
                assertEquals(false, fizzBuzz.has3In(i));
            }
        }
    }

    @Test
    public void testHas5In() {

        assertEquals(false, fizzBuzz.has5In(FizzBuzz.THREE));
        assertEquals(true, fizzBuzz.has5In(FizzBuzz.FIVE));
        for (int i = 1; i <= FizzBuzz.MAX; i++) {
            if (i - i / FizzBuzz.BASE * FizzBuzz.BASE == FizzBuzz.FIVE) {
                assertEquals("i=" + i, true, fizzBuzz.has5In(i));
            } else if (i / FizzBuzz.BASE == FizzBuzz.FIVE) {
                assertEquals(true, fizzBuzz.has5In(i));
            } else {
                assertEquals(false, fizzBuzz.has5In(i));
            }
        }
    }

    @Test
    public void printFizzBuzzStage1() {
        fizzBuzz.printFizzBuzz1(FizzBuzz.MAX);
    }

    @Test
    public void printFizzBuzzStage2() {
        fizzBuzz.printFizzBuzz2(FizzBuzz.MAX);
    }

}
