package by.javatr.task4.util;

public class NumericHelper {

    int array[];

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public boolean hasTwoEvenNumbers() {
        int count = 0;
        if (array == null) {
            System.out.println("Изменить");
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    count++;
                }
            }
        }

        return count>=2;
    }

}
