package com.dgraciac.fizzbuzz;

public class FizzBuzz {
    public String compute(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }
        return "Fizz";
    }
}
