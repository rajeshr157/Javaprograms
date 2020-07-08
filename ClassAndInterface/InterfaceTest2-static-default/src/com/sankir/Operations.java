package com.sankir;

// A class extends one class only but implements multile interfaces
public class Operations extends Factorial implements Utility, PowerofUtility {

  //method of this class
  public int sum(int a, int b){

    return a+b;
  }

  //method of this class
  public int diff(int a, int b){

    return a-b;
  }


  public double tothepowerof(double n, double p) {

    double res = Math.pow(n,p);

    return res;
  }
}
