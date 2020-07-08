package com.sankir;

public class InterfaceMain {

  public static void main(String[] args) {

    Operations op = new Operations();

    // abstract method in Utility class but implemented in Operations class
    int res = op.sum(10,20);
    System.out.println("The sum is :" + res);

    // abstract method in Utility class but implemented in Operations class
    int df = op.diff(100,10);
    System.out.println("The diff is :" + df);

    // abstract method in PowerofUtility class but implemented in Operations class
    double pf = op.tothepowerof(10.0,3.0);
    System.out.println("The tothe powerof is :" + df);

    // abstract method in ConvertString class but implemented in Operations class
    String cs = op.convert("SanKir", 'U');
    System.out.println("The converted string is :" + cs);


    // default method in Utlity Class
    int pd = op.product(5, 10);
    System.out.println("The product is :" + pd);

    // Factorial class
    // another class method which operations class 'extends'
    int fact = op.getFactorial(5);
    System.out.println("The factorial is :" + fact);

    // this is not related to Operations class
    // Mathtiltiy has only sattic methods . So all methods can be referred at Interface level.
    int sq = Mathutility.square(5);
    System.out.println("The square is :" + sq);

    int cb = Mathutility.cube(5);
    System.out.println("The cube is :" + cb);



  }
}
