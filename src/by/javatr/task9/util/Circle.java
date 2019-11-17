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
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Circle other = (Circle) obj;
        if (radius != other.radius)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Double.valueOf(radius).hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Circle [" + "radius=" + radius +']';
    }
}
