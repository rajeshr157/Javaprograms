package com.sankir;

public interface Utility extends PowerofUtility{

  //method with signature only - abstarct

  public int sum(int a, int b);
  public int diff(int a, int b);

  // if prefixed with default keyword - body can be put - at class level
  default public int product(int a, int b) {
    return a * b;

  }


}