package by.javatr.task5.util;

import by.javatr.validator.Validator;

public class NumberDetector {


    public static boolean isNumberPerfect(int param) throws IllegalArgumentException {

        if(!Validator.validatePositiveInteger(param)){
            throw new IllegalArgumentException("Entered number have to be positive");
        }

        int sum = 0;
        for (int i = 1; i <param; i++) {
            if (param % i == 0) {
                sum +=i;
            }
        }

        return sum== param;
    }

}
