package by.javatr.task10.util;

import by.javatr.exception.NotPositiveNumberException;
import by.javatr.validator.Validator;

public class FunctionService {

    final static int NUMBER_OF_COLLUMN = 2;

    /**
     * Вычисляет значение функции F(x)=tg(x)
     * на отрезке [a,b] с шагом h
     */

    public static double[][] calculateFunctionWithStep(LineSegment ls, double step) throws NotPositiveNumberException{

        if(!Validator.validatePositiveDouble(step)){
            throw new NotPositiveNumberException("Entered number have to be positive");
        }

        double startPoint = ls.getStartPoint();
        double endPoint = ls.getEndPoint();

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
