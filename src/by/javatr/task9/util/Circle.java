package by.javatr.task9.util;

import by.javatr.validator.Validator;

import java.util.Objects;

public class Circle {

    private double radius;

    public Circle(double radius) throws IllegalArgumentException {
        if (!Validator.validatePositiveDouble(radius)) {
            throw new IllegalArgumentException("Only positive numbers");
        }
        this.radius = radius;
    }

    public double calculateСircumference() {
        return 2 * Math.PI * radius;
    }

    public double circleArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        final int prime =31;
        int result=1;
        result=prime*result+Double.valueOf(radius).hashCode();
        return result;
    }
}
