package by.javatr.task2.util;

import by.javatr.validator.Validator;
import java.util.GregorianCalendar;

public class CalendarHelper {

    public static int countOfDay(int year, int month) throws IllegalArgumentException {

        if (!Validator.validateCountMonth(month)) {
            throw new IllegalArgumentException("Month number is incorrect");
        }

        if (!Validator.validateIsYearExist(year)) {
            throw new IllegalArgumentException("Year is incorrect");
        }

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
