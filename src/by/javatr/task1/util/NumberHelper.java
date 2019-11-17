package by.javatr.task1.util;

public class NumberHelper {

    public static int getLastDigit(int number) {
        return number % 10;
    }

    public static int findLastNumberOfSquared(int digit) {

        switch (digit) {
            case 0:
                return 0;
            case 1:
            case 9:
                return 1;
            case 2:
            case 8:
                return 4;
            case 3:
            case 7:
                return 9;
            case 4:
            case 6:
                return 6;
            case 5:
                return 5;
            default:
                break;
        }

        return 0;
    }
}
