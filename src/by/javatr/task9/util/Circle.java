package by.javatr.task9.util;

import by.javatr.exception.NotPositiveNumberException;
import by.javatr.validator.Validator;

public class Circle implements Area {

    private double radius;

    public Circle() {
        radius = 1;
    }

    public Circle(double radius) throws NotPositiveNumberException {
        if (!Validator.validatePositiveDouble(radius)) {
            throw new NotPositiveNumberException("Only positive numbers");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
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
        return "Circle [" + "radius=" + radius + ']';
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
