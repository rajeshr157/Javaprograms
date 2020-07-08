package com.sankir;

public class Factorial {

    public int getFactorial(int n) {
        int fact = 1;

        while ((n > 1)) {
            fact *= n;
            n--;
        }
        return fact;
    }
}
