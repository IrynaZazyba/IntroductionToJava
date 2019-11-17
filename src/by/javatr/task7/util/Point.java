package by.javatr.task7.util;

public class Point {

    private double coordinateX;
    private double coordinateY;

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

    public double distanceToOrigin() {

        return Math.sqrt(Math.pow(coordinateX, 2) + Math.pow(coordinateY, 2));
    }



}
