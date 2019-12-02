package by.javatr.task4.util;


public class NumericHelper {


    public static boolean hasTwoEvenNumbers(int ... v) {

        int count = 0;

        for (int i = 0; i <v.length; i++) {
            if (v[i] % 2 == 0) {
                count++;
            }
        }

        return count >= 2;
    }

}
