package com.sankir;

public class Operations extends Factorial implements Utilities, Mathutilities {

    public int sum(int a, int b){
        return a+b;
    }

    public int diff(int a, int b) {
        return Math.abs(a-b);
    }

}
