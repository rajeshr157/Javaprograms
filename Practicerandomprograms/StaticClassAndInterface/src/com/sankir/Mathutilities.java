package com.sankir;

public interface Mathutilities {

    static double toThePower(double a, double b) {
        return Math.pow(a, b);
    }

    static int square(int n) {
        return n * n;
    }

    static int cube(int n) {
        return n * n * n;
    }
}
