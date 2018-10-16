package com.dgraciac.fizzbuzz;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzShould {
    @Test
    public void produce_Fizz_when_number_is_divisible_by_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String fizz = "Fizz";
        assertThat(fizzBuzz.compute(3)).isEqualTo(fizz);
        assertThat(fizzBuzz.compute(6)).isEqualTo(fizz);
        assertThat(fizzBuzz.compute(9)).isEqualTo(fizz);
        assertThat(fizzBuzz.compute(9999999)).isEqualTo(fizz);
    }

    @Test
    public void produce_Buzz_when_numner_is_divisible_by_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String buzz = "Buzz";
        assertThat(fizzBuzz.compute(5)).isEqualTo(buzz);
        assertThat(fizzBuzz.compute(10)).isEqualTo(buzz);
        assertThat(fizzBuzz.compute(20)).isEqualTo(buzz);
        assertThat(fizzBuzz.compute(9995)).isEqualTo(buzz);
    }

    @Test
    public void produce_FizzBuzz_when_number_is_divisible_by_3_and_5() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertThat(fizzbuzz.compute(15)).isEqualTo("FizzBuzz");
    }
}
