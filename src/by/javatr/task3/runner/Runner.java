package by.javatr.task3.runner;

import by.javatr.scanner.DataScanner;
import by.javatr.task3.util.Square;

public class Runner {

    public static void main(String[] args) {

        double d=0.0;
        System.out.println("Введите площадь квадрата: ");

        d= DataScanner.enterPositiveDoubleFromConsole();

        Square sq=new Square(d);
        System.out.println(sq);


        System.out.println("Площадь вписанного квадрата: "+ sq.calculateAreaSquare());
        System.out.println("Отношение родительского квадрата к дочернему: "+sq.ratioOfAreas());



    }
}
