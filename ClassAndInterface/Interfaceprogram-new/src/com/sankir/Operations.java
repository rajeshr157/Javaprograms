package com.sankir;

public class Operations extends Factorial implements Utility, MathUtility {

    public int sum(int a, int b) {

        return a + b;
    }

    public int square(int n) {

        return n * n;
    }

    public  int cb(int n) {

        return n*n*n;
    }
}
