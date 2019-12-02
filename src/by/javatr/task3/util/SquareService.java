package by.javatr.task3.util;

import by.javatr.exception.NegativeAreaException;
import by.javatr.validator.Validator;

public class SquareService {

    public static double calculateAreaSquare(double area) throws NegativeAreaException {
        if (Validator.validatePositiveDouble(area)) {
            return area / 2;
        } else {
            throw new NegativeAreaException("Area should be positive number");
        }
    }

    public static double ratioOfAreas(double area, double inscribedSquareArea) throws NegativeAreaException {
        if (Validator.validatePositiveDouble(area)&&Validator.validatePositiveDouble(inscribedSquareArea)) {
            return area/inscribedSquareArea;
        } else {
            throw new NegativeAreaException("Area should be positive number");
        }
    }


}
