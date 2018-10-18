package com.dgraciac.fizzbuzz;

public class FizzBuzzPrinter {
    public void print() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int i = 1; i < 101; i++) {
            System.out.println(fizzBuzz.compute(i));
        }
    }
}
