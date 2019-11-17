package by.javatr.task3.util;

import by.javatr.validator.Validator;

public class Square {

    private double parentAreaSquare;
    private double area;

    public Square(double parentArea) throws IllegalArgumentException {
        if (!Validator.validatePositiveDouble(parentArea)) {
            throw new IllegalArgumentException("The number have to be positive");
        }
        this.parentAreaSquare = parentArea;
    }

    public double getParentAreaSquare() {
        return parentAreaSquare;
    }

    public double getArea() {
        return area;
    }

    public double calculateAreaSquare() {

        return area = parentAreaSquare / 2;
    }

    public double ratioOfAreas() {
        return parentAreaSquare / area;
    }


}




