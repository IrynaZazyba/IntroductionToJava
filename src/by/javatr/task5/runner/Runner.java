package by.javatr.task5.runner;

import by.javatr.scanner.DataScanner;
import by.javatr.task5.util.NumberDetector;

public class Runner {

    public static void main(String[] args) {

        int a;
        System.out.println("Введите число: ");
        a = DataScanner.enterIntFromConsole();


        NumberDetector nd=new NumberDetector();
        nd.setA(a);
        System.out.println("Является ли число совершенным: "+nd.isNumberPerfect());


    }
}
