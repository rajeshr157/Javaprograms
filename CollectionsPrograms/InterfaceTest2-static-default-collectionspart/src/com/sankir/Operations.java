package com.sankir;

// A class extends one class only but implements multile interfaces
public class Operations extends Factorial implements Utility, ConvertString {

  //Abstract method of Utility
  public int sum(int a, int b){

    return a+b;
  }

  //Abstract method of Utility
  public int diff(int a, int b){

    return a-b;
  }

  //Abstract method of COnvertString
  public String convert(String s, char ch){

    if(ch =='U')
      return s.toUpperCase();
    else if (ch =='L')
      return s.toLowerCase();
    else
      return ("Can't convert");


  }

  // abstract method in powerofUtility
  public double tothepowerof(double n, double p) {

    double res = Math.pow(n,p);

    return res;
  }
}
