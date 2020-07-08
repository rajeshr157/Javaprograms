package com.sankir;

public interface Utilities {

    public int sum (int a, int b);

    public int diff  (int a, int b);

    default public int product (int a, int b){
        return a*b;
    }
}
