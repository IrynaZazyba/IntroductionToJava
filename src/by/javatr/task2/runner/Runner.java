package by.javatr.task2.runner;

import by.javatr.scanner.DataScanner;
import by.javatr.task2.util.CalendarHelper;

/**
 * Составить программу, которая по заданным году и
 * номеру месяца определяет количество дней в этом
 * месяце и корректно определялись все високосные года.
 */

public class Runner {

    public static void main(String[] args) {
        int year;
        System.out.println("Введите год: ");
        year = DataScanner.enterIntFromConsole();

        int month;
        System.out.println("Введите месяц: ");
        month = DataScanner.enterIntFromConsole();

        try {
            int countOfDay = CalendarHelper.countOfDay(year, month);
            System.out.println("Количество дней в " + month + " месяце " + year + " года: " + countOfDay);

        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
