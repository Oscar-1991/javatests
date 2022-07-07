package com.platzi.javatests.fizzbuzz;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz_test;
    @Before
    public void setup(){
        fizzBuzz_test = new FizzBuzz();
    }
    @Test
    public void set_number() {
        assertThat(fizzBuzz_test.fizzBuzz(3), is("Fizz"));
        assertThat(fizzBuzz_test.fizzBuzz(6), is("Fizz"));
        assertThat(fizzBuzz_test.fizzBuzz(5), is("Buzz"));
        assertThat(fizzBuzz_test.fizzBuzz(10), is("Buzz"));
        assertThat(fizzBuzz_test.fizzBuzz(15), is("FizzBuzz"));
        assertThat(fizzBuzz_test.fizzBuzz(30), is("FizzBuzz"));
        assertThat(fizzBuzz_test.fizzBuzz(2), is("2"));
        assertThat(fizzBuzz_test.fizzBuzz(16), is("16"));
    }
}