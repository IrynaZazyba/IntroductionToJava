package by.javatr.task8.util;

public class FunctionService {

    /**
     * Вычисляет значение функции F(x)
     * при x>=3  ->   -(x*x)+3*x+9
     * при x<3   ->   1/((x*x*x)-6)
     */

    public static double calculateFunction(double x) {

        return (x >= 3) ? (-Math.pow(x, 2) + 3 * x + 9 ): 1 / (Math.pow(x, 3) - 6);
    }

}
