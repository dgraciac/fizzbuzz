package com.dgraciac.fizzbuzz;

class FizzBuzz {
    String compute(int number) {
        StringBuilder stringBuilder = new StringBuilder();

        if (number % 3 == 0) stringBuilder.append("Fizz");
        if (number % 5 == 0) stringBuilder.append("Buzz");

        if (number % 3 == 0 || number % 5 == 0) return stringBuilder.toString();
        return String.valueOf(number);
    }
}
