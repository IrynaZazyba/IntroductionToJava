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
            throw new IllegalArgumentException("Step have to be positive number");
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


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        LineSegment other = (LineSegment) obj;
        if(startPoint!=other.startPoint)
            return false;
        if(endPoint!=other.endPoint)
            return false;
        if(step!=other.step)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Double.valueOf(startPoint).hashCode();
        result = prime * result + Double.valueOf(endPoint).hashCode();
        result = prime * result + Double.valueOf(step).hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "LineSegment [startPoint=" + startPoint + ", endPoint=" + endPoint + ", step=" + step + ']';
    }
}
