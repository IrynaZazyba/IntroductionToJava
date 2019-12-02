package by.javatr.task10.util;

import by.javatr.exception.NoSuchLineSegmentExistException;
import by.javatr.validator.Validator;

public class LineSegment {

    private double startPoint;
    private double endPoint;

    public LineSegment() {
        this.startPoint = 0;
        this.endPoint = 1;
    }

    public LineSegment(double startPoint, double endPoint) throws NoSuchLineSegmentExistException {
        if (!Validator.validateLineSegmentExist(startPoint, endPoint)) {
            throw new NoSuchLineSegmentExistException("Such line segment does not exist");
        }
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public void setStartPoint(double startPoint) throws NoSuchLineSegmentExistException {
        if (!Validator.validateLineSegmentExist(startPoint, this.endPoint)) {
            throw new NoSuchLineSegmentExistException("Such line segment does not exist");
        }

        this.startPoint = startPoint;
    }

    public void setEndPoint(double endPoint) throws NoSuchLineSegmentExistException {
        if (!Validator.validateLineSegmentExist(this.startPoint, endPoint)) {
            throw new NoSuchLineSegmentExistException("Such line segment does not exist");
        }

        this.endPoint = endPoint;
    }

    public double getStartPoint() {
        return startPoint;
    }

    public double getEndPoint() {
        return endPoint;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LineSegment other = (LineSegment) obj;
        if (startPoint != other.startPoint)
            return false;
        if (endPoint != other.endPoint)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Double.valueOf(startPoint).hashCode();
        result = prime * result + Double.valueOf(endPoint).hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "LineSegment [startPoint=" + startPoint + ", endPoint=" + endPoint + "]";
    }
}
