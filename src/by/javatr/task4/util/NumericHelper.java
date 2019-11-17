package by.javatr.task4.util;


public class NumericHelper {

    int array[];

    public NumericHelper(int arr[]) {
        this.array = arr;

    }

    public int[] getArray() {
        return array;
    }

    public boolean hasTwoEvenNumbers() {

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }

        return count >= 2;
    }

}
