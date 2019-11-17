package by.javatr.task6.runner;

import by.javatr.exception.NumberSecondsInDayException;
import by.javatr.scanner.DataScanner;
import by.javatr.task6.util.TimeConvertor;

/**
 * Идет n-я секунда суток, определить,
 * сколько полных часов, полных минут
 * и секунд прошло к этому моменту.
 */

public class Runner {

    public static void main(String[] args) {

        int a;
        System.out.println("Введите число: ");
        a = DataScanner.enterIntFromConsole();

        try {
            TimeConvertor tc = new TimeConvertor(a);
            System.out.println("К данному моменту прошло: " + String.format("%02dч:%02dмин:%02dс", tc.getHour(), tc.getMinute(), tc.getSecond()));

        } catch (NumberSecondsInDayException ex) {
            System.out.println(ex.getMessage());

        }

    }
}
