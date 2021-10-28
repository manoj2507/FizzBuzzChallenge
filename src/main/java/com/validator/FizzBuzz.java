package com.validator;

import com.constants.FizzBuzzConstants;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public  List<String> display(int count) {
        List<String> list = new ArrayList<>();
        for (int num = 1; num <= count; num++) {
            list.add(evaluate(num));
        }
        return list;
    }

    public String evaluate(int num ) {
        if (isMultipleOf3(num) && isMultipleOf5(num)) {
            return FizzBuzzConstants.FIZZBUZZ;
        }
        if (isMultipleOf3(num)) {
            return FizzBuzzConstants.FIZZ;
        }

        if (isMultipleOf5(num)) {
            return FizzBuzzConstants.BUZZ;
        }

        return String.valueOf(num);
    }


    private boolean isMultipleOf5(int number) {
        return number % 5 == 0;
    }

    private boolean isMultipleOf3(int number) {
        return number % 3 == 0;
    }
}
