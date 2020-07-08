package com.sankir;

public class Main {
    public static void main(String[] args) {

        int a = 2;
        int b = 5;
        int n = 7;

        Operations op = new Operations();

        System.out.println();
        System.out.println("The sum is: " + op.sum(a, b));

        System.out.println();
        System.out.println("The difference is: " + op.diff(a, b));

        System.out.println();
        System.out.println("The product is: " + op.product(a, b));

        System.out.println();
        System.out.println("The factorial is: " + op.getFactorial(b));

        System.out.println();
        System.out.println("The square is: " + Mathutilities.square(n));

        System.out.println();
        System.out.println("The cube is: "+ Mathutilities.cube(a));

        System.out.println();
        System.out.println("To the power of: " + Mathutilities.toThePower(a,b));


    }
}
