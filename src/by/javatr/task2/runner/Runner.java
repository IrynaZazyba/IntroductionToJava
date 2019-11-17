package by.javatr.task2.runner;

import by.javatr.task2.util.CalendarHelper;


public class Runner {

    public static void main(String[] args) {
        int year;
        System.out.println("Введите год: ");
        year = CalendarHelper.enterYearFromConsole();

        int month;
        System.out.println("Введите месяц: ");
        month = CalendarHelper.enterMonthFromConsole();

        int countOfDay = CalendarHelper.countOfDay(year, month);
        System.out.println("Количество дней в "+month+" месяце "+year+" года: "+countOfDay);

    }
}
