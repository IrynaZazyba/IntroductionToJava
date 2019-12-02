package by.javatr.task6.runner;

import by.javatr.exception.NotPositiveNumberException;
import by.javatr.scanner.DataScanner;
import by.javatr.task6.util.SecondOfTheDay;
import by.javatr.task6.util.TimeConvertorService;

/**
 * Идет n-я секунда суток, определить,
 * сколько полных часов, полных минут
 * и секунд прошло к этому моменту.
 */
public class Runner {

    public static void main(String[] args) {

        int seconds;
        System.out.println("Введите число: ");
        seconds = DataScanner.enterIntFromConsole();

        try {
            SecondOfTheDay secondOfTheDay = new SecondOfTheDay(seconds);
            System.out.println("К данному моменту прошло: " + String.format("%02dч:%02dмин:%02dс",
                    +TimeConvertorService.getHour(secondOfTheDay),
                    +TimeConvertorService.getMinute(secondOfTheDay),
                    +TimeConvertorService.getSecond(secondOfTheDay)));

        } catch (NotPositiveNumberException ex) {
            System.out.println(ex.getMessage());

        }

    }
}
