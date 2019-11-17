package by.javatr.task10.printer;

/**
 * Класс, реализующий вывод на печать таблицы для Task 10.
 */

public class ArrayPrinter {

    public static void printMultidimensionalArray(double array[][]){

        System.out.println("-----------------------------------------");
        System.out.println("| Значение аргумента | Значение функции |");
        System.out.println("-----------------------------------------");


        for(int i=0;i<array.length;i++) {
            int j=0;
                System.out.printf("|%19.2f |%17.2f |",array[i][j],array[i][j+1]);
            System.out.println();

        }
        System.out.println("-----------------------------------------");


    }

}
