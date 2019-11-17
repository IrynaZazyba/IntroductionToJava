package by.javatr.task5.util;

public class NumberDetector {

    int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public boolean isNumberPerfect() {

        int sum = 0;
        for (int i = 1; i <a; i++) {
            if (a % i == 0) {
                sum +=i;
            }
        }

        return sum== a;
    }

}
