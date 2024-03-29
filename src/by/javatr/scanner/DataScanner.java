package by.javatr.scanner;

import java.util.Scanner;

public class DataScanner {

    @SuppressWarnings("resource")
    public static int enterIntFromConsole() {
        Scanner sc = new Scanner(System.in);

        int a = 0;

        while (!sc.hasNextInt()) {
            sc.next();
        }

        a = sc.nextInt();

        return a;
    }

    @SuppressWarnings("resource")
    public static double enterDoubleFromConsole() {
        Scanner sc = new Scanner(System.in);

        double b = 0;

        while (!sc.hasNextDouble()) {
            sc.next();
        }

        b = sc.nextDouble();

        return b;
    }


}
