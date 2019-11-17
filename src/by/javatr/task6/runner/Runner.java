package by.javatr.task6.runner;

import by.javatr.exeption.NumberSecondsInDayException;
import by.javatr.scanner.DataScanner;
import by.javatr.task6.util.TimeConvertor;

public class Runner {

    public static void main(String[] args) {

        int a;
        System.out.println("Введите число: ");
        a = DataScanner.enterIntFromConsole();

        try {
            TimeConvertor tc=new TimeConvertor(a);
            System.out.println("К данному моменту прошло: "+String.format("%02dч:%02dмин:%02dс", tc.getHour(), tc.getMinute(), tc.getSecond()));

        } catch (NumberSecondsInDayException ex){
            System.out.println(ex.getMessage());

        }

    }
}
