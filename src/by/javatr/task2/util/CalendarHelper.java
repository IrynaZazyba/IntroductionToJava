package by.javatr.task2.util;

import by.javatr.scanner.DataScanner;
import java.util.GregorianCalendar;

public class CalendarHelper {

    public static int enterMonthFromConsole() {

        int month = 0;

        do {
            month = DataScanner.enterIntFromConsole();

        } while (month > 12 || month < 1);

        return month;
    }

    public static int enterYearFromConsole() {
        int year = 0;

        do {
            year = DataScanner.enterIntFromConsole();

        } while (year < 0);

        return year;
    }

    public static int countOfDay(int year, int month) {

        GregorianCalendar gc = new GregorianCalendar();

        if (gc.isLeapYear(year) & month == 2) {
            return 29;
        } else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 10:
                case 12:
                    return 31;
                case 2:
                    return 28;
                case 4:
                case 6:
                case 8:
                case 9:
                case 11:
                    return 30;
                default:
                    break;
            }

            return 0;
        }
    }


}
