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
        System.out.print(fizzBuzz.display(100).toString());
    }

    @Test(description = "Validate FizzBuzz is returned for the number provided")
    public void fizzbuzz_shouldReturn_FIZZBUZZ_if_number_is_divisible_by_3_and_divisible_by_5() {
        assertEquals(fizzBuzz.evaluate(15),FizzBuzzConstants.FIZZBUZZ);
        assertEquals(fizzBuzz.evaluate(30),FizzBuzzConstants.FIZZBUZZ);
        assertEquals(fizzBuzz.evaluate(75),FizzBuzzConstants.FIZZBUZZ);
    }

    @Test(description = "Validate Fizz is returned for the number provided")
    public void fizzbuzz_shouldReturn_FIZZ_if_number_is_divisible_by_3() {
        assertEquals(fizzBuzz.evaluate(3),FizzBuzzConstants.FIZZ);
        assertEquals(fizzBuzz.evaluate(36),FizzBuzzConstants.FIZZ);
        assertEquals(fizzBuzz.evaluate(72),FizzBuzzConstants.FIZZ);
    }

    @Test(description = "Validate Buzz is returned for the number provided")
    public void fizzbuzz_shouldReturn_BUZZ_if_number_is_divisible_by_5() {
        assertEquals(fizzBuzz.evaluate(10),FizzBuzzConstants.BUZZ);
        assertEquals(fizzBuzz.evaluate(40),FizzBuzzConstants.BUZZ);
        assertEquals(fizzBuzz.evaluate(95),FizzBuzzConstants.BUZZ);
    }

    @Test(description = "Validate number is returned for the input")
    public void fizzbuzz_shouldReturn_Number_if_number_is_neither_divisible_by_3_or_5_or_both() {
        assertEquals(fizzBuzz.evaluate(1),"1");
        assertEquals(fizzBuzz.evaluate(43),"43");
        assertEquals(fizzBuzz.evaluate(91),"91");
    }

}

