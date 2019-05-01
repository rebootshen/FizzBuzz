package com.cg;

/**
 * Main App !
 */
public final class App {
    private App() {
    }

    /**
     * .
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.printFizzBuzz1(FizzBuzz.MAX);
        fizzBuzz.printFizzBuzz2(FizzBuzz.MAX);
    }

}
