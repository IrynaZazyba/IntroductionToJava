package by.javatr.task8.util;

import by.javatr.task10.util.LineSegment;

public class Function {

    final static int NUMBER_OF_COLLUMN = 2;

    /**
     * Вычисляет значение функции F(x)
     * при x>=3  ->   -(x*x)+3*x+9
     * при x<3   ->   1/((x*x*x)-6)
     */

    public static double calculateFunction(double x) {

        return x >= 3 ? -Math.pow(x, 2) + 3 * x + 9 : 1 / (Math.pow(x, 3) - 6);
    }


    /**
     * Вычисляет значение функции F(x)=tg(x)
     * на отрезке [a,b] с шагом h
     */

    public static double[][] calculateFanctionWithStep(LineSegment ls) {

        double startPoint = ls.getStartPoint();
        double endPoint = ls.getEndPoint();
        double step = ls.getStep();

        int numberOfStep;
        numberOfStep = (int) ((endPoint - startPoint) / step) + 1;
        double[][] array = new double[numberOfStep][NUMBER_OF_COLLUMN];

        int row = 0;
        int countOfStep = 0;
        while (countOfStep < numberOfStep) {
            int column = 0;
            array[row][column] = startPoint;
            array[row][++column] = Math.tan(startPoint);
            row++;
            startPoint += step;
            countOfStep++;
        }

        return array;
    }
}
