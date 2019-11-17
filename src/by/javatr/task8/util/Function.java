package by.javatr.task8.util;

public class Function {

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

    public static double[][] calculateFanctionWithStep(double a, double b, double h) {

        int numberOfStep;
        numberOfStep = (int) ((b - a) / h) + 1;
        double[][] array = new double[numberOfStep][2];

        int row = 0;
        int countOfStep=0;
        while (countOfStep<numberOfStep) {
            int column = 0;
            array[row][column] = a;
            array[row][++column] = Math.tan(a);
            row++;
            a+=h;
            countOfStep++;
        }

        return array;
    }
}
