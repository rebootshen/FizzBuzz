package com.cg;

public class FizzBuzz {

    public void printFizzBuzz(int max) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= max; i++) {
            sb.setLength(0);
            // System.out.println(i);
            if (isDivisableBy3(i) || has3In(i))
                sb.append("Fizz");
            if (isDivisableBy5(i) || has5In(i))
                sb.append("Buzz");
            if (sb.length() == 0) {
                System.out.println(i + ": " + i);
            } else {
                System.out.println(i + ": " + sb.toString());
            }
        }
    }

    boolean isDivisableBy3(int num) {
        if ((num % 3) == 0)
            return true;
        else
            return false;
    }

    boolean isDivisableBy5(int num) {
        if ((num % 5) == 0)
            return true;
        else
            return false;
    }

    boolean has3In(int num) {
        int digit = 0;
        while (num != 0) {
            digit = num % 10;
            num /= 10;

            if (3 == digit)
                return true;
        }
        return false;
    }

    boolean has5In(int num) {
        int digit = 0;
        while (num != 0) {
            digit = num % 10;
            num /= 10;

            if (5 == digit)
                return true;
        }
        return false;
    }

}