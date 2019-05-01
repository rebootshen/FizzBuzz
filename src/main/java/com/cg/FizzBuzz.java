package com.cg;

/**
 * . Interview test
 */
public class FizzBuzz {
    /**
     * .
     */
    public static final int THREE = 3;
    /**
     * .
     */
    public static final int FIVE = 5;
    /**
     * .
     */
    public static final int BASE = 10;
    /**
     * .
     */
    public static final int MAX = 100;

    /**
     * .
     * @param max
     */
    public void printFizzBuzz1(int max) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= max; i++) {
            sb.setLength(0);
            // System.out.println(i);
            if (isDivisableBy3(i)) {
                sb.append("Fizz");
            }

            if (isDivisableBy5(i)) {
                sb.append("Buzz");
            }

            if (sb.length() == 0) {
                System.out.println(i + ": " + i);
            } else {
                System.out.println(i + ": " + sb.toString());
            }
        }
    }

    /**
     * .
     * @param max
     */
    public void printFizzBuzz2(int max) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= max; i++) {
            sb.setLength(0);
            // System.out.println(i);
            if (isDivisableBy3(i) || has3In(i)) {
                sb.append("Fizz");
            }

            if (isDivisableBy5(i) || has5In(i)) {
                sb.append("Buzz");
            }

            if (sb.length() == 0) {
                System.out.println(i + ": " + i);
            } else {
                System.out.println(i + ": " + sb.toString());
            }
        }
    }

    boolean isDivisableBy3(int num) {
        return (num % THREE) == 0;
    }

    /**
     * .
     * @param num
     * @return
     */
    boolean isDivisableBy5(int num) {
        return (num % FIVE) == 0;
    }

    /**
     * .
     * @param number
     * @return
     */
    boolean has3In(int number) {
        int digit = 0;
        int num = number;
        while (num != 0) {
            digit = num % BASE;
            num /= BASE;

            if (THREE == digit) {
                return true;
            }
        }
        return false;
    }

    /**
     * .
     * @param number
     * @return
     */
    boolean has5In(int number) {
        int digit = 0;
        int num = number;
        while (num != 0) {
            digit = num % BASE;
            num /= BASE;

            if (FIVE == digit) {
                return true;
            }

        }
        return false;
    }
}
