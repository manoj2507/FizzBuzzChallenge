package com.test;

import com.constants.FizzBuzzConstants;
import com.validator.FizzBuzz;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;


public class FizzBuzzTestNGTests {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @BeforeClass
    public void display_list_after_fizzbuzz_logic_applied() {
        System.out.print(fizzBuzz.display().toString());
    }

    @Test(description = "Validate FizzBuzz is returned for the number provided")
    public void fizzbuzz_shouldReturn_FIZZBUZZ_if_number_is_divisible_by_3_and_divisible_by_5() {
        assertEquals(FizzBuzzConstants.FIZZBUZZ, fizzBuzz.evaluate(15));
        assertEquals(FizzBuzzConstants.FIZZBUZZ, fizzBuzz.evaluate(30));
        assertEquals(FizzBuzzConstants.FIZZBUZZ, fizzBuzz.evaluate(75));
    }

    @Test(description = "Validate Fizz is returned for the number provided")
    public void fizzbuzz_shouldReturn_FIZZ_if_number_is_divisible_by_3() {
        assertEquals(FizzBuzzConstants.FIZZ, fizzBuzz.evaluate(3));
        assertEquals(FizzBuzzConstants.FIZZ, fizzBuzz.evaluate(36));
        assertEquals(FizzBuzzConstants.FIZZ, fizzBuzz.evaluate(72));
    }

    @Test(description = "Validate Buzz is returned for the number provided")
    public void fizzbuzz_shouldReturn_BUZZ_if_number_is_divisible_by_5() {
        assertEquals(FizzBuzzConstants.BUZZ, fizzBuzz.evaluate(10));
        assertEquals(FizzBuzzConstants.BUZZ, fizzBuzz.evaluate(40));
        assertEquals(FizzBuzzConstants.BUZZ, fizzBuzz.evaluate(95));
    }

    @Test(description = "Validate number is returned for the input")
    public void fizzbuzz_shouldReturn_Number_if_number_is_neither_divisible_by_3_or_5_or_both() {
        assertEquals("1", fizzBuzz.evaluate(1));
        assertEquals("43", fizzBuzz.evaluate(43));
        assertEquals("91", fizzBuzz.evaluate(91));
    }

}

