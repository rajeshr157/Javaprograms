package com.sankir;

public interface Utility {

    //Method with signature only
    public int square(int n);

    //is prefixed with default keyword- body can be put
    default  public  int product(int a , int b){
        return a*b;
    }
}
