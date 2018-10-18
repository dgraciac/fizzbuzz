package com.dgraciac.fizzbuzz;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzPrinterShould {
    private static final String EXPECTED_OUTPUT = "1\r\n" +
            "2\r\n" +
            "Fizz\r\n" +
            "4\r\n" +
            "Buzz\r\n" +
            "Fizz\r\n" +
            "7\r\n" +
            "8\r\n" +
            "Fizz\r\n" +
            "Buzz\r\n" +
            "11\r\n" +
            "Fizz\r\n" +
            "13\r\n" +
            "14\r\n" +
            "FizzBuzz\r\n" +
            "16\r\n" +
            "17\r\n" +
            "Fizz\r\n" +
            "19\r\n" +
            "Buzz\r\n" +
            "Fizz\r\n" +
            "22\r\n" +
            "23\r\n" +
            "Fizz\r\n" +
            "Buzz\r\n" +
            "26\r\n" +
            "Fizz\r\n" +
            "28\r\n" +
            "29\r\n" +
            "FizzBuzz\r\n" +
            "31\r\n" +
            "32\r\n" +
            "Fizz\r\n" +
            "34\r\n" +
            "Buzz\r\n" +
            "Fizz\r\n" +
            "37\r\n" +
            "38\r\n" +
            "Fizz\r\n" +
            "Buzz\r\n" +
            "41\r\n" +
            "Fizz\r\n" +
            "43\r\n" +
            "44\r\n" +
            "FizzBuzz\r\n" +
            "46\r\n" +
            "47\r\n" +
            "Fizz\r\n" +
            "49\r\n" +
            "Buzz\r\n" +
            "Fizz\r\n" +
            "52\r\n" +
            "53\r\n" +
            "Fizz\r\n" +
            "Buzz\r\n" +
            "56\r\n" +
            "Fizz\r\n" +
            "58\r\n" +
            "59\r\n" +
            "FizzBuzz\r\n" +
            "61\r\n" +
            "62\r\n" +
            "Fizz\r\n" +
            "64\r\n" +
            "Buzz\r\n" +
            "Fizz\r\n" +
            "67\r\n" +
            "68\r\n" +
            "Fizz\r\n" +
            "Buzz\r\n" +
            "71\r\n" +
            "Fizz\r\n" +
            "73\r\n" +
            "74\r\n" +
            "FizzBuzz\r\n" +
            "76\r\n" +
            "77\r\n" +
            "Fizz\r\n" +
            "79\r\n" +
            "Buzz\r\n" +
            "Fizz\r\n" +
            "82\r\n" +
            "83\r\n" +
            "Fizz\r\n" +
            "Buzz\r\n" +
            "86\r\n" +
            "Fizz\r\n" +
            "88\r\n" +
            "89\r\n" +
            "FizzBuzz\r\n" +
            "91\r\n" +
            "92\r\n" +
            "Fizz\r\n" +
            "94\r\n" +
            "Buzz\r\n" +
            "Fizz\r\n" +
            "97\r\n" +
            "98\r\n" +
            "Fizz\r\n" +
            "Buzz\r\n";
    private PrintStream oldPrintStream;
    private PrintStream newPrintStream;
    private ByteArrayOutputStream byteArrayOutputStream;

    @Before
    public void setUp() {
        oldPrintStream = System.out;
        byteArrayOutputStream = new ByteArrayOutputStream();
        newPrintStream = new PrintStream(byteArrayOutputStream);
        System.setOut(newPrintStream);
    }

    @After
    public void tearDown() {
        System.out.flush();
        System.setOut(oldPrintStream);
    }

    @Test
    public void print_first_one_hundred_integers_according_FizzBuzz_behaviour() {
        FizzBuzzPrinter fizzBuzzPrinter = new FizzBuzzPrinter();

        fizzBuzzPrinter.print();

        assertThat(byteArrayOutputStream.toString()).isEqualTo(EXPECTED_OUTPUT);
    }
}
