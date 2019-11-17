package by.javatr.task10.util;

import by.javatr.validator.Validator;

public class LineSegment {

    private double startPoint;
    private double endPoint;
    private double step;


    public LineSegment(double startPoint, double endPoint, double step) throws IllegalArgumentException {
        if (!Validator.validateLineSegmentExist(startPoint, endPoint)) {
            throw new IllegalArgumentException("Such line segment does not exist");
        }

        if (!Validator.validatePositiveDouble(step)) {
            throw new IllegalArgumentException("Step should be positive number");
        }

        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.step = step;
    }

    public double getStartPoint() {
        return startPoint;
    }

    public double getEndPoint() {
        return endPoint;
    }

    public double getStep() {
        return step;
    }
}
