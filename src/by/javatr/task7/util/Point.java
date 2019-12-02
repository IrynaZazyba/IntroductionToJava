package by.javatr.task7.util;

public class Point {

    private double coordinateX;
    private double coordinateY;

    public Point(){
    this.coordinateX=1;
    this.coordinateY=1;
    }

    public Point(double coordinateX, double coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public double getCoordinateX() {
        return coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Point other = (Point) obj;
        if (coordinateX != other.coordinateX)
            return false;
        if (coordinateY != other.coordinateY)
            return false;
        return true;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Double.valueOf(coordinateX).hashCode();
        result = prime * result + Double.valueOf(coordinateY).hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Point[ coordinateX=" + coordinateX + ", coordinateY=" + coordinateY + ']';
    }
}

